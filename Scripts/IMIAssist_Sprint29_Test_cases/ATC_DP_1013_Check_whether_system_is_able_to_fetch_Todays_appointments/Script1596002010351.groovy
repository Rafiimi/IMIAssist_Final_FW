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

WebUI.delay(5)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select time period  Today'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Last 90 Days'))

closedappointmentscount=WebUI.getText(findTestObject('Page_eClinic - Video Consultations/closedappointmentscount'))
WebUI.delay(3)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Dashboard/ATC_DP_1013_Check_whether_system_is_able_to_fetch_Todays_appointments.png')

if(!closedappointmentscount.equals('0'))
{
	KeywordUtil.markPassed('SUCCESS:Closed appointments is updated successfully')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Closed appointments is not updated successfully')
	
}
WebUI.delay(3)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Closed appointments is not updated successfully:'+e.getMessage())
	
}
