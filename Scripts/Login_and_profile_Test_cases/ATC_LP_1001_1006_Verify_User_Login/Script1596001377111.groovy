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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

 
//for(def rowNum=1;rowNum<=findTestData("TestDataforLogin").getRowNumbers() ;rowNum++)
//{
try
{
	
Dashboardtitle='dashboard'
WebUI.openBrowser('')


WebUI.navigateToUrl(findTestData("TestDataforLogin").getValue(1, 1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TestDataforLogin").getValue(2,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\ATC_LP_1001_1006_Verify_User_Login.png')
/*windowtitle=WebUI.getUrl()
println("windowtitle :"+windowtitle)
WebUI.delay(5)

if(windowtitle.contains(Dashboardtitle))
{
	
	KeywordUtil.markPassed('SUCCESS:User able to launched the app')
}
else
{
	KeywordUtil.markFailed('ERROR:User unable to launched the dashbord')
	
}*/
WebUI.delay(5)
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
WebUI.delay(3)
WebUI.closeBrowser()
}
catch(Exception e)
{
		KeywordUtil.markFailed('ERROR:User unable to launched the dashbord'+ e.getMessage())
	
}
//}

