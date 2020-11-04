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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger logger = new KeywordLogger()

try {
    for (int i = 3; i <= 6; i++) {
        String UserRole = findTestData('Login_testdata').getValue('Role', i)

        logger.logInfo('***Verify the Landing page of ***' + UserRole)

        WebUI.openBrowser('')

        WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', i))

        WebUI.maximizeWindow()

        WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
                'Username', i))

        WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
                'Password', i))

        WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))

        WebUI.delay(4)

        if (UserRole == 'Department admin') {
			String headerText1= WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/LandingPage_Header_Dashboard'))
			if (headerText1.contains('Dashboard')){
				KeywordUtil.markPassed('Landing page is showing correctly for: ' + UserRole)
			}
			else{
				KeywordUtil.markFailed('Landing page is NOT showing correctly for: ' + UserRole)
	        }
        }
        if (UserRole == 'IT admin') {
			String headerText2= WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/LandingPage_Header_Dashboard'))
            if (headerText2.contains('Dashboard')){
				KeywordUtil.markPassed('Landing page is showing correctly for: ' + UserRole)
			}
			else{
				KeywordUtil.markFailed('Landing page is NOT showing correctly for: ' + UserRole)
	        }
        }
        
        if (UserRole == 'Super admin') {
			String headerText3= WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/LandingPage_Header_Dashboard'))
            if (headerText3.contains('Dashboard')){
				KeywordUtil.markPassed('Landing page is showing correctly for: ' + UserRole)
			}
			else{
				KeywordUtil.markFailed('Landing page is NOT showing correctly for: ' + UserRole)
	        }
        }
        
        if (UserRole == 'Agent') {
			String headerText4= WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/LandingPage_Header_Appointments'))
            if (headerText4.contains('Appointments')){
				KeywordUtil.markPassed('Landing page is showing correctly for: ' + UserRole)
			}
			else{
				KeywordUtil.markFailed('Landing page is NOT showing correctly for: ' + UserRole)
	        }
        }
        
        CustomKeywords.'reusableKeywords.Reusable.Logout'()

    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

