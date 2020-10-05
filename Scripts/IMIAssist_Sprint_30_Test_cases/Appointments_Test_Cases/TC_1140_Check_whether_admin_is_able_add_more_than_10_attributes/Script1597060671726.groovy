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


Appointmentconfirmationtextvalue='Appointment Scheduled Successfully'
try
{
WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
	WebUI.maximizeWindow()
	
WebUI.delay(4)
 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
	try
	{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Custome_attributes'))
//WebUI.delay(2)
//WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/location_remove-Object'))
//WebUI.delay(2)
//
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/location_remove-Object'))
//WebUI.delay(2)
//WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/firstattributeobject'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AddplussSymbol_object'))
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributepopupcloseicon_obj'))
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributediscardbutton'))

//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Save_button_Object_on_attribute_popup'))

//WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/firstattributeobject'))
////WebUI.delay(4)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AddplussSymbol_object'))
KeywordUtil.markPassed('SUCCESS:Agent successfully added the attribute under settings attribute popup')
	}
	
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to add the attribute under settings attribute popup'+e.getMessage())

	
}
WebUI.delay(2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to add the attribute under settings attribute popup'+e.getMessage())
	
}

