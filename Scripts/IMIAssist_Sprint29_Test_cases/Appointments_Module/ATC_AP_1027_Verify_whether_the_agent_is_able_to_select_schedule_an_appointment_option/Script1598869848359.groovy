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
/*WebUI.openBrowser('')
WebUI.delay(3)
  WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
  WebUI.maximizeWindow()
  
  WebUI.setText(findTestObject('null'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

  WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1)) 
    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
*/
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
	WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1027_Appointment_Creation_Verify_whether_the_agent_is_able_to_select_schedule_an_appointment_option.png')
	
WebUI.delay(5)
try
{         
//
//WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))
//
WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
KeywordUtil.markPassed('SUCCESS:Agent able to close schedule appointment popup')

}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to close the schedule appointment popup'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/i_close'))
	
}
WebUI.delay(3)
/*WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))*/

KeywordUtil.markPassed('SUCCESS:Agent able to select schedule an appointment')
	
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to select schedule an appointment'+e.getMessage())
	
}
