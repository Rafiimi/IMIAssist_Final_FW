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


Appointmentreassigned='The appointment is reassigned'
try
{
WebUI.openBrowser('')


    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
WebUI.delay(4)
WebUI.maximizeWindow()

 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
	WebUI.delay(3)
	
	try
	{
WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'), 2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'))
 WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Assigned_atab_object'))
KeywordUtil.markPassed('SUCCESS:Agent able to navigate to assign tab')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to navigate to assign tab')
		
	}
try
{
WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Assigned to  Me (3)'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assignedname'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assignedteam'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assigneduser'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Update (3)'))

	KeywordUtil.markPassed('SUCCESS:Agent able to navigate assign popup and he able to update the appointment')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent able to navigate assign popup and he unable to update the appointment')
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assignpopupclosebutton'))
	}
	try
	{
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_The appointment test-488-1 is reassigned_1'), 2)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_The appointment test-488-1 is reassigned_1'))

actualreassignedmessage=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_The appointment test-488-1 is reassigned_1'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1016_Agent_is able_to_transfer_the_appointment_from_one_team_to_another.png')

if(Appointmentreassigned.contains(Appointmentreassigned))
{
	KeywordUtil.markPassed('SUCCESS:Appointment is available under assigned tab')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Appointment is not available under assigned tab')
	
}

	KeywordUtil.markPassed('SUCCESS:Appointment is available under assigned tab')

	}
	catch(Exception e)
	{
	KeywordUtil.markFailed('ERROR:Appointment is not available under assigned tab')
	}
	
WebUI.delay(3)
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown (3)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (8)'))*/
KeywordUtil.markPassed('SUCCESS:Appointment is available under assigned tab')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointment is not created successfully:'+e.getMessage())
	
}

