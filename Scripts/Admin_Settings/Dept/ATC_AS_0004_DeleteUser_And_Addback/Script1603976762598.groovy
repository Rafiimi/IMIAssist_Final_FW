import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger logger = new KeywordLogger()

try {
    TCname = 'Delete User'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Back_arrow'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))
	
    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_User'), findTestData('AdminSettings_User').getValue(
            'Email', 6), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/DeleteCheckbox'))

    not_run: CustomKeywords.'reusableKeywords.Reusable.ClickDynamicObject'(findTestData('AdminSettings_User').getValue('Email', 
            6))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/DeleteUser'))

    WebUI.delay(2)

    String delMessage = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/WanttoDelete'))

    if (delMessage == 'Are you sure you want to remove this user from the department?') {
        KeywordUtil.markPassed('Remove user confirmtion is showing corretly')

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_REMOVE'))
    } else {
        KeywordUtil.markFailed('Remove user confirmtion is NOT showing corretly: ' + delMessage)
    }
    
    delConfirmation = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/DeleteConfirmation'))

    if (delConfirmation == 'Users deleted successfully') {
        KeywordUtil.markPassed('User is removed successfully')

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Close_RemoveUser'))
    } else {
        KeywordUtil.markFailed('User is NOT removed successfully: ' + delConfirmation)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Unable to Delete user :' + e.getMessage())
	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Close_RemoveUser'))
} 

//Creating user back who is already deleted
try {
    WebUI.delay(2)

    TCname2 = 'Check whether admin should be able to add a deleted user back to the Team'

    logger.logInfo('***START Of TEST CASE: ' + TCname2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AddUser'))

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/NewUser_firstName'), findTestData('AdminSettings_User').getValue(
            'FirstName', 6))

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/NewUser_lastName'), findTestData('AdminSettings_User').getValue(
            'LastName', 6))

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/NewUser_userEmail'), findTestData('AdminSettings_User').getValue(
            'Email', 6), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/User_SelectRole'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Role_User'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CREATE'))

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AdminSettings_User').getValue('Expected_Msg_Header', 7)

    if (actualMsg.contains(expectedMsg)==true) {
        KeywordUtil.markPassed(((((('Expected and actual messages are matched: ' + 'Actual is: ') + actualMsg) + ' ') + 
            ',') + 'Expected is: ') + expectedMsg)
    } else {
        KeywordUtil.markFailed(((((('Expected and actual messages are NOT matched: ' + 'Actual is: ') + actualMsg) + ' ') + 
            ',') + 'Expected is: ') + expectedMsg)
    }
    
    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_User'), findTestData('AdminSettings_User').getValue(
            'Email', 6), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    CreationStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/paginationObject'), 2)

    if (CreationStatus == true) {
        KeywordUtil.markPassed('Admin is able to add a deleted user back to the Team')
    } else {
        KeywordUtil.markFailed('Admin is NOT able to add a deleted user back to the Team')
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname2)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Unable to create user :' + e.getMessage())
} 

