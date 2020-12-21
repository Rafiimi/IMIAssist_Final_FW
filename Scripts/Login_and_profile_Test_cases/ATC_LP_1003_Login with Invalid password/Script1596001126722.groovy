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

try
{
WebUI.delay(4)
WebUI.clearText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'))
WebUI.delay(2)


WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Invalidcredentials').getValue(2,1))

WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'),findTestData('Invalidcredentials').getValue(4,1))

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
WebUI.delay(3)
invalidmessage=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/InvalidcredentialsErrorMessage'))
ExpectedInvaliderrormessage=findTestData('Invalidcredentials').getValue(5, 1)
if(invalidmessage.equals(ExpectedInvaliderrormessage))
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
	KeywordUtil.markFailed('ERROR:User abel to login with invalid password:'+e.getMessage())
	
}
