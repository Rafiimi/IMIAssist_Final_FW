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
try
{
	WebUI.openBrowser('')
	WebUI.navigateToUrl(findTestData('IMIA_Dashboard').getValue(1, 1))
	WebUI.delay(3)
	WebUI.maximizeWindow()
	WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'),
		findTestData('IMIA_Dashboard').getValue(2, 1))
	WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'),
		findTestData('IMIA_Dashboard').getValue(3, 1))
	WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to login the application :'+e.getMessage())
}
WebUI.delay(5)
try
{
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Selecttimeperiod_dd'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Last 90 Days'))

}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to Last 90 Days from view as drop down :'+e.getMessage())
	
}
try
{
	Apcount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Assignedappointmentcountobject')).trim()
	if(Apcount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:Appointment Count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Appointment Count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointment Count is updated successfully:'+e.getMessage())
	
}

WebUI.delay(3)
//  appointment's Count validation
try
{
	Inquecount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/In_que_appointmentCount')).trim()
	if(Inquecount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:Inqueappointment Count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Inqueappointment Count is updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Inqueappointment Count is updated successfully:'+e.getMessage())
	
}
try
{
WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to logouted the application:'+e.getMessage())
	
}
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
try
{
WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to logouted the application:'+e.getMessage())
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Closed appointments is not updated successfully:'+e.getMessage())
	
}
