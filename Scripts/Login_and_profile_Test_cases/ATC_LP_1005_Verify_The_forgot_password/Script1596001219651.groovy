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
WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Emailtextf'), findTestData('Invalidcredentials').getValue(2, 1))
WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Requestresetlink'))
WebUI.delay(3)
forgotpasswordtext=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Fpswmailsentconftext'))
WebUI.delay(2)
Expectefpassconftext=findTestData("Invalidcredentials").getValue(6,1)
if(forgotpasswordtext.contains(Expectefpassconftext))
{
	KeywordUtil.markPassed('SUCCESS:Successfully Password Reset mail is sent to your registered mail')
	
}
else
{
KeywordUtil.markFailed('ERROR:Password Reset mail is not sent to your registered mail')

}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Password Reset mail is not sent to your registered mail:'+e.getMessage())
	
}