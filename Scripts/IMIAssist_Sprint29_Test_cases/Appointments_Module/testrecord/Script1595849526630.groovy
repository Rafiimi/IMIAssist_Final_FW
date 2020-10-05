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

WebUI.navigateToUrl('https://stg.imiassist.ai/agent/#!/registration/login')

WebUI.setText(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/input_Please enter your details below_user-email'), 
    'cofyuperzu@enayu.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
    't01vaTQW2aA54u53vLzm8g==')

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/button_PROCEED'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/i_insert_invitation'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/span_Appointments'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_New Appointment'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Schedule An Appointment  Schedule an ap_840baf'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/button_Next'))

WebUI.setText(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/input_All_customerSearchInput'), 
    'rafi')

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Rafi Shaik'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/span_2 Select Time  Assignee'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/i_calendar_today'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/td_29'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/td_1700'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/td_545'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/i_arrow_back'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Discard Changes   clear     Are you sur_801644'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_Are you sure you want to discard the details'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/button_Discard'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/div_arrow_back  Schedule An Appointment   c_4ff18f'))

WebUI.click(findTestObject('Object Repository/TestRecord/Page_eClinic - Video Consultations/Page_eClinic - Video Consultations/i_close'))

