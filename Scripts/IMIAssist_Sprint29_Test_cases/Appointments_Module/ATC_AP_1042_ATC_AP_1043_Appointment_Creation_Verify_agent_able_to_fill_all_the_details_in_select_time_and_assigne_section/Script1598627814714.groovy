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

    WebUI.maximizeWindow()

    WebUI.delay(3)

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))

    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
*/
    WebUI.delay(2)

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
	
    WebUI.delay(5)
	try
	{
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Alldropdown_object'))
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Selectcustomername'))
//   Select the Customername
//	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/SelectemailoptionfromfilterObject'))
	WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), findTestData('Appointment_creation_popup_Test_data').getValue(9, 1))
//	WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Searchwithcsname'), findTestData('Appointment_creation_popup_Test_data').getValue(10, 1))
	WebUI.delay(4) 
	
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Selecttheuserunderpopup'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_calendar_today'), findTestData('IMiAsssist_dashbord').getValue(13, 1))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Assign to me'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Rafitestp shaiktestpp'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Sameasregisteredcontactinformationcheckbox_object'))
 element=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Phonenumbertextfield_under_popup'))
if(element==true)
{
	
	WebUI.clearText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Phonenumbertextfield_under_popup'))
    WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Phonenumbertextfield_under_popup'),  findTestData('Appointment_creation_popup_Test_data').getValue(8, 1))
	KeywordUtil.markPassed('SUCCESS: Agent bale to eneter the data into  contact information text fields')
	}
else
{
	KeywordUtil.markFailed('ERROR: Agent unbale to eneter the data into  contact information text fields')
	
}
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1042_ATC_AP_1043_Appointment_Creation_Verify_agent_able_to_fill_all_the_details_in_select_time_and_assigne_section.png')




WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Schedule'))


WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Ok_button_on_appointment_popup_object'))
	}
	catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to clear the all the fields after clicking on reset button:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}


WebUI.delay(4)
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown (3)'))


WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (8)'))*/
//WebUI.closeBrowser()
	KeywordUtil.markPassed('SUCCESS: Agent bale to eneter the data into  contact information text fields')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent unbale to eneter the data into  contact information text fields:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
