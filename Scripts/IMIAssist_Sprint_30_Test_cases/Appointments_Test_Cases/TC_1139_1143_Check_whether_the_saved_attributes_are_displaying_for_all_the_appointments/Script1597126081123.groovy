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
 WebUI.setText(findTestObject('null'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
	try
	{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Custome_attributes'))
WebUI.delay(2)
WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/firstattributeobject'))
WebUI.delay(3)
Addedattributeplussstatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Attributeadded_icon_objct'))
if(Addedattributeplussstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Attributeaddedplussicon is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Attributeaddedplussicon is not available under attribute popup')
	
}

	}
	catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Attributeaddedplussicon is not available under attribute popup:'+e.getMessage())
	
}

WebUI.delay(3)
try
{
AddedAttribute=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/firstattributeobject'), 'title')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attribute_pluss_object'))
WebUI.delay(3)
	
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributeadded_icon_objct'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Save_button_Object_on_attribute_popup'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AssignedTab_object'))
WebUI.delay(2)

location=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Addedattribute'), 'title')
locationattribute=location.substring(0, 7)
WebUI.delay(3)
if(AddedAttribute.contains(locationattribute))
{
	KeywordUtil.markPassed('SUCCESS:Attribute added pluss icon is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Atribute added pluss icon is not available under attribute popup')
	
	
}

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to add location attribute:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributepopupcloseicon_obj'))
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributediscardbutton'))
	
	
}

KeywordUtil.markPassed('SUCCESS:Attributeaddedplussicon is available under attribute popup')

WebUI.delay(2)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Attributeaddedplussicon is not available under attribute popup'+e.getMessage())
//	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributepopupclose'))
	WebUI.delay(2)
	WebUI.click(findTestObject('null'))
	
	WebUI.click(findTestObject('null'))
}

