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
import java.util.logging.Logger
import com.kms.katalon.core.util.KeywordUtil


/*WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData("Allthetabsatagentside").getValue(1, 1))

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("Allthetabsatagentside").getValue(2, 1))

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),
	findTestData("Allthetabsatagentside").getValue(3, 1))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))*/
try
{
	
	/*WebUI.openBrowser('')
 WebUI.navigateToUrl(findTestData("Allthetabsatagentside").getValue(1, 1))

 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("Allthetabsatagentside").getValue(2, 1))
 
 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),
	 findTestData("Allthetabsatagentside").getValue(3, 1))
 
 WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))*/
	WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assesmenticon_object'))
WebUI.waitForElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Reporttab_object'), 2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Reporttab_object'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Episodes_cases -Object'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Episodes_navigation_object'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/CaseId_object'))
WebUI.delay(3)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Activity'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_dd-11601-1 19 minutes ago'))
WebUI.takeScreenshot('D:\\IMI_Automation\\IMI_Automation_files\\IMIAssist_Automtion\\Test Cases\\IMIAssist_Automation_Test_Snapshots\\Agent_Side_Tabs\\TC_1002_Verify_the_user_able_to_open_the_cases.png')
Logger.getLogger('User successfully navigated into cases page')
KeywordUtil.markPassed('SUCCESS: User successfully navigated into cases page')

}
catch(Exception e)
{
	Logger.getLogger('User unable to navigate into cases page '+e.getMessage()) 
	KeywordUtil.markFailed('ERROR: User unable to navigate into cases page')
	
}

//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
//
//WebUI.closeBrowser()