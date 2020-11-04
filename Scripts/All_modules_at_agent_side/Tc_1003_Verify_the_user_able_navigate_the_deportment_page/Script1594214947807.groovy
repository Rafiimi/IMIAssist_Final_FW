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
	
	
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Assesmenticon_object'))
WebUI.waitForElementClickable(findTestObject('Object Repository/AppointmentCreationpopup/Reporttab_object'), 3)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Reporttab_object'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Custom Reports'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/header_menu notifications notifications_act_169770'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_Report Title_reportTitle'), findTestData("Allthetabsatagentside").getValue(5, 1))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/label_Email Report'))

WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_Email Report_emails'), findTestData("Allthetabsatagentside").getValue(2, 1))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_CREATE REPORT'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Export report - AppointmentclearNo reco_8631dd'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_Close'))
KeywordUtil.markPassed('SUCCESS: User successfully created custom reports')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: User unable to created custom reports')
	
}

