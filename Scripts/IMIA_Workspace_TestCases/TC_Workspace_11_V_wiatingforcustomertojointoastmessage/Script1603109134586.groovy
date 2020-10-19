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

'In same Script added below cases\r\nTC_Workspace_7\r\nTC_Workspace_8'
//CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.Naviagateappointmentpage'()

WebUI.delay(3)

//Verify Email field Validation while sending the video link
try {
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_New Appointment   close          Start _142398'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Start_an_appointment'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Next (3)'))

    KeywordUtil.markPassed('SUCCESS:Agent able to select start an appointment on appointment creation popup and he able to naviagte appointment creation popup')
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent Unable to select start an appointment :' + e.getMessage())

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
} 

WebUI.delay(3)

try {
    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select Team'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Rafi'))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Rafi_customerSearchInput'), 'rafi')

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Rafi Shaik'))
	WebUI.delay(3)
	
    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_SEND SMS'))

 
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see the error message about invalid mail:' + e.getMessage())
} 

//Check whether system is displaying the Waiting message while connecting End User
WebUI.delay(2)
try
{
	Customerwaitinghostmessage=WebUI.getText(findTestObject('Object Repository/Workspace_Objects/Customerwathostonw')).trim()
	expectedcwhm=findTestData('IMIA_Appointment_page_Testdata').getValue(2, 1)
	if(Customerwaitinghostmessage.equals('expectedcwhm'))
	{
		KeywordUtil.markPassed('SUCCESS:Agent unable to see the wfctj message:')
		
	}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to see the wfctj message:' + e.getMessage())
	
}
try
{
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/video_Sorry Web RTC is not available in you_1b1cbd'))
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


}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointment is not updated in episodes')
	
}