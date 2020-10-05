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
WebUI.openBrowser('')
String expectedchangepasswordmessage="credExpired";

WebUI.navigateToUrl(findTestData("CHangepassword_Duplicate").getValue(1,1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("CHangepassword_Duplicate").getValue(2,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("CHangepassword_Duplicate").getValue(3,1))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_LOGIN'))

WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Change Password'))
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Change Passwordclose New password and c_06d1ba'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_currentpassword'),findTestData("CHangepassword_Duplicate").getValue(3,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_form-control form-textbox ng-pr_d955f3'),findTestData("CHangepassword_Duplicate").getValue(4,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_check_confirmpassword'),findTestData("CHangepassword_Duplicate").getValue(5,1))
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_CHANGE'))
WebUI.delay(2)
WebUI.takeScreenshot('D:\\IMIAssist- Automation\\IMIAssist_Screenshots\\LoginAndprofile_screens\\TC_1012_Duplicate_for_exsting_Password.png')

WebUI.waitForPageLoad(3)
//WebUI.switchToFrame(findTestObject('//div[@class="cred-expired ng-scope"]'), 5);
//Thread.sleep(2000)

//String passwordchangeconfirmationtext=WebUI.getText("Object Repository/Page_IMIassist - Virtual Assistance/div_Your password has been changed Please s_2db65e")
String passwordchangeconfirmationtext=WebUI.getUrl();
System.out.println("passwordchangeconfirmationtext :"+passwordchangeconfirmationtext)	

if(passwordchangeconfirmationtext.contains(expectedchangepasswordmessage))
{
	System.out.println("Password is changed successfully ")
}
else
{
	System.out.println("Password is not changed")
	
}
WebUI.delay(3)
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
//Thread.sleep(5000)

WebUI.closeBrowser()
