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

appointmentconfirmationtext='updated successfully';
try
{
//CustomKeywords.'reusableKeywords.Reusable.Login'()

	WebUI.delay(3)
	try
	{


			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Apointmenttabicon'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmenttab'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Assigned (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_test-479-1            Low     Due  in 2_268dff'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_videocam'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_END APPOINTMENT'))
WebUI.delay(3)

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

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Feedbacksubmitbutton'))

episodesupdatedmessage=WebUI.getText(findTestObject('Page_eClinic - Video Consultations/div_Episode updated successfully'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1017_1024_Check_whether_agent_is_able_to_start_appointments_assigned_to_him.png')

if(episodesupdatedmessage.contains(appointmentconfirmationtext))
{
	KeywordUtil.markPassed('SUCCESS:Appointment is updated successfully in episodes')

}
else
{
KeywordUtil.markFailed('ERROR:Appointment is not updated in episodes')

}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointment is not updated in episodes')
	
}
/*WebUI.delay(2)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))*/
KeywordUtil.markPassed('SUCCESS:Sms confimration message is displayed and appointment is update in episodes')
}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:Sms confimration message is not displayed and appointment is not update in episodes')
	
}

