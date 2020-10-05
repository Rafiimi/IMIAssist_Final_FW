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

try {
    /*WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.delay(3)

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))

    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))*/

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
    WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), 
        findTestData('Appointment_creation_popup_Test_data').getValue(9, 1))

    //	WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Searchwithcsname'), findTestData('Appointment_creation_popup_Test_data').getValue(10, 1))
    WebUI.delay(4)

    //
    WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Selecttheuserunderpopup'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))

    WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_calendar_today'), findTestData(
            'IMiAsssist_dashbord').getValue(13, 1))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Arraowback_under_popup'))
	
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Discard Changes   clear     Are you sur_801644'))
	
	WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Are you sure you want to discard the details'))
	
	
//	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/discard_changes_creation_alert_object'))
	alertactualtext=WebUI.getText(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Are you sure you want to discard the details'));

	alertexpectedresult=findTestData('Appointment_creation_popup_Test_data').getValue(18, 1)
	WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1046_Appointment_Creation_Verify_go_back_arrow_functionality_on_popup.png')
	
	if(alertactualtext.equals(alertexpectedresult))
	
	{
//	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/alert_discard_button'))	
	
			WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/button_Discard'))
			KeywordUtil.markPassed('SUCCESS: Agent able to see the discard popup')
	
	}
	else
	{
		KeywordUtil.markFailed('ERROR: Agent unable to see the discard popup')
		
	}
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR: Agent unable to verify the information icon text with expected text:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
	}

	try{
		

//WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
	
WebUI.delay(4)
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown (3)'))


WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (8)'))*/
//WebUI.closeBrowser()
KeywordUtil.markPassed('SUCCESS: Agent able to click on ok button on confirmation popup')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR: Agent unable to click on ok button:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
	}
	KeywordUtil.markPassed('SUCCESS: Agent able to see the discord changes popup')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent unale to see the  discord changes popup:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}

