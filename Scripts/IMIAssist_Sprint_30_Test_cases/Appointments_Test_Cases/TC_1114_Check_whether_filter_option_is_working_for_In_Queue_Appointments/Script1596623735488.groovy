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

Selecteteamname='Qaprofiletesttime';
try
{
CustomKeywords.'reusableKeywords.Reusable.Login'()

	WebUI.delay(3)
	try
	{
WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))

WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_filter_list'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Filterobject'))
WebUI.delay(2)

//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Qaprofiletesttime'))

WebUI.delay(2)
filteroptionText=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Dueoption'),'title')
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Dueoption'))
WebUI.delay(6)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Overdue_object'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Apply_filter_button'))
KeywordUtil.markPassed('SUCCESS:Agnet able to select the apply button under filter section')
			
WebUI.delay(2)
try
{
	
Selectoptiontextfrominquetab=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Select_filter_option_from_inque_tab'))

if(filteroptionText.equals(Selectoptiontextfrominquetab))
{
	KeywordUtil.markPassed('SUCCESS:User able to select option from filter and he able to naviogate inque tab')
	
}
else
{
	KeywordUtil.markFailed('SUCCESS:User unable to select option from filter and he able to navigate inque tab')
	
}
	KeywordUtil.markPassed('SUCCESS:User able to select option from filter and he able to navigate inque tab')

	}
	catch(Exception e)
	{
	KeywordUtil.markFailed('SUCCESS:User unable to select option from filter and he able to navigate inque tab')
		
	}
	
	}
	catch(Exception e)
	{
		KeywordUtil.markFailed('ERROR:Agnet unable to select the apply button under filter section:'+e.getMessage())
		
	}
CustomKeywords.'reusableKeywords.Reusable.Logout'()
KeywordUtil.markPassed('SUCCESS:appointments are displaying correctly according to the team selected')


}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:appointments are not displaying correctly according to the team selected')
	
}