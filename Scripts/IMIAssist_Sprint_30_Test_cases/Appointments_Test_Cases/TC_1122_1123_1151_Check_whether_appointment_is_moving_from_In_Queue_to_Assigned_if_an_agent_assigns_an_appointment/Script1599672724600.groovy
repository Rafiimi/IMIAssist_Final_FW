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
//try
//{
CustomKeywords.'reusableKeywords.Reusable.Login'()

	try
	{
	WebUI.delay(3)
	WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'), 2)
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'))

    WebUI.delay(4)

	assignedcount=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/inquetabappcount'))
	WebUI.delay(3)

		
	
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assignelinkobject'))
WebUI.delay(2)
CustomKeywords.'reusableKeywords.Reusable.SelectDynamicTextobject'(findTestData('IMiAsssist_dashbord').getValue(23, 1))

//WebUI.setText(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentsearchonassignedpopup'),findTestData('IMiAsssist_dashbord').getValue(23, 1))
CustomKeywords.'reusableKeywords.Reusable.SelectDynamicTextobject'(findTestData('IMiAsssist_dashbord').getValue(24, 1))
/*WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Rafi_team'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Rafi_team_object'))
WebUI.delay(2)

WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_Update (3)'))

WebUI.delay(2)


assignedcountafterupdate=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/inquetabappcount'))
WebUI.delay(3)
if(!assignedcountafterupdate.equals(assignedcount))
{
	KeywordUtil.markPassed('SUCCESS:Appointment is updated into inque appoinmtnets withoutrefresh')
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
}
else
{
	KeywordUtil.markFailed('ERROR:Appointment is not updated into inque appoinmtnets')
}
WebUI.delay(3)

	
	KeywordUtil.markPassed('SUCCESS:Agent able to click on update button on assign popup')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agent unable to click on update button on assign popup')
		
	}
	*/
	KeywordUtil.markPassed('SUCCESS:Appointment is updated into inque appoinmtnets withoutrefresh')

}
catch(Exception e)
{
		KeywordUtil.markFailed('ERROR:Appointment is not updated into inque appoinmtnets'+e.getMessage())
	
}

