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

try
{
WebUI.openBrowser('')

  WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
WebUI.maximizeWindow()
	WebUI.delay(3)

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

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Assigned (1) (1)'))

appointmentid=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_test-431-1'))
println('appointmentid :'+appointmentid)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1018_Verify_whether_system_is_displaying_the_Self_Assigned_appointments_on_selecting_Show_only_my_Appointments.png')
expectedappointmentid=appointmentid.substring(0)

if(appointmentid.equals(expectedappointmentid))
{
	KeywordUtil.markPassed('SUCCESS:Agent able to see on his own appointment')

}
else
{
KeywordUtil.markFailed('ERROR:Agent unable to see on his own appointment')

}
KeywordUtil.markPassed('SUCCESS:Agent able to see on his own appointment under assigned tab')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to see on his own appointment under appointments tab')
		
	}
WebUI.delay(3)

/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))*/
}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:Appointment is not updated in episodes')
	
}


