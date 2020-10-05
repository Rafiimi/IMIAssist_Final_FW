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
prifleconfirmationexpectedmessage='Saved changes successfully'
try{
	

/*WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData("Allthetabsatagentside").getValue(1, 1))
WebUI.maximizeWindow()
WebUI.delay(4)

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData('IMiAsssist_dashbord').getValue(2, 1))
WebUI.delay(3)

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),
	findTestData('IMiAsssist_dashbord').getValue(3, 1))
WebUI.delay(3)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))*/
WebUI.delay(3)
WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'),2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))
WebUI.delay(3)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile'))
WebUI.waitForElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/TImeformate'), 2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Edit_button_object'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/TImeformate'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/timeformatevalue'))
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_SAVE'))
WebUI.delay(2)
profileconfirmationtext=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/profileupdateconfirmationObject'))
println(profileconfirmationtext)
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\TC_10_Verify_whether_Other_Details_is_saving_successfully_by_selecting _time_Format.png')
if(profileconfirmationtext.equals(prifleconfirmationexpectedmessage))
{
	KeywordUtil.markPassed('SUCCESS:Agent updated profile details(time zone) successfully')
}
else
{
	KeywordUtil.markFailed('ERROR:Agent is not updated profile details(time zone)')
	
}

/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))*/
KeywordUtil.markPassed('SUCCESS:Agent updated profile details(time zone) successfully')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent is not updated profile details(time zone)')
	
}


