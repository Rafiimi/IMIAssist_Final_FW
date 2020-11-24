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
	CustomKeywords.'reusableKeywords.Reusable.Login'()
	
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_list_alt'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Logs'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_LogsrefreshLast Updated 2020-07-07 0635 pm'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/a_Audit Logs'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Agent_Side_Tabs\\TC_1009_Verify_the_user_able_to_navigate_to_the_logs.png')

CustomKeywords.'reusableKeywords.Reusable.Logout'()
KeywordUtil.markPassed('SUCCESS: Agent able to navigate audit_logs')
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to navigate audit_logs')
	
}

