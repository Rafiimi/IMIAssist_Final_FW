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

try {
    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Settings'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Settings_Dept'))

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/AStab_CompanyDetails'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AddUser'))
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

//for (int i = 1; i <= findTestData('AdminSettings_User').getRowNumbers(); i++) {
for (int i = 6; i <= 6; i++) {
    try {
        TCname = findTestData('AdminSettings_User').getValue('Description', i)

        KeywordLogger logger = new KeywordLogger()

        logger.logInfo('***START Of TEST CASE: ' + TCname)

        WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/NewUser_firstName'), findTestData('AdminSettings_User').getValue(
                'FirstName', i))

        WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/NewUser_lastName'), findTestData('AdminSettings_User').getValue(
                'LastName', i))

        WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/NewUser_userEmail'), findTestData('AdminSettings_User').getValue(
                'Email', i), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/User_SelectRole'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Role_User'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CREATE'))
		
		WebUI.delay(2)
		
        if (findTestData('AdminSettings_User').getValue('Success_or_Error?', i) == 'Success') {
            actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

            expectedMsg = findTestData('AdminSettings_User').getValue('Expected_Msg_Header', i)

            if (actualMsg == expectedMsg) {
                KeywordUtil.markPassed(((((('Expected and actual messages are matched: ' + 'Actual is: ') + actualMsg) + 
                    ' ') + ',') + 'Expected is: ') + expectedMsg)
            } else {
                KeywordUtil.markFailed(((((('Expected and actual messages are NOT matched: ' + 'Actual is: ') + actualMsg) + 
                    ' ') + ',') + 'Expected is: ') + expectedMsg)
            }
        }
        
        WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_User'), findTestData('AdminSettings_User').getValue(
                'Email', 6), FailureHandling.OPTIONAL)

        WebUI.delay(2)

        CreationStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/paginationObject'), 2)

		if (CreationStatus == true) {
			KeywordUtil.markPassed('User is created successfully')
		} else {
			KeywordUtil.markFailed('User is Not created')
		}
		
        logger.logInfo('***END Of TEST CASE: ' + TCname)
    }
    catch (Exception e) {
        KeywordUtil.markFailed('ERROR: Unable to create user :' + e.getMessage())
    } 
}

