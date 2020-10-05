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

//try {
   /* WebUI.openBrowser('')


    WebUI.delay(3)

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	WebUI.delay(3)
	
    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

    WebUI.delay(2)
*/
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

    WebUI.delay(5)
	try
	{
	WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Scheduleanappointmentfilterobject'))
//   Select the phonenumber
	 WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Phonenumberobjectfromfilter'))
//	WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), findTestData('IMiAsssist_dashbord').getValue(8, 1))
	 WebUI.delay(4)
	 WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), '9848321787')
	 
	 WebUI.delay(2)
	 actulphonenumber=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Phonenumber_text_fromv_visiblelistinsearchfield'))
	 expectedphonenumber=findTestData('Appointment_creation_popup_Test_data').getValue(8, 1)
		 
	   if(actulphonenumber.equals(expectedphonenumber))
	  {
		KeywordUtil.markPassed('SUCCESS:Agent able to search with phonenumber')
		
//		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))
//		
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
	  }
	  else
	  {
		  KeywordUtil.markFailed('ERROR:Agent unable to search with phonenumber')
		  WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		  
	  }
	  KeywordUtil.markPassed('SUCCESS:Agent able to search with phonenumber')
	  
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to search with phonenumber:'+e.getMessage())
		
	}
	
	/*//Search with customer name
	
	WebUI.delay(4)
	try
	{
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Scehuleanappointmentfilterwithphonnumber'))
//   Select the Customername
	 WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Selectcustomernamefromfilter'))
//	WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), findTestData('IMiAsssist_dashbord').getValue(8, 1))
	WebUI.clearText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Searchwithcsname'))
	  WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Searchwithcsname'), findTestData('Appointment_creation_popup_Test_data').getValue(9, 1))
	  WebUI.delay(4)
	 actulcustomername=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Serchcustomernameobject'))
	 expectedCustomername=findTestData('Appointment_creation_popup_Test_data').getValue(9, 1)
	 WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Work_Space/TC_1156_57_58_60_Check_whether_admin_agent_is_able_to_search_customer_using_phone_number_search_with_Customername.png')
	 
	  if(actulcustomername.equals(expectedCustomername))
	  {
		KeywordUtil.markPassed('SUCCESS:Agent able to search with Customer Name')
		
//		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))
//
//		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
	
	  }
	  else
	  {
		  KeywordUtil.markFailed('ERROR:Agent unable to search with Customer Name')
		  
	  }
	  KeywordUtil.markPassed('SUCCESS:Agent able to search with Customer Name')
	  
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to search with Customer Name:'+e.getMessage())
		
	}
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Customernamefromsearchfiel_object'))

	WebUI.delay(4)
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_keyboard_arrow_down (1)'))
	
	WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_calendar_today'), findTestData('IMiAsssist_dashbord').getValue(13, 1))
	WebUI.delay(5)
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Assign to me'))
	
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Rafitestp shaiktestpp'))
	
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Schedule'))
	
	WebUI.delay(4)
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))

	WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))

	KeywordUtil.markPassed('SUCCESS:Agent able to create appointment with exsting cutomer')
//*///}
/*catch (Exception e)
 {
    KeywordUtil.markFailed('ERROR::Agent unable to create the appointment with existing customer:'+e.getMessage())
}*/ 

