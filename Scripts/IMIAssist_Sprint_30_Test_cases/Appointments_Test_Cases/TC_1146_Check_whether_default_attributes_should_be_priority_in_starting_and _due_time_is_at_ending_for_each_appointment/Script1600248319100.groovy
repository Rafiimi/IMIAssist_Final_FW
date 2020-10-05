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
WebUI.openBrowser('')


    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))
WebUI.delay(4)
WebUI.maximizeWindow()

 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

	WebUI.delay(3)
	WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'), 2)
   WebUI.click(findTestObject('Page_eClinic - Video Consultations/i_insert_invitation'))


   WebUI.delay(2)
   WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/AssignedTab_object'))
   WebUI.delay(2)
   duetextvalue=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/duelabeltextobject'),'title')
   WebUI.delay(2)
if(duetextvalue.contains('Due'))
{
	KeywordUtil.markPassed('SUCCESS: default attributes is available in starting and  due time is at ending for each appointment')
	
}
else
{
	KeywordUtil.markFailed('ERROR:default attributes not isavailable in starting and  due time is at ending for each appointment')
} 
WebUI.delay(3)
WebUI.delay(2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown (3)'))
 
 WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (8)'))
	KeywordUtil.markPassed('SUCCESS:default attributes is available in starting and  due time is at ending for each appointment')

}
catch(Exception e)
{
		KeywordUtil.markFailed('ERROR:default attributes is not available in starting and  due time is at ending for each appointment'+e.getMessage())
	
}

