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

//try {
    TCname = findTestData('Team_PageDesign_Onboarding').getValue('Description', 1)

    KeywordLogger logger = new KeywordLogger()

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Tab_Onboarding'))

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Onboarding_ButtonColour'), findTestData('Team_PageDesign_Onboarding').getValue(
            'ButtonColor', 1))

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Onboarding_ButtonLabel'), findTestData('Team_PageDesign_Onboarding').getValue(
            'ButtonLabel', 1), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Onboarding_SAVE'))

    WebUI.delay(2)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('Team_PageDesign_Onboarding').getValue('Expected_Msg_Header', 1)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Team Page Design Onboarding: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Team Page Design Onboarding: ' + actualMsg)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
/*}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

*/