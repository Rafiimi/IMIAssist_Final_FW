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
    findTestData("TC_03_OtherdetailsChenge").getValue(8,1))
//Reset button disable stratus
Restpwdbuttonstatus=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/Resetpassworddisableobject'))
//Restpwdbuttonstatus=WebUI.verifyElementAttributeValue(findTestObject('Object Repository/LoginPage_TestCases_Objects/Resetpassworddisableobject'), 'disabled', 'disabled', 3)
WebUI.delay(2)
WebUI.takeScreenshot('TC_1008_Forgot Password _Resetpassword_with_emtyemailId')
if(Restpwdbuttonstatus == true)
{
	KeywordUtil.markPassed('SUCCESS:Reset button is in disable mode so user unable to click on it')
	
}
else
{
KeywordUtil.markFailed('ERROR:User able to click on rest password button with empty email address')

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