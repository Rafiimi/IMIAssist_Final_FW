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
//CustomKeywords.'reusableKeywords.Reusable.Login'()
WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Profiledropdown'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Change Password'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_currentpassword'),findTestData("Login_testdata").getValue(3,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_form-control form-textbox ng-pr_d955f3'),findTestData("Login_testdata").getValue(3,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_check_confirmpassword'),findTestData("Login_testdata").getValue(3,1))
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_CHANGE'))
WebUI.delay(2)

WebUI.waitForPageLoad(3)

Chanagepassconfirmationtext=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Changepasswordtextwthid')).trim()
WebUI.delay(3)
ExpectedChangepasswordData=findTestData('Login_testdata').getValue(12, 1)
if(Chanagepassconfirmationtext.equals(ExpectedChangepasswordData))
{
	KeywordUtil.markPassed('SUCCESS:Password is not changed with invalid data')
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Cancelbutton_object'))
}
else
{
		KeywordUtil.markFailed('ERROR:Password is changed with invalid data')
}
WebUI.delay(2)
//CustomKeywords.'reusableKeywords.Reusable.Logout'()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Password is chnaged with valid data:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Cancelbutton_object'))
}
