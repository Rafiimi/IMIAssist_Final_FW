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

CustomKeywords.'reusableKeywords.Reusable.Login'()

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Profiledropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile'))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/profileuploadicon'))
WebUI.delay(3)

WebUI.uploadFile(findTestObject('Object Repository/LoginPage_TestCases_Objects/profileuploadicon'), 'D:\\IMI_Automation\\IMIAssist_Automtion\\Screenshot_20201211_093404.jpg', 
        FailureHandling.OPTIONAL)












