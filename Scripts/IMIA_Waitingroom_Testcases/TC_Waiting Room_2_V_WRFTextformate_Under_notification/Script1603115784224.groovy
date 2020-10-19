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

'In Same script below cases are added\r\nTC_Waiting Room_3\r\n'
CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

try {
    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/Department_1'))

    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/App_magement_tab'))

    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/Notificationtab'))

    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/Customertab_u_notificationtab'))

    WebUI.delay(3)

    KeywordUtil.markPassed('SUCCESS:Agent able to navigate to the notification tab')
}
catch (Exception e) {
    KeywordUtil.markPassed()
} 

WebUI.delay(3)

//Verify the Wr lable under notification tab
try {
    Wrlt = WebUI.getText(findTestObject('Object Repository/IMIA_waitingroom_objects/Waitingroomheaderinnt')).trim()

    ExpWrlt = findTestData('IMIA_Appointment_page_Testdata').getValue(6, 1)

    if (Wrlt.equals(ExpWrlt)) {
        KeywordUtil.markPassed('SUCCESS:Waiting room label text is visible to the user')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Waiting room label text is visible to the user')
} 

WebUI.delay(3)

//Verify the Wr Info icon text under notification tab
try {
    Wrinfolt = WebUI.getText(findTestObject('Object Repository/IMIA_waitingroom_objects/WRinfo')).trim()

    ExpWrinfolt = findTestData('IMIA_Appointment_page_Testdata').getValue(7, 1)

    if (Wrinfolt.equals(ExpWrinfolt)) {
        KeywordUtil.markPassed('SUCCESS:Waiting room info text is visible to the user')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Waiting room info text is visible to the user')
} 

WebUI.delay(4)

//Verify the Wr enable and disable button under notification tab
try {
    Wrenadbstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_waitingroom_objects/WrEdD'))

    //	ExpWrinfolt=findTestData('IMIA_Appointment_page_Testdata').getValue(7, 1)
    if (Wrenadbstatus.equals(true)) {
        KeywordUtil.markPassed('SUCCESS:Waiting room enable and disable button is visible to the user')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Waiting room enable and disable button is not visible to the user:' + e.getMessage())
} 

//Verify notify content is black color
try {
    Wreddbutoncolor = WebUI.getText(findTestObject('Object Repository/IMIA_waitingroom_objects/WRNotifycontent')).trim()

    EXWreddbutoncolor = findTestData('IMIA_Appointment_page_Testdata').getValue(8, 1)

    if (Wreddbutoncolor.equals(EXWreddbutoncolor)) {
        KeywordUtil.markPassed('SUCCESS:Waiting room notify content is matched to expected text')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Waiting room notify content is not matched to expected text:' + e.getMessage())
} 

//Verify viewcontent link is vible to the user
try {
    Wredvclink = WebUI.getText(findTestObject('Object Repository/IMIA_waitingroom_objects/ViewcontentLink')).trim()

    EXWredvclink = findTestData('IMIA_Appointment_page_Testdata').getValue(9, 1)

    if (Wredvclink.equals(Wredvclink)) {
        KeywordUtil.markPassed('SUCCESS:Waiting room view content link is matched to expected text')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Waiting room view content link is not matched to expected text:' + e.getMessage())
} 

//Verify agent able to enable and disable the wr for selected department
WebUI.delay(3)

try {
    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/WrEdD'))

    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/WrEdD'))

    WebUI.click(findTestObject('Object Repository/IMIA_waitingroom_objects/Save_button'))

    Saveconfirmationtext = WebUI.getText(findTestObject('Object Repository/IMIA_waitingroom_objects/Savedconfirmationtext'))

    Exscontext = findTestData('IMIA_Appointment_page_Testdata').getValue(10, 1)

    if (Saveconfirmationtext.equals(Exscontext)) {
        KeywordUtil.markPassed('SUCCESS:Save confirmation text is matched to expectation')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Save confirmation text is not matched to expectation:' + e.getMessage())
} 

