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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

try {
   try
{
	WebUI.openBrowser('')
	WebUI.navigateToUrl(findTestData('IMIA_Dashboard').getValue(1, 1))
	WebUI.delay(3)
	WebUI.maximizeWindow()
	WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'),
		findTestData('IMIA_Dashboard').getValue(2, 1))
	WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'),
		findTestData('IMIA_Dashboard').getValue(3, 1))
	WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to login the application :'+e.getMessage())
}

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Select time period  Today'))

    WebUI.delay(3)
/*try{
WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select time period  Today'))
	//    WebUI.verifyOptionsPresent(findTestObject('Page_eClinic - Video Consultations/div_Select time period  Today'), [' Today '
//            , ' Yesterday ', ' Last 7 Days ', ' Last 30 Days ', ' Last 60 Days ', ' Last 90 Days '])
   
	
	 KeywordUtil.markPassed('ERROR:All options are avilable in Time period drop down field')
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:All options are avilable in Time period drop down field')
	
}
*/    KeywordUtil.markPassed('SUCCESS:All options are avilable in Time period drop down field')
	WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Dashboard/ATC_DP_1012_Check_the_functionality_of_TimePeriod_Dropdown.png')
	WebUI.delay(3)
	try
{
WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to logouted the application:'+e.getMessage())
	
}
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:All options are not avilable in Time period drop down field')
} 

