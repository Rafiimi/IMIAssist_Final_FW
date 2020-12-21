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

    WebUI.navigateToUrl(findTestData('Appointmentcreation_UI').getValue(1, 1))
	WebUI.maximizeWindow()
	
WebUI.delay(4)
 WebUI.setText(findTestObject('null'), 
        findTestData('Appointmentcreation_UI').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('Appointmentcreation_UI').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	try
	{
	WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Custome_attributes'))
WebUI.delay(3)
//WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/firstattributeobject'))
WebUI.delay(2)

/*Addedattributeplussstatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Attributeadded_icon_objct'))
if(Addedattributeplussstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Attributeaddedplussicon is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Attributeaddedplussicon is not available under attribute popup')
	
}*/
WebUI.delay(2)
/*AddedAttribute=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/firstattributeobject'), 'title')
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributeadded_icon_objct'))
WebUI.delay(3)*/
WebUI.mouseOver(findTestObject('Object Repository/AppointmentCreationpopup/Phonenumberattribute'))
WebUI.delay(2)
Addedphonumber=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Phonenumberattribute'), 'title')
WebUI.delay(2)
phonelable=Addedphonumber.substring(9, 13)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attribute_pluss_object'))
WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Phoneplussicon'))
//WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Save_button_Object_on_attribute_popup'))
WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AssignedTab_object'))
//WebUI.delay(2)
//location=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Addedattribute'), 'title')
//WebUI.delay(3)
//if(AddedAttribute.contains('Location'))
//{
//	KeywordUtil.markPassed('SUCCESS:Attributeaddedplussicon is available under attribute popup')
//	
//}
//else
//{
//	KeywordUtil.markFailed('ERROR:Atributeaddedplussicon is not available under attribute popup')
//	
//	
//}

afterupdatedphonattribute=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/phonenumberattributeafteradded_obj'), 'title')
WebUI.delay(3)

if(afterupdatedphonattribute.contains('Phone: +'))
{
	KeywordUtil.markPassed('SUCCESS:Attributes are addded in order on every appointment')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Attributes are not addded in order on every appointment')
	
	
}

	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Attributes are not addded in order on every appointment')
		
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributepopupcloseicon_obj'))
		WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributediscardbutton'))
	}
KeywordUtil.markPassed('SUCCESS:Attributes are addded in order on every appointment')

WebUI.delay(2)
WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Attributes are not addded in order on every appointment'+e.getMessage())

	
}

