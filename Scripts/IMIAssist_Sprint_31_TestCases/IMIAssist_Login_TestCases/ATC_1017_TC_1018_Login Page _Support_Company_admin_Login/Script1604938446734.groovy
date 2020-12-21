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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger


try
{
	
Dashboardtitle='dashboard'
WebUI.openBrowser('')


WebUI.navigateToUrl(findTestData("Login_testdata").getValue(1, 1))
for(int i=0;i<=1;i++)
{
WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Emailtextf'), findTestData("Login_testdata").getValue(4,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData("Login_testdata").getValue(5,1))
WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
WebUI.delay(2)
CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()
	
WebUI.delay(5)

			WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

			WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
			WebUI.delay(3)
			}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:User unable to launched the dashbord'+ e.getMessage())
	
}
