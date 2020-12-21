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

WebUI.navigateToUrl( findTestData("Invalidcredentials").getValue(1,1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/forgotpswlink'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Emailtextf'), findTestData('Invalidcredentials').getValue(7, 1))
WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/EmailIdLabel'))
WebUI.clearText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Emailtextf'))
WebUI.delay(5)
warningtext=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/EMailtooltiptext'))
if(warningtext.equals('Please enter a valid email'))
{
	KeywordUtil.markPassed('SUCCESS:Agent unable to send the forgot password link to email with invalid email address')
	
}
else
{
KeywordUtil.markFailed('ERROR:Agent able to send the forgot password link to email with invalid email address')

}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Forgot password email with invalid useremail is failed:'+e.getMessage())
	
}