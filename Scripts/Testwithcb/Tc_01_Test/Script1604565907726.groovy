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

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_Email ID_email'), 'rafishaik.m@imimobile.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_Password_password'), 't01vaTQW2aA54u53vLzm8g==')

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Login_Ripple__RippleContainer-cs6dy7-0 dXRetU'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown (6)'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout (14)'))

WebUI.closeBrowser()

