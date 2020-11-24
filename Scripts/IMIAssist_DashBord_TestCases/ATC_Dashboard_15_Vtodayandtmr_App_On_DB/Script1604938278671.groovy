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

//CustomKeywords.'reusableKeywords.Reusable.Login'()

WebUI.delay(5)
try
{
	
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Viewasdropdown'))
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Departmentadmin_object'))

}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to department admin from view as drop down :'+e.getMessage())
	
}
WebUI.delay(5)
try
{
	Todaybuttonstatus=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Today_Tab'))
if(Todaybuttonstatus==true)
{
	WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Today_Tab'))
}

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to select today button on dashboard :'+e.getMessage())
	
}

//Today and tomorrow Appointments count validation


WebUI.delay(3)
try
{
	Unassignedappointmentscount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Unassignedappointmentcount')).trim()
	if(Unassignedappointmentscount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:Unassignedappointments count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Unassignedappointments count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Unassignedappointments count is not updated successfully:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
	Dueappcount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Assignedappointmentcountobject')).trim()
	if(Dueappcount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:Dueapp count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Dueapp count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Dueapp count is updated successfully:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
	Overdueappcount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Overdue_appointments')).trim()
	if(Overdueappcount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:OverDueapp count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:OverDueapp count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:OverDueapp count is updated successfully:'+e.getMessage())
	
}

//Tomorrow appointment Count validation
try
{
	Tmrbuttonstatus=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Tomorrow_Tab'))
if(Tmrbuttonstatus==true)
{
	WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Today_Tab'))
}

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to select Tmr button on dashboard :'+e.getMessage())
	
}

WebUI.delay(3)
try
{
	Unassignedappointmentscount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Unassignedappointmentcount')).trim()
	if(Unassignedappointmentscount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:Unassignedappointments count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Unassignedappointments count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Unassignedappointments count is not updated successfully:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
	Dueappcount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Assignedappointmentcountobject')).trim()
	if(Dueappcount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:Dueapp count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:Dueapp count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Dueapp count is updated successfully:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
	Overdueappcount=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Overdue_appointments')).trim()
	if(Overdueappcount>=0)
	{
	KeywordUtil.markPassed('SUCCESS:OverDueapp count is updated successfully')
	}
	else
	{
		KeywordUtil.markFailed('ERROR:OverDueapp count is not updated successfully')
		
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:OverDueapp count is updated successfully:'+e.getMessage())
	
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

//CustomKeywords.'reusableKeywords.Reusable.Logout'()
