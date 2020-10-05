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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

expectedinvalidloginmessage='Invalid user email or password';
try
{
//WebUI.openBrowser('')

//WebUI.navigateToUrl(findTestData("InvalidPassword").getValue(1,1))
//WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.clearText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'))
WebUI.delay(2)


WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("InvalidPassword").getValue(2,1))
WebUI.clearText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'))
WebUI.delay(2)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),findTestData("InvalidPassword").getValue(3,1))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Invalid user email or password'))
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\ATC_LP_1003_Login with Invalid password.png')

invalidmessage=WebUI.getText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Invalid user email or password'))
println('Invalid error message :'+invalidmessage)

if(invalidmessage.equals(expectedinvalidloginmessage))
{
	KeywordUtil.markPassed('SUCCESS:User unabel to login with invalid password')
}
else
{
	KeywordUtil.markFailed('ERROR:User abel to login with invalid password')
	
}
//WebUI.closeBrowser()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:User abel to login with invalid password')
	
}
