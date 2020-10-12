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

/*try
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
}*/
WebUI.delay(5)
//Department admin selection from view as drop down
try
{
	
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Viewasdropdown'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Departmentadmin_object'))

}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to department admin from view as drop down :'+e.getMessage())
	
}
WebUI.delay(5)
try
{
	
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Selecttimeperiod_dd'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Today_option_fdd'))

}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to today from view as drop down :'+e.getMessage())
	
}
WebUI.delay(5)
//  appointment's Count validation
try
{
	Apcount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Assignedappointmentcountobject')).trim()
	if(Apcount>=0)
	{
    KeywordUtil.markPassed('SUCCESS:Appointment Count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Appointment Count is updated successfully')
		
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

/*try
{
WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to logouted the application:'+e.getMessage())
	
}*/