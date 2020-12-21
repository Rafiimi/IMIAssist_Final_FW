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

Appointmentcanceltext='cancelled successfully';
try {
   CustomKeywords.'reusableKeywords.Reusable.Login'()
	WebUI.delay(3)

	try
	{

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Assigned_atab_object'))

	WebUI.click(findTestObject('Page_eClinic - Video Consultations/Appointmentviewrow'))
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_Clear_appointments-row-checkbox'))

	WebUI.delay(3)
	
	
    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Cancel_appointment_icon'))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Cancel Appointment   clear     Are you _67bfbc'))

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Yes'))
	KeywordUtil.markPassed('SUCCESS:Agent successfully cancel the appointment')
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent is not canceled successfully')
		
	}
	
	try
	{
	cacelconfirmationtext=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/Appointmentcancelconfirmationtext'))
	
	Expectedcancelledconfirmationtext=findTestData('IMiAsssist_dashbord').getValue(22, 1)
	
	
	if(cacelconfirmationtext.contains(Expectedcancelledconfirmationtext))
	{
		KeywordUtil.markPassed('SUCCESS:Appointment canceled successfully and cancel confirmation message is matched')
		
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Appointment is not canceled successfully and cancel confirmation message is not matched')
		
	}
	KeywordUtil.markPassed('SUCCESS:Appointment canceled successfully and cancel confirmation message is matched')
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Appointment is not canceled successfully and cancel confirmation message is not matched')
		
	}
	WebUI.delay(3)
//	CustomKeywords.'reusableKeywords.Reusable.Login'()
	KeywordUtil.markPassed('SUCCESS:Appointment canceled successfully')
	
}
catch (Exception e) 
{
	KeywordUtil.markFailed('ERROR:Appointment is not canceled successfully:'+e.getMessage())
	
} 

