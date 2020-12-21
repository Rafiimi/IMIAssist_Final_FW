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


    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	
    WebUI.setText(findTestObject('null'), 
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
//    WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))

    popupheadertext = WebUI.getText(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Addcustomericonunderappointmentcreationpopup'))

    Expectedpopupheadertext = findTestData('Appointment_creation_popup_Test_data').getValue(6, 1)

    if (popupheadertext.equals(Expectedpopupheadertext)) {
        KeywordUtil.markPassed('SUCCESS:Header is available on schedule appointment popup')
    } 
    else {
        KeywordUtil.markFailed('ERROR:Header is not available on schedule appointment popup')
    }
	
	
	KeywordUtil.markPassed('SUCCESS:Agent able to see the header leabel on appointment popup')


	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to see the header leabel on appointment popup :'+e.getMessage())
 WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
	}
	try
	{
	WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Scheduleanappointmentfilterobject'))
    WebUI.delay(3)  
	  WebUI.verifyOptionsPresent(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Scheduleanappointmentfilterobject'), 
            ['All', 'Customer Name', 'Phone Number', 'Customer Id', 'Email'])
	  WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/TC_1155_Appointment_Creation _Schedule_an_appointment_popup_Filter_drop_down.png')
	  
	  KeywordUtil.markPassed('SUCCESS:All options are available under filter drop down')
	  
	  
	  }
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:All options are not available under filter drop down:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
		
	}
		
	try
	{
	Customersearchplaceholdertext=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Customersearchfieldunderpopup'), 'placeholder')
	Customersearchexpectedtext=findTestData('Appointment_creation_popup_Test_data').getValue(7, 1)
	WebUI.takeScreenshot('D:/IMIAssist- Automation/IMIAssist_Screenshots/Sprint_29_Screens/ATC_AP_1048_1049Appointment_Creation _Schedule_an_appointment_popup.png')
	
	if(Customersearchplaceholdertext.equals(Customersearchexpectedtext))
	{
		KeywordUtil.markPassed('SUCCESS:Customer search textfiled is available for search')
		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
//		WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Customer search filed is not available for search')
		
	}
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to see the customer search filed:'+e.getMessage())
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
		
		
	}
	WebUI.delay(3)
	/*WebUI.click(findTestObject('null'))
	
	WebUI.click(findTestObject('null'))*/
	KeywordUtil.markPassed("SUCCESS:All fileds are available under schedule an appointment popup")
}

catch (Exception e) {
    KeywordUtil.markFailed('ERROR:All fileds are not available under schedule an appointment popup:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointmentpopupclosebutton'))
	
	} 

