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


expectedchangepasswordmessage="profile";
try
{
WebUI.openBrowser('')


WebUI.navigateToUrl(findTestData("TestDataForchangepassword").getValue(1,1))

WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TestDataForchangepassword").getValue(2,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataForchangepassword").getValue(3,1))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_LOGIN'))


WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Change Password'))
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Change Passwordclose New password and c_06d1ba'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_currentpassword'),findTestData("TestDataForchangepassword").getValue(3,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_form-control form-textbox ng-pr_d955f3'),findTestData("TestDataForchangepassword").getValue(4,1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_check_confirmpassword'),findTestData("TestDataForchangepassword").getValue(5,1))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_CHANGE'))
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\Tc_1011_Chnage_Password.png')

WebUI.waitForPageLoad(3)
//WebUI.switchToFrame(findTestObject('//div[@class="cred-expired ng-scope"]'), 5);
//Thread.sleep(2000)

//String passwordchangeconfirmationtext=WebUI.getText("Object Repository/Page_IMIassist - Virtual Assistance/div_Your password has been changed Please s_2db65e")
passwordchangeconfirmationtext=WebUI.getUrl();
println("passwordchangeconfirmationtext :"+passwordchangeconfirmationtext)	

if(passwordchangeconfirmationtext.contains('https://stg.imiassist.ai/agent/#!/error/'))
{
	System.out.println("Password is changed successfully ")
	KeywordUtil.markPassed('SUCCESS:Password is changed successfully')
	
}
else
{
	System.out.println("Password is not changed")
	KeywordUtil.markFailed('ERROR:Password is not changed')
	
	
}
//Thread.sleep(5000)
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))
//
//WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
//Thread.sleep(5000)
WebUI.closeBrowser()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Password is not chnaged successfully:'+e.getMessage())
	
}
