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
Teamaddedexpectedmessage='Successfully added user to the team'
try
{
WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData("Allthetabsatagentside").getValue(1, 1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('null'), findTestData("Allthetabsatagentside").getValue(2, 1))

WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'),
	findTestData("Allthetabsatagentside").getValue(3, 1))
WebUI.click(findTestObject('null'))



WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Team'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Team ManagementTeamsCreate a New TeamFi_02983a'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Assist Team'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_person_add'))

WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_asdas asdas_memberEmail'), 'qatest16006@imimobile.com')

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Select Role'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Team-admin'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_ADD'))

teamuseraddconfirmation=WebUI.getText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Teamaddedconfirmationtext'))
WebUI.delay(2)
WebUI.takeScreenshot('D:\\IMIAssist- Automation\\IMIAssist_Screenshots\\LoginAndprofile_screens\\TC_1009_Verify_Create_New_Team_Under_Team.png')

if(teamuseraddconfirmation.contains(Teamaddedexpectedmessage))
{
	KeywordUtil.markPassed('SUCCESS:Teamadmin added successfully under team')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Teamadmin is not added under the team')
	WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Teamaddedclosepopupobject'))
	
}

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))

WebUI.closeBrowser()

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Teamadmin is not added under the team :'+e.getMessage())
	
	
}