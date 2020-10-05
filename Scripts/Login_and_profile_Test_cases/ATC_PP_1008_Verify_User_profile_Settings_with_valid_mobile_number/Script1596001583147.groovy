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

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("Allthetabsatagentside").getValue(2, 1))
WebUI.delay(3)

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),
	findTestData("Allthetabsatagentside").getValue(3, 1))
WebUI.delay(3)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))*/
WebUI.waitForElementClickable(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'),2)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_create'))
WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Phone_iti__selected-flag'))
//
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_India ()'))
//
WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_mobinput'), '9848321787')

//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/timezoneformat_object'))
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/indiatimezone'))
//WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_SAVE'))
profileconfirmationtext=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/profileupdateconfirmationObject'))
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\ATC_PP_1008_Verify_User_profile_Settings_with_valid_mobile_number.png')
if(profileconfirmationtext.equals(prifleconfirmationexpectedmessage))
{
	KeywordUtil.markPassed('SUCCESS:Agent updated profile details(time zone) successfully')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Agent is not updated profile details(time zone)')
	
}

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
WebUI.closeBrowser()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent is not updated profile details(time zone)')
	
}

//WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-email'), 'rafishaik.m@imimobile.com')
//
//WebUI.setEncryptedText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
//    '8iCYD4GIjdw4/kH7Efyk5A==')
//
//WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
//
//WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))
//
//WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile'))
//
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/p_918639183074'))
//
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))*/

/*WebUI.delay(5)
WebUI.closeBrowser()*/
