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
import com.kms.katalon.core.util.KeywordUtil
try
{
	/*
	WebUI.openBrowser('')
	
	
	  WebUI.navigateToUrl(findTestData('TestDataforLogin').getValue(1, 1))
	
		WebUI.delay(3)
		WebUI.maximizeWindow()
		
	
		WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'),
			findTestData('TestDataforLogin').getValue(2, 1))
	
		WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'),
			findTestData('TestDataforLogin').getValue(3, 1))
	
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))*/
WebUI.delay(2)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Department'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Brandlogondashbord'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Department_testing_object'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Theme Settings'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentmangementab'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointment_settingstab'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentduration_object'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/duration_size_object'))
WebUI.delay(2)
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/Appointmentsettingssavebutton'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Savbutton_object'))
try{
Appointmentsettingsconfirmationmessage=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentsettingsconfirmationmessageobject'))
WebUI.delay(2)
appointmentconfimationexpmessage=findTestData('IMiAsssist_dashbord').getValue(18, 1)
if(Appointmentsettingsconfirmationmessage.equals(appointmentconfimationexpmessage))
{
	KeywordUtil.markPassed('SUCCESS: Agent able to update the appointment settings')
	
}
else
{
	KeywordUtil.markFailed('ERROR: Agent unable to update the appointment settings')
	
}
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Agent_Side_Tabs\\Tc_1006_Verify_user_able_to_naviagte_appointment_settings.png')
KeywordUtil.markPassed('SUCCESS: Agent able to update appointment settings confirmation message')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to update appointment settings confirmation message:'+e.getMessage())
	
}

/*WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
WebUI.delay(5)
WebUI.closeBrowser()*/
KeywordUtil.markPassed('SUCCESS: Agent able to update appointment settings')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to update appointment settings:'+e.getMessage())
	
}
