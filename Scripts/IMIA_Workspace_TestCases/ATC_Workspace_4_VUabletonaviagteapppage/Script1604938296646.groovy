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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'In same Script added below cases\r\nTC_Workspace_7\r\nTC_Workspace_8'
//CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.Naviagateappointmentpage'()

WebUI.delay(3)

//Verify whether agent is able to navigate to Appointments page using Appointments link in workspace pagetry
try {
    Appointmentpageheadertext = WebUI.getText(findTestObject('Object Repository/Workspace_Objects/AppointmentPageHeader'))

    WebUI.delay(3)

    Expapphtext = findTestData('IMIA_cases_testData').getValue(1, 1)

    if (Appointmentpageheadertext.equals(Expapphtext)) {
        KeywordUtil.markPassed('SUCESS:Agent able to navigate to the appointment page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent able to navigate to the appointment page:' + e.getMessage())
} 

//Verify Email field Validation while sending the video link
try {
    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_New Appointment   close          Start _142398'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Start_an_appointment'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Next (3)'))

    KeywordUtil.markPassed('SUCCESS:Agent able to select start an appointment on appointment creation popup and he able to naviagte appointment creation popup')
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent Unable to select start an appointment :' + e.getMessage())

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/cancelbutton_on_Appointmentcreation_popup'))
} 

WebUI.delay(3)

try {
    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select Team'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Rafi'))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Rafi_customerSearchInput'), 'rafi')

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Rafi Shaik'))
	WebUI.delay(3)
	
		WebUI.clearText(findTestObject('Object Repository/Workspace_Objects/Phonenumber_object'))
	
		WebUI.setText(findTestObject('Object Repository/Workspace_Objects/Phonenumber_object'), findTestData('IMIA_Appointment_page_Testdata').getValue(
				4, 1))
		WebUI.delay(3)
		/*updatedphonenumber=WebUI.getAttribute(findTestObject('Object Repository/Workspace_Objects/Phonenumber_object','name'))
		WebUI.delay(2)
//		Expectedphonenumber=findTestData('IMIA_Appointment_page_Testdata').getValue(4, 1)
		if(updatedphonenumber.equals('customerPhone'))
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to edit the phonenumber and he able to send customer link')
		} 
		
		else 
	{
			KeywordUtil.markFailed('ERROR:Agent unable to edit the phonenumber and he able to send customer link')
		
		}
*/    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Workspace_Objects/Videocall_Email_RB'))

    WebUI.delay(3)

    WebUI.clearText(findTestObject('Object Repository/Workspace_Objects/Email_Id_text_field'))

    WebUI.setText(findTestObject('Object Repository/Workspace_Objects/Email_Id_text_field'), findTestData('IMIA_Appointment_page_Testdata').getValue(
            2, 1))

    WebUI.delay(3)

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_SEND SMS'))

    WebUI.delay(3)

    Invalidemail_object = WebUI.getText(findTestObject('Object Repository/Workspace_Objects/Invalidemailerror'))

    WebUI.delay(3)

    ExpectedinavalidemailText = findTestData('IMIA_Appointment_page_Testdata').getValue(3, 1)

    if (Invalidemail_object.equals(ExpectedinavalidemailText)) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see the error message about invalid mail')
    } else {
        KeywordUtil.markFailed('ERROR:Agent unable to see the error message about invalid mail')
    }
    
    //Update the phone number
//    WebUI.click(findTestObject('Object Repository/Workspace_Objects/Smsradiobutton'))

   

    /*//	WebUI.delay(3)
    //	WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_SEND SMS'))
    WebUI.delay(3)

    smsconfirmationtext = WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/Smsconfirmationtext_object'))

    smsexpectedconfirmationmessage = findTestData('IMiAsssist_dashbord').getValue(17, 1)

    if (smsconfirmationtext.equals(smsexpectedconfirmationmessage)) {
        KeywordUtil.markPassed('SUCCESS:Agent able to edit the phonenumber and he able to send customer link')
    } else {
        KeywordUtil.markFailed('ERROR:Agent unable to edit the phonenumber and he able to send customer link')
    }*/
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see the error message about invalid mail:' + e.getMessage())
} 

WebUI.delay(3)
CustomKeywords.'reusableKeywords.Reusable.Logout'()

