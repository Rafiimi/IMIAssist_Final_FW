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


expectedchangepasswordmessage="credExpired";
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

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Change Password'))
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Change Passwordclose New password and c_06d1ba'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_currentpassword'),findTestData("TestDataForchangepassword").getValue(3,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_form-control form-textbox ng-pr_d955f3'),findTestData("IMIAssist_sprint30_testdata").getValue(4,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_check_confirmpassword'),findTestData("IMIAssist_sprint30_testdata").getValue(4,1))
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_CHANGE'))
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\TC_11_Verify_Change_Password_functionality_with_invalid_credentials.png')

WebUI.waitForPageLoad(3)

Chanagebuttonstatus=WebUI.getAttribute(findTestObject('Object Repository/AppointmentCreationpopup/Changebutton_object'), 'disabled')
WebUI.delay(3)

if(Chanagebuttonstatus.equals('true'))
{
	System.out.println("Password is not changed with invalid data ")
	KeywordUtil.markPassed('SUCCESS:Password is not changed with invalid data')
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Cancelbutton_object'))
}
else
{
	System.out.println("Password is changed with invalid data")
	KeywordUtil.markFailed('ERROR:Password is changed with invalid data')
	
	
}
WebUI.delay(2)

/*WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))*/


}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Password is chnaged with valid data:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Close_button_changepassword'))
}
