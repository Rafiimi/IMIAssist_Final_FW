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
CustomKeywords.'reusableKeywords.Reusable.Login'()

	WebUI.delay(3)
	try
	{
	WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'), 2)
   WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'))

//    WebUI.click(findTestObject('Page_eClinic - Video Consultations/span_Appointments'))

    WebUI.delay(4)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/Assigned_atab_object'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_In Queue (0)     Assigned (9)     New A_ab0d93'))
//Appointmentidtext=WebUI.getText('Page_eClinic - Video Consultations/div_Assigned to  Me (3)')
WebUI.delay(3)
	Inquecount=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Inquecount_Object'))
	WebUI.delay(3)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Assigned to  Me (3)'))
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assignandunassignpopup'))
//WebUI.delay(2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_remove_circle_outline (3)'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Update (3)'))

	
	
	try
	{
Inquecountafterupdate=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Inquecount_Object'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Inque_tab'))
WebUI.delay(3)
if(Inquecount.equals(Inquecountafterupdate))
{
	KeywordUtil.markPassed('SUCCESS:Appointment is updated into inque appoinmtnets withoutrefresh')
CustomKeywords.'reusableKeywords.Reusable.Logout'()
}
else
{
	KeywordUtil.markFailed('ERROR:Appointment is not updated into inque appoinmtnets')
}
	
	KeywordUtil.markPassed('SUCCESS:Agent able to click on update button on assignunassign popup')

	}
	
	catch(Exception e)
	{
	KeywordUtil.markFailed('ERROR:Appointment is not updated into inque appoinmtnets')
		
	}
	
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to click on update button on assignunassign popup'+e.getMessage())
	
}
WebUI.delay(3)

	KeywordUtil.markPassed('SUCCESS:Appointment is updated into inque appoinmtnets withoutrefresh')

}
catch(Exception e)
{
		KeywordUtil.markFailed('ERROR:Appointment is not updated into inque appoinmtnets'+e.getMessage())
	
}

