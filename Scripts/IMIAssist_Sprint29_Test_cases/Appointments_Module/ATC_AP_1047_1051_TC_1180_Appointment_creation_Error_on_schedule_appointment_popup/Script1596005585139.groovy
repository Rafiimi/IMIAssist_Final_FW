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
 WebUI.setText(findTestObject('null'), 
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
try{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_person_add'))

WebUI.doubleClick(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_info_outline                           _a3baae'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_keyboard_arrow_down_newcustomer_firstName'), 
    findTestData('IMiAsssist_dashbord').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_keyboard_arrow_down_newcustomer_lastName'), 
    findTestData('IMiAsssist_dashbord').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_appointmentNewCustomerPhone'), 
    findTestData('IMiAsssist_dashbord').getValue(14, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_newCustomer_email'), 
   findTestData('IMiAsssist_dashbord').getValue(15, 1))

//WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_info_outline_newCustomer_Testcell'), 
//    findTestData('IMiAsssist_dashbord').getValue(8, 1))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_calendar_today'), findTestData('IMiAsssist_dashbord').getValue(13, 1))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Assign to me'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Rafitestp shaiktestpp'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Schedule'))
KeywordUtil.markPassed('SUCCESS:Agent able to fill the all details on appointment creation popup')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to create the appointment with exsting mobile number')
	
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
try{
Actualerrormessage=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Appointmentcreationerrormessages_object'))

ExpectedErrormessage=findTestData('IMiAsssist_dashbord').getValue(16, 1)
if(Actualerrormessage.equals(ExpectedErrormessage))
{
	KeywordUtil.markPassed('SUCCESS:Agent Unable to create the appointment with exsting mobile number')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Agent able to create the appointment with exsting mobile number')
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_OK'))
	
}
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1047_1051_TC_1180_Appointment_creation_Error_on_schedule_appointment_popup.png')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to create the appointment with exsting mobile number')
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_OK'))
	
}
WebUI.delay(7)

//WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))

	WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
/*WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))*/
KeywordUtil.markPassed('SUCCESS:Agent Unable to create the appointment with exsting mobile number')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to create the appointment with exsting mobile number:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}

