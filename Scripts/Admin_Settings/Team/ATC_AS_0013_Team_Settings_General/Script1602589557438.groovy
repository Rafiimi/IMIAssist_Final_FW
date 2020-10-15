import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

try {

TCname = findTestData('Team_Settings_General').getValue('Description', 1)

KeywordLogger logger = new KeywordLogger()

logger.logInfo('***START Of TEST CASE: ' + TCname)

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Team_Settings'))

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/TeamSettings_TabGeneral'))

WebUI.selectOptionByValue(findTestObject('Admin_Settings/Team/TeamCreation/Select_TimeZone'), findTestData('Team_Settings_General').getValue(
        'TimeZone', 1), true)

WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/DefaultCountryName'), findTestData('Team_Settings_General').getValue(
        'DefaultCountryCode', 1), FailureHandling.OPTIONAL)

//Archiving
//String enabled1 = WebUI.getAttribute(findTestObject('null'), 'class', FailureHandling.OPTIONAL)
if (findTestData('Team_Settings_General').getValue('Episode_Archiving', 1) == 'YES') {
    //    if (enabled1.matches('switch-input ng-valid ng-valid-parse ng-dirty ng-touched ng-empty')) {
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Archiving_switch') /*    }
} else {
    if (enabled1.matches('switch-input ng-valid ng-valid-parse ng-dirty ng-touched ng-not-empty')) {
        WebUI.click(findTestObject('null'))
    }*/ )
}

//Geo location
//String enabled2 = WebUI.getAttribute(findTestObject('null'), 'class', FailureHandling.OPTIONAL)
if (findTestData('Team_Settings_General').getValue('Episode_GeoLocation', 1) == 'YES') {
    //    if (enabled2.matches('switch-input ng-valid ng-valid-parse ng-dirty ng-touched ng-empty')) {
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/GeoLocation_switch') /*    }
} else {
    if (enabled2.matches('switch-input ng-valid ng-valid-parse ng-dirty ng-touched ng-not-empty')) {
        WebUI.click(findTestObject('null'))
    } */ )
}

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/GeneralSettings_SAVE'))

WebUI.delay(1)

actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

expectedMsg = findTestData('Team_Settings_General').getValue('Expected_Msg_Header', 1)

if (actualMsg == expectedMsg) {
    KeywordUtil.markPassed('General Settings: ' + expectedMsg)
} else {
    KeywordUtil.markFailed('General Settings: ' + actualMsg)
}

logger.logInfo('***END Of TEST CASE: ' + TCname)

}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}