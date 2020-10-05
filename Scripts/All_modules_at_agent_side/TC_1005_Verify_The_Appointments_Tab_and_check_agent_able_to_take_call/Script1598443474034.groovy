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
import com.kms.katalon.core.util.KeywordUtil
try
{
/*WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData("TestDataforLogin").getValue(1, 1))

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TestDataforLogin").getValue(2, 1))

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),
	findTestData("TestDataforLogin").getValue(3, 1))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))*/

	
	try{
		
		WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))
	   WebUI.delay(2)
	   
	   WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))
	
	   WebUI.delay(3)
	    WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Selectnewappointmentobject'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Start_an_appointment'))
		
			WebUI.delay(3)
	
	
	
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Next'))
		WebUI.delay(3)
		KeywordUtil.markPassed('SUCCESS:Agent able to launch the appointment creation popup')
		
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to select staret an appointment on the appointment creation popup:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
	}

	try
	{   
	WebUI.delay(3)
	WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/div_Select Team'), 3)
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select Team'))
	
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Rafi'))
	
	WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Rafi_customerSearchInput'), findTestData("Allthetabsatagentside").getValue(9, 1))
	
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Rafi Shaik'))
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_SEND SMS'))
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_END APPOINTMENT'))
	WebUI.delay(3)
	
		KeywordUtil.markPassed('SUCCESS:agent able to click on end appointment button on workspace')
		
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:agent unable to click on end appointment button on workspace:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
	}

	try
	{
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_End Video Call  close    Are you sure y_5d477d'))
	
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/End_call_button'))
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Appointment Information   Rafi - Appoin_6106ec'))
	
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select Appointment Status (1)'))
	
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_CLOSED (1)'))
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Appointmentstatusclosepopupnextbutton'))
	WebUI.delay(3)
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Feedback   Please rate the call based o_985a03'))
	WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Agent_Side_Tabs\\TC_1005_Verify_The_Appointments_Tab_and_check_agent_able_to_take_call.png')
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Feedbacksubmitbutton'))
	WebUI.delay(3)

	KeywordUtil.markPassed('SUCCESS:agent able to click on end call button on workspace')
		
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:agent able to click on end call button on workspace:'+e.getMessage())
	}

	/*
	WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))
	
	WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
	
	WebUI.delay(5)
	WebUI.closeBrowser()*/
	KeywordUtil.markPassed('SUCCESS: Agent able to create the appointment and he able to take the call')
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR: Agent Unable to create the appointment:'+e.getMessage())
		
	}
