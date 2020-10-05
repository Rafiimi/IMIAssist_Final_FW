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
import com.kms.katalon.core.util.KeywordUtil


try
{
/*WebUI.openBrowser('')


WebUI.navigateToUrl(findTestData("TestDataForchangepassword").getValue(1,1))

WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TestDataForchangepassword").getValue(2,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataForchangepassword").getValue(3,1))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_LOGIN'))*/


WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Speciality_Object'))

Teamscount=WebUI.getNumberOfTotalOption(findTestObject('Object Repository/AppointmentCreationpopup/Teamslist_object'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Settings_icon_object'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/SettingsTab_object'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Teams_Tab_Object'))
WebUI.delay(3)
Teamcountfromtamstab=WebUI.getNumberOfTotalOption(findTestObject('Object Repository/AppointmentCreationpopup/Teams_count_Objects'))


if(Teamscount.equals(Teamcountfromtamstab))
{
KeywordUtil.markPassed('SUCCESS:Teams count is matched with under teams tab')

}

else
{
	KeywordUtil.markFailed('ERROR:Teams count is not matched with under teams tab')
	
}

WebUI.delay(2)
/*WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))*/
KeywordUtil.markPassed('SUCCESS:Teams count is matched with under teams tab')


}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Teams count is not matched with under teams tab:'+e.getMessage())
	
}
