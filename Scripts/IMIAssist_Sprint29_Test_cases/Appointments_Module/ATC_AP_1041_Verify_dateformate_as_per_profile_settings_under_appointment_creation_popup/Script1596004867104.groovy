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
//public static String dateformate;
try
{
/*WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	
WebUI.delay(4)
 WebUI.setText(findTestObject('null'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))*/
WebUI.delay(3)
//WebUI.click(findTestObject('null'))
try
{
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile (1)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_create (1)'))

dateformate=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/dateformate'), 'value')
println(dateformate)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))
KeywordUtil.markPassed('SUCCESS: Agent able to collect the profile date from profile page ')


try
{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_New Appointment   close          Start _142398'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Schedule An Appointment  Schedule an _9b3aa6'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Next (3)'))

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
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent able to fill the appointment details on appointment popup:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}

try
{
	
	
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/PrioritydropdownObject'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Selectpriorityobject'))


WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))

dateformateonpopup=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Dateandtime_field_under_appointment_popup'), 'placeholder')
println(dateformateonpopup)
if(dateformateonpopup.contains(dateformate))
{
	KeywordUtil.markPassed('SUCCESS: Appointment creation date format and profile date formate are matched')
	
}
else
{
	KeywordUtil.markFailed('ERROR: Appointment creation date format and profile date formate are not matched')
	
}
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1041_Verify_dateformate_as_per_profile_settings_under_appointment_creation_popup.png')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Appointment creation date format and profile date formate are not matched:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to capture the profile date formate:'+e.getMessage())
	
}
		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
	

WebUI.delay(4)
/*WebUI.click(findTestObject('null'))


WebUI.click(findTestObject('null'))*/
//WebUI.closeBrowser()
KeywordUtil.markPassed('SUCCESS: Appointment creation date format and profile date formate are matched')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Appointment creation date format and profile date formate are not matched:'+e.getMessage())
	
}
