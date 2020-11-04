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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

not_run: CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

try {
    TCname = findTestData('Appointment_Tags').getValue('Description', 1)

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_Tags'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Link_CreateTag'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/input_Enter_Tagname'), findTestData('Appointment_Tags').getValue(
            'TagName', 1), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tag_CREATE'))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AdminSettings_User').getValue('Expected_Msg_Header', 1)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Tag created successfully: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Tag is NOT created: ' + actualMsg)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

try {
    TCname = findTestData('Appointment_Tags').getValue('Description', 2)

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Tag_search'), findTestData('Appointment_Tags').getValue(
            'TagName', 2), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.ClickToggleObject'(findTestData('Appointment_Tags').getValue('TagName', 2))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AdminSettings_User').getValue('Expected_Msg_Header', 2)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Tag Disabled successfully: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Tag is NOT Disabled: ' + actualMsg)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

try {
    TCname = findTestData('Appointment_Tags').getValue('Description', 3)

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Tag_search'), findTestData('Appointment_Tags').getValue(
            'TagName', 3), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/Tag_SearchResult'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tags_SelectCheckbox'))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AdminSettings_User').getValue('Expected_Msg_Header', 3)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Tag Deleted successfully: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Tag is NOT Deleted: ' + actualMsg)
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
		
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

