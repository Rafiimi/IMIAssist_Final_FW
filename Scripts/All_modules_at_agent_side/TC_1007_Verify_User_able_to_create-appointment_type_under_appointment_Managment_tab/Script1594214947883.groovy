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
	
/*	WebUI.openBrowser('')
	
	
	  WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	
		WebUI.delay(3)
		WebUI.maximizeWindow()
		
	
		WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'),
			findTestData('IMiAsssist_dashbord').getValue(2, 1))
	
		WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'),
			findTestData('IMiAsssist_dashbord').getValue(3, 1))
	
		WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))*/
		
WebUI.delay(2)
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_settings'))
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Department'))
//
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Brandlogondashbord'))
//WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Department_testing_object'))
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Theme Settings'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentmangementab'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Appointment type'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Create Appointment Type'))
WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/Appointmentype_frame'))
WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/Appointmenttypetextfield'), findTestData("Allthetabsatagentside").getValue(4, 1))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_select_team_1'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Fieldtest Team'))
WebUI.delay(2)
try
{
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmenttypecreatebutton'))
appointment_typecreatetext=WebUI.getText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/appointmenttypeconfirmationtext'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Agent_Side_Tabs\\TC_1007_Verify_User_able_to_create-appointment_type_under_appointment_Managment_tab.png')

WebUI.delay(2)
Appointmenttypeexpectedconftext=findTestData("Allthetabsatagentside").getValue(8, 1)
if(Appointmenttypeexpectedconftext.equalsIgnoreCase(appointment_typecreatetext))
{
	KeywordUtil.markPassed('SUCCESS: Agent able to create appointment type and able to see the confimation message')
	
}
else
{
	KeywordUtil.markFailed('ERROR: Agent Unable to create appointment type')
//	WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Closebuttoncreateappointmenttype'))
}
KeywordUtil.markPassed('SUCCESS: Agent able to create appointment type and able to see the confimation message')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to create appointment type')
	WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Closebuttoncreateappointmenttype'))

}

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))

WebUI.closeBrowser()
KeywordUtil.markPassed('SUCCESS: Agent able to create appointment type')

}
catch(Exception e)
{
	WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))
	
	WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
	KeywordUtil.markFailed('ERROR: Agent Unable to create appointment type')
	
}
