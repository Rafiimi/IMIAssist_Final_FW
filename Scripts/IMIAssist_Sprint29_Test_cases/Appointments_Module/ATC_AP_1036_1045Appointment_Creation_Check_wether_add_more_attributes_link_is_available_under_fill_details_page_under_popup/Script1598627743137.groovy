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

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	
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
	try
	{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_person_add'))

WebUI.doubleClick(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_info_outline                           _a3baae'))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/PrioritydropdownObject'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Selectpriorityobject'))


Addattributelink=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Addmoreattributeslinkobject'))
WebUI.delay(3)
Expectedaddattributelinktext=findTestData('IMiAsssist_dashbord').getValue(19, 1)
WebUI.delay(3)

WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation\\ATC_AP_1036_1045Appointment_Creation_Check_wether_add_more_attributes_link_is_available_under_fill_details_page_under_popup.png')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Addmoreattributeslinkobject'))

if(Expectedaddattributelinktext.equalsIgnoreCase(Addattributelink))
	{
		KeywordUtil.markPassed('SUCCESS:Add more attribute link is available under appointment creation popup')
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Add more attribute link is not available under appointment creation popup')
		//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
		}
	KeywordUtil.markPassed('SUCCESS:Add more attribute link is available under appointment creation popup and agent able to select priority option')
	
	}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent Unable to see the add more attribute link on appointment creation popup :'+e.getMessage())
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
			
		}


KeywordUtil.markPassed('SUCCESS:Agent able to see the add more attribute link under appointment creation popup')

/*WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))*/

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to see the add more attribute link under appointment creation popup:'+e.getMessage())
	
}

