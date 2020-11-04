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

'In same script added below test cases \r\nTC_Cases_1\r\nTC_Cases_2\r\nTC_Cases_12\r\nTC_Cases_33'
CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.Selectcasestab'()

//Chat History
try {
    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Viewtranscripts'))

    WebUI.delay(3)

    Chathistorytext = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/ChatHistory'))

    WebUI.delay(3)

    ExpectedChathistoryObject = findTestData('IMIA_cases_testData').getValue(2, 1)

    if (Chathistorytext.equals(ExpectedChathistoryObject)) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see chathistory object in cases page')

        WebUI.click(findTestObject('Object Repository/Cases_Module_objects/ChatHistory'))
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see chathistory object in cases page:' + e.getMessage())
} 

WebUI.delay(7)

try {
    Downloadoptionstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/Profile_objects/Download_option_onsanpshot'))

    if (Downloadoptionstatus == true) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see the download option on sanpshot')

        WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Chathistory_popup_close_button'))
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see the download option on sanpshot:' + e.getMessage())

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Chathistory_popup_close_button'))
} 

WebUI.delay(3)

//Customer Feedback
try {
    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Customer_feedback'))

    serviceheadertext = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Servicefeedbackheader'))

    if (serviceheadertext.equals('Service')) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see Customer feedabk popup')

        WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Customerfbpclose'))
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see Customer feedabk popup:' + e.getMessage())
} 

//Recoding attachament
try {
    Videoatachament = WebUI.verifyElementVisible(findTestObject('Object Repository/Profile_objects/Video_attachment'))

    if (Videoatachament == true) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see video attachament')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see video attachament:' + e.getMessage())
} 

WebUI.delay(5)

//Activity log in cases page
try {
    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Activity_Tab'))

    firstactivitytext = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Activitystartorder')).trim()

    if (firstactivitytext.equals('Appointment created')) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see start activity in activity logs')
    }
}
catch (Exception e)
 {
    KeywordUtil.markFailed('ERROR:Agent unable to see start activity in activity logs:' + e.getMessage())
} 

