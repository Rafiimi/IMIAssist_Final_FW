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

Existingloginexpdata='You are logged in elsewhere. By proceeding forward you choose to be logged out from previous login.';

	WebUI.openBrowser('')

	WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	WebUI.delay(3)

	WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'),
		findTestData('IMiAsssist_dashbord').getValue(2, 1))

	WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'),
		findTestData('IMiAsssist_dashbord').getValue(3, 1))

	WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
	WebUI.delay(5)
	WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\Test Cases\\Login_and_profile_Test_cases\\ATC_LP_1007_Check_whether_agent_able_to_see_exsting_user_login_popup.png')
	try {
//	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
	
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
	Existinglogintext=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
	println(Existinglogintext)
	
	if(Existinglogintext.equals(Existingloginexpdata))
	{
		KeywordUtil.markPassed('SUCCESS:User login some where popup is displayed successfully')
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_PROCEED (6)'))
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown (5)'))
	
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (7)'))
		KeywordUtil.markPassed('SUCCESS:user login with exsting session')
	
	}
	
	else
	{
		println('Exsting login popup is not displayed')
	}
	}
	catch(Exception e)
	{
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown (5)'))
		
			WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (7)'))
			KeywordUtil.markPassed('SUCCESS:user login with new session')
	}
	
//	element=WebUI.verifyElementClickable(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
//if(element==true)
//{
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
//
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
//Existinglogintext=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_You are logged in elsewhere By proceedi_903625'))
//println(Existinglogintext)
//
//if(Existinglogintext.equals(Existingloginexpdata))
//{
//	KeywordUtil.markPassed('SUCCESS:User login some where popup is displayed successfully')
//	WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_PROCEED (6)'))
//	WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown (5)'))
//	
//	WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (7)'))
//	KeywordUtil.markPassed('SUCCESS:user login with new session')
//	
//}
//else
//{
//	println('popup is not displayed')
//}
//}
//else if(element==false)
//{
//WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown (5)'))
//
//WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (7)'))
//KeywordUtil.markPassed('SUCCESS:user login with new session')	
//}
//
//KeywordUtil.markPassed('SUCCESS:User login some where popup is displayed and user able to proceed with that session')
//
