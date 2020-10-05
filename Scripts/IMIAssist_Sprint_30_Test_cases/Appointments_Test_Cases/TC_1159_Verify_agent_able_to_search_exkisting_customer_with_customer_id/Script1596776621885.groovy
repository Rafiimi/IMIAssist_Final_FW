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
    WebUI.openBrowser('')


    WebUI.delay(3)

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	
    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

    WebUI.delay(2)

	try
	{
    WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))
	WebUI.delay(2)
	
    WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))

    WebUI.delay(3)

    WebUI.waitForElementClickable(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Newappointmentlinkunderappointmentpage'), 
        5)

    WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Newappointmentlinkunderappointmentpage'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_New Appointment   close          Start _142398'))

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Schedule An Appointment  Schedule an _9b3aa6'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Next (3)'))
	KeywordUtil.markPassed('SUCCESS:Agent able to select schedule an appointment')
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to select schedule an appointment:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
		
	}
    WebUI.delay(5)
	
	try
	{
	WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Scheduleanappointmentfilterobject'))
//   Select the phonenumber
	 WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/CustomerId_object'))
//	WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), findTestData('IMiAsssist_dashbord').getValue(8, 1))
	 WebUI.delay(4)
	 WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), findTestData('IMIAssist_sprint30_testdata').getValue(13, 1))
	 actulvaluewithcustomerid=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Customeridsearchdata'))
	 Epectedvaliuewithcustomerid=findTestData('IMIAssist_sprint30_testdata').getValue(14, 1)
	
	 WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/TC_1156_57_58_60_Check_whether_admin_agent_is_able_to_search_customer_using_phone_number_search_with_Phonenumber.png')
	 
	   if(actulvaluewithcustomerid.equals(Epectedvaliuewithcustomerid))
	  {
		KeywordUtil.markPassed('SUCCESS:Agent able to search with Customer id')
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
//		WebUI.click(findTestObject('null'))
//		
//		WebUI.click(findTestObject('null'))
//	
	  }
	  else
	  {
		  KeywordUtil.markFailed('ERROR:Agent unable to search with Customer id')
//		 WebUI.delay(4)
//		WebUI.click(findTestObject('null'))
//
//		WebUI.click(findTestObject('null'))
	  }
	}
	catch(Exception e)
	{
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
	}
	  WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown (3)'))
	   
	   WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (8)'))
	  KeywordUtil.markPassed('SUCCESS:Agent able to search with Customer id')
	  
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to search with Customer id:'+e.getMessage())
		
	}


