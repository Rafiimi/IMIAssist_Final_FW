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
        findTestData('IMiAsssist_dashbord').getValue(4, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(5, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
	try
	{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Custome_attributes'))
WebUI.delay(4)
Appointmentidstatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentid_attributes'))

if(Appointmentidstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Appointment id attribute is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Appointment id attribute is not available under attribute popup')
	
}
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Appointment id attribute is not available under attribute popup:'+e.getMessage())
		
	}
WebUI.delay(3)

try
{
Appointmentypestatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Appointmentypeattributeobject'))
if(Appointmentypestatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Appointmentype attribute is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Appointmentype attribute is not available under attribute popup')
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Appointmentype attribute is not available under attribute popup:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
Descriptionstatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Description_object'))
if(Descriptionstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Descriptions attribute is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Descriptions attribute is not available under attribute popup')
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Descriptions attribute is not available under attribute popup:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
Duetimestatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Due_type_object'))
if(Duetimestatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Duetime attribute is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Duetime attribute is not available under attribute popup')
	
}
}
catch(Exception e)
{
		KeywordUtil.markFailed('ERROR:Duetime attribute is not available under attribute popup:'+e.getMessage())

	
}
WebUI.delay(3)
try
{
prioritystatus=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/priority_object_under_attributes'))
if(prioritystatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Priority attribute is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Priority attribute is not available under attribute popup')
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Priority attribute is not available under attribute popup:'+e.getMessage())

	
}
WebUI.delay(3)
try
{
Created_Date_time=WebUI.verifyElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Created_date_time'))
if(Created_Date_time==true)
{
	KeywordUtil.markPassed('SUCCESS:Created_Date_time attribute is available under attribute popup')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Created_Date_time attribute is not available under attribute popup')
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Created_Date_time attribute is not available under attribute popup:'+e.getMessage())

	
}
WebUI.delay(3)

KeywordUtil.markPassed('SUCCESS:All attributes are displaying under attribute popup')
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributepopupcloseicon_obj'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Attributes are not displaying under attribute popup:'+e.getMessage())
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Attributepopupcloseicon_obj'))
}

