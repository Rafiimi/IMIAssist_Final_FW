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
	WebUI.delay(3)
	try
{
		ViewAsLablestatus=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Viewaslable'))

		if(ViewAsLablestatus==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the viewas lable')
		
			Viewasdropdown=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Viewasdropdown'))
			if(Viewasdropdown==true)
			{
				KeywordUtil.markPassed('SUCCESS:Agent able to see the viewas dropdown')		
			}
			
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the viewas Drop Down:')
			
		}
}
	catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the viewas Drop Down:'+e.getMessage())
	
}
try
{
	TimePeriodLablestatus=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/TImePeriodlable'))
	
	if(TimePeriodLablestatus==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the time period lable')
		
			TimePerioddropdown=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/TImePeriod_dropDown'))
			if(TimePerioddropdown==true)
			{
				KeywordUtil.markPassed('SUCCESS:Agent able to see the TimePerioddropdown')		
			}
			
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the TimePerioddropdown:')
			
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the TimePerioddropdown:'+e.getMessage())
	
}

//Count
try
{
	Closedappointments=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Closedappointments'))
	
	if(Closedappointments==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the closed appointments section')
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the closed appointments section')	
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the closed appointments section:'+e.getMessage())
	
}

try
{
	Esclatedappointments=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Esclated_appointmentlable'))
	
	if(Esclatedappointments==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the esclatedappointments section')
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the esclatedappointments section')
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the esclatedappointments section:'+e.getMessage())
	
}

try
{
	CustomerDNA=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Customer_Dna'))
	
	if(CustomerDNA==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the customerDNA section')
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the CustomerDNA section')
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the CustomerDNA section:'+e.getMessage())
	
}

try
{
	Avg_handle_time=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Avg_handle_time'))
	
	if(Avg_handle_time==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the Avg_handle_time section')
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the Avg_handle_time section')
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the Avg_handle_time section:'+e.getMessage())
	
}

try
{
	Assigned_appointments=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Assigned_appointments'))
	
	if(Assigned_appointments==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the Assigned_appointments section')
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the Assigned_appointments section')
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the Assigned_appointments section:'+e.getMessage())
	
}

//Customer satisfcation Chat

try
{
	Customer_Satisfacion_chat=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Customer_Satisfacion_chat'))
	
	if(Customer_Satisfacion_chat==true)
		{
			KeywordUtil.markPassed('SUCCESS:Agent able to see the Customer_Satisfacion_chat section')
		}
		else
		{
			KeywordUtil.markFailed('ERROR:Agent able to see the Customer_Satisfacion_chat section')
		}
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to see the Customer_Satisfacion_chat section:'+e.getMessage())
	
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