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

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent Unable to cancel the appointment while creating the appointment:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
try
{
//WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_info_outline_newCustomer_Testcell'), 
//    findTestData('IMiAsssist_dashbord').getValue(8, 1))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/PrioritydropdownObject'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Selectpriorityobject'))

WebUI.delay(4)
//Add the attribute
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Addmoreattributeslinkobject'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/addattributedropdown'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Description_option_object'))

WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1040_Appointment_Creation_Check_wether_agent_able_to_delete_the_added_attributes.png')

		WebUI.delay(4)
	    Addedattributefield=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Addedattributefiled'), 'placeholder')
	 	Expctedaddedattributet=findTestData('Appointment_creation_popup_Test_data').getValue(16, 1)
		
		
		
		if(Addedattributefield.equals(Expctedaddedattributet))
		{
			
			KeywordUtil.markPassed('SUCCESS:Agent successfully added the attribute on popup')
			
			
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent unable to add the attribute')
			
		}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to delete the added attributes:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
}
//		WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/Attributedeleteicon'))
//		 WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/Description_field_Object'),'test')
//		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributedeleteicon'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))

		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
	
		KeywordUtil.markPassed('SUCCESS:Agent able to delete the added attribute icon')

		WebUI.delay(4)
		/*WebUI.click(findTestObject('null'))
		
		WebUI.click(findTestObject('null'))*/

}
catch(Exception e)
{
			KeywordUtil.markFailed('ERROR:Agent unable to delete the icon:'+e.getMessage())
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
			
}

