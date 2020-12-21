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
WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	
WebUI.delay(4)
 WebUI.setText(findTestObject('null'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
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

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_info_outline_newCustomer_Testcell'), 
    findTestData('IMiAsssist_dashbord').getValue(8, 1))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_calendar_today'), findTestData('Startdatevalue').getValue(1, 1))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Assign to me'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Rafitestp shaiktestpp'))
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Schedulebutton_ap_popup'))

try{
	WebUI.delay(13)

appointmentcreationconfirmation=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentconfirmationmessage')).trim()
Expappointmentcreationconfirmation=findTestData('IMiAsssist_dashbord').getValue(20, 1)
if(Expappointmentcreationconfirmation.contains(appointmentcreationconfirmation))
{
	KeywordUtil.markPassed('SUCCESS:Agent successfully created schedule an appointment and confirmation message is matched')
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/app_creation_conf_pop_cls_button'))
}
else
{
	KeywordUtil.markFailed('ERROR:Agent able to created schedule an appointment and confirmation message is not matched:')
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/app_creation_conf_pop_cls_button'))
	
// WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
//KeywordUtil.markPassed('SUCCESS:Agent successfully created schedule an appointment')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable created schedule an appointment:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
KeywordUtil.markPassed('SUCCESS:Agent successfully create schedule an appointment')
	
	
		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent Unable create schedule an appointment:'+e.getMessage())
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
			
		}

try
{

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Assigned (2) (1)'))
WebUI.delay(15)

Appointmentconduelabeltext=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Due_lable_text'))
WebUI.delay(2)
if(Appointmentconduelabeltext.equals('Due'))
{
KeywordUtil.markPassed('SUCCESS:Appointment is created successfully and Due  time is updated')

}
else
{
	KeywordUtil.markFailed('ERROR:Appointment is not created successfully and Due  time is not updated')
	
}
KeywordUtil.markPassed('SUCCESS:Appointment is created successfully and Due  time is updated')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointment is not created successfully and Due  time is not updated')
	
}
WebUI.delay(3)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

KeywordUtil.markPassed('SUCCESS:Appointment is created successfully and Due  time is updated')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointment is not created successfully and Due  time is not updated:'+e.getMessage())
	
}

