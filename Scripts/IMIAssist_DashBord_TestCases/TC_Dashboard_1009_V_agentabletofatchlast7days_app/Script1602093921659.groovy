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
//Department admin selection from view as drop down
try
{
	
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Selecttimeperiod_dd'))
WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Last7days_option'))

}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to Last30days from view as drop down :'+e.getMessage())
	
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
//CustomKeywords.'reusableKeywords.Reusable.Logout'()
