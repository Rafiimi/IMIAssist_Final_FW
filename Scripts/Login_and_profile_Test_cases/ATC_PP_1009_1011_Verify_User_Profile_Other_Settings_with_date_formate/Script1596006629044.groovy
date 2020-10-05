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
WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData("TC_03_OtherdetailsChenge").getValue(1,1))
WebUI.maximizeWindow()
WebUI.delay(4)

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TC_03_OtherdetailsChenge").getValue(2,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TC_03_OtherdetailsChenge").getValue(3,1))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Profile'))

	WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/i_create'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Phone_iti__selected-flag'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/li_India ()91'))

WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_land Islands_mobinput'), findTestData("TC_03_OtherdetailsChenge").getValue(4,1))

/*WebUI.selectOptionByValue(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/select_Select Date Format10-Jun-2010-Jun-20_21081b'), 
    'YYYY-MM-DD', true)*/

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_SAVE'))

//WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Saved changes successfully'))
WebUI.delay(2)
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\TC_1005_Verify_User_Profile_Other_Settings.png')


/*WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))*/
/*WebUI.delay(5)
WebUI.closeBrowser()*/
KeywordUtil.markPassed('SUCCESS:Agent able to update the profile details')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to update the profile details')
	
}
