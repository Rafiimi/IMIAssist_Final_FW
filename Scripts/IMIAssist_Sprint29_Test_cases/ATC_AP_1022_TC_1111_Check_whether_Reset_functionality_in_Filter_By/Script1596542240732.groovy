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
//CustomKeywords.'reusableKeywords.Reusable.Login'()

	WebUI.delay(2)
	try
	{
WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))
   WebUI.delay(2)
   
   WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))

   WebUI.delay(3)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Specialty (3)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Quality Assuranc (2)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Assigned (1) (3)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_filter_list (1)'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Testing'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_APPLY FILTER (1)'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Filters Applied    Testing  close      _22fdaf'))
applyfilterteamname=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Filters Applied    Testing  close      _22fdaf'))
println(applyfilterteamname)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Reset'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Filters Applied        18-Jul-20 - 25-J_fadd5f'))
resetfiltername=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Filters Applied        18-Jul-20 - 25-J_fadd5f'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/ATC_AP_1022_Check_whether_Reset_functionality_in_Filter_By.png')

if(!resetfiltername.equals(applyfilterteamname))
{
	KeywordUtil.markPassed('SUCCESS:Reset functionality is working fine as per expected')

}
else
{
KeywordUtil.markFailed('ERROR:Reset functionality is not working fine as per expected ')

}


	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to perform reset functionality:'+e.getMessage())
		
	}

WebUI.delay(3)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
KeywordUtil.markPassed('SUCCESS:Reset functionality is working fine as per expected')

}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:Reset functionality is not working fine as per expected'+e.getMessage())
	
}