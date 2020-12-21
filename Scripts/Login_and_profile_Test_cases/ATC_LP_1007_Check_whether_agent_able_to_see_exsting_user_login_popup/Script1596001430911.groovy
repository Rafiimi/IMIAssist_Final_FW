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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

for(int i=0;i<=1;i++)
{
	WebUI.openBrowser('')

	WebUI.navigateToUrl(findTestData('Login_testdata').getValue(1, 1))
	WebUI.maximizeWindow()
	WebUI.delay(3)

	WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(2,1))

WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'),findTestData('Login_testdata').getValue(3,1))

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
WebUI.delay(3)
}
WebUI.delay(3)
	try {
	
//	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
	Existinglogintext=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Exstinglogintextobject'))
	Expectedexistinglogingpopuptext=findTestData('Login_testdata').getValue(6, 1)
	if(Existinglogintext.equals(Expectedexistinglogingpopuptext))
	{
		KeywordUtil.markPassed('SUCCESS:User login some where popup is displayed successfully')
		WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Proceedbutton'))
		WebUI.delay(3)
		CustomKeywords.'reusableKeywords.Reusable.Logout'()
		
	}
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:User unable to login with exsting login popup:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/CancelButton'))
			
	}
	
