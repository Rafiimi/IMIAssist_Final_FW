import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.logging.Logger

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

expectedinvalidloginmessage="Invalid email. Email field is mandatory.";
try
{
/*WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData("Invalidcredentials").getValue(1,1))
WebUI.maximizeWindow()
WebUI.delay(4)*/
WebUI.clearText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'))
WebUI.delay(2)
WebUI.clearText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'))
Loginbuttondisabledtext=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Disableelementloginbutton'))
if(Loginbuttondisabledtext.equals('LOGIN'))
{
	WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
	if(WebUI.getUrl().contains('login')){
		KeywordUtil.markPassed('SUCCESS:User unable to login with empty credentials')
		
	}

else
{
	KeywordUtil.markFailed('ERROR: User abel to login with with empty credentials')
	
}
}

//WebUI.closeBrowser()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: User abel to login with invalid email')
	
}
