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


Appointmentconfirmationtextvalue='Appointment Scheduled Successfully'
try
{
/*WebUI.openBrowser('')
WebUI.maximizeWindow()

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
WebUI.delay(4)
 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))*/

try{
		
	
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_New Appointment   close          Start _142398'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Schedule An Appointment  Schedule an _9b3aa6'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Next (3)'))

KeywordUtil.markPassed('SUCCESS:Agent able to select schedule an appointment on appointment creation popup and he able to naviagte appointment creation popup')


	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent Unable to select schedule an appointment :'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
		
	}

WebUI.delay(3)
	try
	{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_person_add'))

WebUI.doubleClick(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_info_outline                           _a3baae'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_keyboard_arrow_down_newcustomer_firstName'), 
    findTestData('IMiAsssist_dashbord').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_keyboard_arrow_down_newcustomer_lastName'), 
    findTestData('IMiAsssist_dashbord').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_appointmentNewCustomerPhone'), 
    findTestData('IMiAsssist_dashbord').getValue(9, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_newCustomer_email'), 
   findTestData('IMiAsssist_dashbord').getValue(10, 1))

//WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_info_outline_newCustomer_Testcell'), 
//    findTestData('IMiAsssist_dashbord').getValue(8, 1))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_calendar_today'), findTestData('Startdatevalue').getValue(1, 1))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Assign to me'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Rafitestp shaiktestpp'))
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Schedulebutton_ap_popup'))
WebUI.delay(5)
KeywordUtil.markPassed('SUCCESS:Agent able to create the appointment')
	
	
		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable to create the appointment :'+e.getMessage())
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
			
		}

try{
WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_close (1)'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Appointment Scheduled Successfully   cl_9a360d'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/h4_Appointment Scheduled Successfully'))

Appointmentconfirmationtext=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/h4_Appointment Scheduled Successfully'))
println(Appointmentconfirmationtext)

AppointmentIdfromconfirmationpopup=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Appointmentidobjectfrompopup'))
WebUI.delay(2)
if(Appointmentconfirmationtext.equals(Appointmentconfirmationtextvalue))
{
KeywordUtil.markPassed('SUCCESS:Appointment is created successfully with manditory details')
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_OK'))

}
else
{
	KeywordUtil.markFailed('ERROR:Appointment is not created successfully with manditory details')
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_OK'))
	
}


try
{
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Assigned (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_NEW        test-487-1            Low   _c93170'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_test-487-1'))
actualappointmentid=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_test-487-1'))
Expectedappointmentid= findTestData('IMiAsssist_dashbord').getValue(21, 1)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1050_Verify_after_creation_appointment_is_available_in_activity_logs.png')

if(actualappointmentid.contains(Expectedappointmentid))
{
	KeywordUtil.markPassed('SUCCESS:Agent able to add the customer and created the appointment with manditory details')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Agent Unable to add the customer and created the appointment with manditory details')
	
}
KeywordUtil.markPassed('SUCCESS:Agent able to add the customer and created the appointment with manditory details')


	}
	catch(Exception e)
	{
	KeywordUtil.markFailed('ERROR:Agent Unable to add the customer and created the appointment with manditory details')
		
	}


//Select logs tab on dash bord
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/logsicon_object'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Logs_tab_object'))
WebUI.delay(3)

appointmentidfromlogs=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/appointmentid'))
if(appointmentidfromlogs.contains(AppointmentIdfromconfirmationpopup))
{
	KeywordUtil.markPassed('SUCCESS: Creation Appointment is available under auditlogs')
}
else
{
	KeywordUtil.markFailed('ERROR:Creation Appointment is not available under auditlogs')
}
KeywordUtil.markPassed('SUCCESS:Agent able to get the confirmation text message')


	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to get the confirmation text message and unable to verify with logs:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
	}
WebUI.delay(3)
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown (3)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (8)'))*/

KeywordUtil.markPassed('SUCCESS:Appointment is created and its available under audot logs')
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent Unable to add the customer and created the appointmentwith manditory details:'+e.getMessage())
	
}

