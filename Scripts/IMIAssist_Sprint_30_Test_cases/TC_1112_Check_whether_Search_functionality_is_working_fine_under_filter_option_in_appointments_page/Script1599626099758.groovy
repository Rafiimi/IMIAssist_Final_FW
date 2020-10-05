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
WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))

    WebUI.delay(3)
WebUI.maximizeWindow()
    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(4, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(5, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
	
	try
	{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown (2)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Specialty (2)'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/li_test'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Assigned (1) (2)'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_filter_list'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Qaprofiletesttime'))
WebUI.delay(2)

WebUI.setText(findTestObject('AppointmentCreationpopup/Search_Teamfiled_object'), findTestData('IMIAssist_sprint30_testdata').getValue(9, 1))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_APPLY FILTER'))
KeywordUtil.markPassed('SUCCESS:Agnet able to select the apply button under filter section')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agnet unable to select the apply button under filter section:'+e.getMessage())
		
	}
	WebUI.delay(3)
	try
	{
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Filters Applied    Qaprofiletesttime  c_96bac4'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Qaprofiletesttime'))
Selectedteam=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Qaprofiletesttime'))
println(Selectedteam)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/TC_1128_Verify_if_appointments_are_displaying_correctly_according_to_the_team_selected.png')
Expectedselectteam=Selectedteam.substring(0)
if(Selectedteam.equals(Expectedselectteam))
{
	KeywordUtil.markPassed('SUCCESS:appointments are displaying correctly according to the team selected')

}
else
{
KeywordUtil.markFailed('ERROR:appointments are not displaying correctly according to the team selected')

}

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:appointments are not displaying correctly according to the team selected:'+e.getMessage())
		
	}
WebUI.delay(3)
//	WebUI.delay(5)
//	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Filter_Clear_object'))


WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
KeywordUtil.markPassed('SUCCESS:appointments are displaying correctly according to the team selected')

}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:appointments are not displaying correctly according to the team selected')
	
}