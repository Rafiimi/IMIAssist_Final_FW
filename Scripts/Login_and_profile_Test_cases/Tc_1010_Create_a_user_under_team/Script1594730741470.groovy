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

WebUI.navigateToUrl(findTestData("TC_03_OtherdetailsChenge").getValue(1,1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('null'), findTestData("TC_03_OtherdetailsChenge").getValue(2,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TC_03_OtherdetailsChenge").getValue(3,1))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/i_settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Team'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Select a team to view detailsPlease sel_21f0a7'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Assets Test'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/i_person_add'))

WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_Rafimailtest shaikmailtest_memberEmail'), 
    'qatest16006@imimobile.com')

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Select Role'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Team-admin'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_ADD'))

teamuseraddconfirmation=WebUI.getText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Teamaddedconfirmationtext'))
WebUI.delay(2)
WebUI.takeScreenshot('D:\\IMIAssist- Automation\\IMIAssist_Screenshots\\LoginAndprofile_screens\\Tc_1010_Create_a_user_under_team.png')

if(teamuseraddconfirmation.contains(Teamaddedexpectedmessage))
{
	KeywordUtil.markPassed('SUCCESS:User added successfully under team')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Team is not added under the team')
	WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Teamaddedclosepopupobject'))
	
}

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))

WebUI.closeBrowser()

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Team is not added under the team :'+e.getMessage())
	
	
}
