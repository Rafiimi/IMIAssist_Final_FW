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

try
{
/*WebUI.openBrowser('')

  WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
  WebUI.maximizeWindow()
  
  WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

  WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1)) 
    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
*/
	try{
WebUI.delay(2)

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Newappointmentlink'))

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Startanappointmentlink'))

popupheader=WebUI.getText(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Newappointmentheader'))
println(popupheader)

Expectedtext=findTestData("Appointment_creation_popup_Test_data").getValue(1, 1)
if(popupheader.equals(Expectedtext))
{
	KeywordUtil.markPassed('SUCCESS:Popup header is available and its matched to expected text')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Popup header is not available and its not matched to expected text')

	}
//KeywordUtil.markPassed('SUCCESS:Agent able to select schedule an appointment on appointment creation popup and he able to naviagte appointment creation popup')
	
	
		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent Unable to see the header of shedule an appointment popup :'+e.getMessage())
			WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
			
		}
	
try
{
WebUI.delay(3)
WebUI.waitForElementClickable(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/StartAnAppointmentleabelobject'), 2)
startanappointmentactuallabletext=WebUI.getText(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/StartAnAppointmentleabelobject'))
Exepectedstartanappointmenttext=findTestData("Appointment_creation_popup_Test_data").getValue(2, 1)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/TC_1153_Appointment_Creation_ Verify_whether_the_following_options_are_available_in_popup_on.png')

if(startanappointmentactuallabletext.equals(Exepectedstartanappointmenttext))
{
	KeywordUtil.markPassed('SUCCESS:Start an appointment option is available and its matched to expected text')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Start an appointment option is not available and its not matched to expected text')
}
//KeywordUtil.markPassed('SUCCESS:Agent able to select schedule an appointment on appointment creation popup and he able to naviagte appointment creation popup')


	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent Unable to see the start an appointment option :'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
		
	}
	try{
		
	Scehedulanappointmentlabletext=WebUI.getText(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/ScheduleAnAppointmentlabel'))
Expectedschduleananappointmenttext=findTestData("Appointment_creation_popup_Test_data").getValue(3, 1)

if(Scehedulanappointmentlabletext.equals(Expectedschduleananappointmenttext))
{
	KeywordUtil.markPassed('SUCCESS:Schedule an appointment option is available and its matched to expected text')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Schedule an appointment option is not available and its matched to expected text')
}
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent Unable to see the schedule an appointment option :'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
		
	}
	WebUI.delay(3)
	try
	{
Cancelbuttonactualtext=WebUI.getText(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Cancel_button_Text_popup'))

CancelbuttonExpectedtext=findTestData("Appointment_creation_popup_Test_data").getValue(4, 1)
WebUI.takeScreenshot('D:/IMIAssist- Automation/IMIAssist_Screenshots/Sprint_29_Screens/ATC_AP_1026_Appointment_Creation_ Verify_whether_the_following_options_are_available_in_popup_on.png')

if(Cancelbuttonactualtext.contains(CancelbuttonExpectedtext))
{
	KeywordUtil.markPassed('SUCCESS:Cancel button is available and its matched to expected text')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Cancel button is not available and its not matched to expected text')
}
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent Unable to see the cancel button on popup :'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
		
	}
WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Closebutton'))
WebUI.delay(5)
/*WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Profiledropdownobject'))

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Logoutbutton'))
*/
KeywordUtil.markPassed('SUCCESS:All options are available in popup')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:All options are available in popup:'+e.getMessage())
	
}
