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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

try
{
	
WebUI.openBrowser('')
WebUI.navigateToUrl(findTestData("Login_testdata").getValue(1, 1))
WebUI.maximizeWindow()
WebUI.delay(4)
BrandlogStatus=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/Brandlogo'))
if(BrandlogStatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Brand logo is visible to the loginuser')
	
}
else
{
	KeywordUtil.markPassed('SUCCESS:Brand logo is not visible to the loginuser')
	
}
WebUI.delay(3)
Useremail=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'))
if(Useremail==true)
{
	KeywordUtil.markPassed('SUCCESS:User name textfield is visible to the loginuser')
	
}
else
{
	KeywordUtil.markFailed('ERROR:User name textfield is not visible to the loginuser')
	
}

WebUI.delay(3)
PasswordTextfield=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'))
if(PasswordTextfield==true)
{
	KeywordUtil.markPassed('SUCCESS:Password Textfield is visible to the loginuser')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Password Textfield is not visible to the loginuser')
	
}
WebUI.delay(3)
forgotpasswordlink=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/forgotpswlink'))
if(forgotpasswordlink==true)
{
	KeywordUtil.markPassed('SUCCESS:forgotpassword link is visible to the loginuser')
	
}
else
{
	KeywordUtil.markFailed('ERROR:forgotpassword link is not visible to the loginuser')
	
}

WebUI.delay(3)
loginbutton=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
if(loginbutton==true)
{
	KeywordUtil.markPassed('SUCCESS:login button is visible to the loginuser')
	
}
else
{
	KeywordUtil.markFailed('ERROR:login button is not visible to the loginuser')
	
}

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:User unable to see all the fields on login page:'+e.getMessage())
	
}