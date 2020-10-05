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



try
{
	
	/*
	WebUI.openBrowser('')
	
	
	  WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	
		WebUI.delay(3)
		WebUI.maximizeWindow()
		
	
		WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'),
			findTestData('IMiAsssist_dashbord').getValue(2, 1))
	
		WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'),
			findTestData('IMiAsssist_dashbord').getValue(3, 1))
	
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))*/
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Team'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/header_menu notifications notifications_act_169770'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Create a New Team'))
try
{
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Select Department'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Finance'))

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Finance_teamName'), findTestData("Allthetabsatagentside").getValue(4, 1))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_create_2'))

WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Agent_Side_Tabs\\TC_1008_Verify_user_able_to_create_the_new_team.png')

KeywordUtil.markPassed('SUCCESS:Agent successfully create the new team')

}
catch(Exception e)
{
	WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Createnewteam_closebutton'))
	
	KeywordUtil.markFailed('ERROR:Agent unable to create the new team:'+e.getMessage())

}
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_RE-LOGIN'))

WebUI.delay(5)
WebUI.closeBrowser()

KeywordUtil.markPassed('SUCCESS: Agent able to create new team')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to create new team')
	
}
