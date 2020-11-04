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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

//Support admin login
'In same script added Below cass\'s\r\nTC_Cases_32'
try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(GlobalVariable.Url)

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('IMIA_cases_testData').getValue(
            3, 1))

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('IMIA_cases_testData').getValue(
            4, 1))

    WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))

    KeywordUtil.markPassed('SUCESS:Support admin able to login the agent app')
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Support admin unable to login the agent app')
} 

WebUI.delay(3)

//Verify supprot admin able to see the cases page	 
CustomKeywords.'reusableKeywords.Reusable.Selectcasestab'()

WebUI.delay(3)

//Verify Agent able to see the lastupdated time
try {
    Updatedtime = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Lastupdatedtime'))

    ExpectedUpdatedtime = findTestData('IMIA_cases_testData').getValue(5, 1)

    if (Updatedtime.contains(ExpectedUpdatedtime)) {
        KeywordUtil.markPassed('SUCESS:Last updated time updated in cases page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Last updated time is not updated in cases page')
} 

CustomKeywords.'reusableKeywords.Reusable.Logout'()

