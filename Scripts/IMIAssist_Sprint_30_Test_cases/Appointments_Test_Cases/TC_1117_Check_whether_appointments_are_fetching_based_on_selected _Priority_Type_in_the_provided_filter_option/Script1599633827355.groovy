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
	WebUI.setText(findTestObject('null'),
		findTestData('IMiAsssist_dashbord').getValue(4, 1))

	WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'),
		findTestData('IMiAsssist_dashbord').getValue(5, 1))

	WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
	try
	{
	WebUI.click(findTestObject('null'))
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Specialty_option_object'))
	
	
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Speciality_change_object'))
	WebUI.delay(3)
	
WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))
WebUI.waitForElementClickable(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'), 3)
WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Filter_object'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Qaprofiletesttime'))

//WebUI.delay(2)
filteroptionText=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Dueoption'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Dueoption'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Overdue_object'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Priority_type_object'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/High_priority_type'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Apply_filter_button'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AssignedTab_object'))
WebUI.delay(4)
Priorityselectionstatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/priority_object'))
//Selectoptiontextfrominquetab=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/AppointmentCreationPopup/priority_object'))
WebUI.delay(2)
if(Priorityselectionstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:User able to select priority option from filter and he able to naviogate Assigned tab')
	
}
else
{
	KeywordUtil.markFailed('SUCCESS:User unable to select priority option from filter and he able to naviogate Assigned tab')
	
}
KeywordUtil.markPassed('SUCCESS:User able to select priority option from filter and he able to naviogate Assigned tab')

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('SUCCESS:User unable to select priority option from filter and he able to naviogate Assigned tab')
		
	}
//	WebUI.delay(3)
//	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Filter_Clear_object'))

WebUI.click(findTestObject('null'))
WebUI.click(findTestObject('null'))
KeywordUtil.markPassed('SUCCESS:appointments are displaying correctly according to the team selected')


}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:appointments are not displaying correctly according to the team selected')
	
}