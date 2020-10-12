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

KeywordLogger logger = new KeywordLogger()

try {
	TCname = 'Resend Welcome Mail'
	logger.logInfo('***START Of TEST CASE: ' + TCname)
	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))
	
	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Settings'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Settings_Dept'))

	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/AStab_CompanyDetails'))

	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

	WebUI.delay(2)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_User'), findTestData('AdminSettings_User').getValue(
            'Email', 6), FailureHandling.OPTIONAL)

    userStatus = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/UserStatus'))

    if (userStatus == 'Resend Welcome Mail') {
		KeywordUtil.markPassed('User status is showing as : ' + userStatus)
        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/UserStatus'))
		WebUI.delay(1)
		actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))
		if (actualMsg == 'Mail sent successfully') {
			KeywordUtil.markPassed('Resend welcome mail clicked successfully' + actualMsg)
		} else {
			KeywordUtil.markFailed('Resend welcome mail NOT clicked successfully, and the actual message is: ' + actualMsg)
		}	
    } else {
        KeywordUtil.markFailed('User status is showing as : ' + userStatus)
    }
	logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Unable to check Resend Welcome mail :' + e.getMessage())
} 

try{
TCname = 'Create User with existing data'
logger.logInfo('***START Of TEST CASE: ' + TCname)

WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Back_arrow'))
WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))
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
WebUI.delay(2)
actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

expectedMsg = 'User already exists in the department.'

	if (actualMsg == expectedMsg) {
		KeywordUtil.markPassed(((((('Expected and actual messages are matched: ' + 'Actual is: ') + actualMsg) +
		' ') + ',') + 'Expected is: ') + expectedMsg)
	} else {
		KeywordUtil.markFailed(((((('Expected and actual messages are NOT matched: ' + 'Actual is: ') + actualMsg) +
		' ') + ',') + 'Expected is: ') + expectedMsg)
	}
	WebUI.delay(3)
	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Close_Window'))
	logger.logInfo('***END Of TEST CASE: ' + TCname)
}

catch (Exception e) {
	KeywordUtil.markFailed('ERROR: Unable to test existing user creation error :' + e.getMessage())
}
