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

CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

try {
    TCname = 'Delete User'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

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

    if (delConfirmation == ' Users deleted successfully') {
        KeywordUtil.markPassed('User is removed successfully')

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Close_Window'))
    } else {
        KeywordUtil.markFailed('User is NOT removed successfully: ' + delConfirmation)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Unable to Delete user :' + e.getMessage())
} 

