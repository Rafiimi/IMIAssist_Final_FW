import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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

mailconfirmationtextmessage='Password Reset mail is sent to your registered mail. Please follow the instruction.'
try
{
WebUI.openBrowser('')

WebUI.navigateToUrl( findTestData("TC_03_OtherdetailsChenge").getValue(1,1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_Forgot password'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_Please enter a valid email address (n_259fe2'), 
    findTestData("TC_03_OtherdetailsChenge").getValue(2,1))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_RESET PASSWORD'))
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Restpasswordconfirmationtextobject'))
forgotpasswordtext=WebUI.getText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Restpasswordconfirmationtextobject'))
println("Rest mail confirmation :"+forgotpasswordtext)
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\ATC_LP_1005_Verify_The_forgot_password.png')

if(forgotpasswordtext.contains(mailconfirmationtextmessage))
{
	println("Successfully Password Reset mail is sent to your registered mail")
	KeywordUtil.markPassed('SUCCESS:Successfully Password Reset mail is sent to your registered mail')
	
}
else
{
println("Password Reset mail is not sent to your registered mail")
KeywordUtil.markFailed('ERROR:Password Reset mail is not sent to your registered mail')

}
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/a_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Please enter your details belowForgot p_facb95'))
WebUI.delay(3)
WebUI.closeBrowser()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Password Reset mail is not sent to your registered mail')
	
}