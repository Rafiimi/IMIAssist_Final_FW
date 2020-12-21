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

CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)
//try {
    TCname = findTestData('Team_PageDesign_AppLanding').getValue('Description', 1)

    KeywordLogger logger = new KeywordLogger()

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Team_PageDesign'))
	WebUI.delay(2)

   //WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Tab_AppLanding'))

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Landing_BrandColour'), findTestData('Team_PageDesign_AppLanding').getValue(
            'BrandColor', 1), FailureHandling.OPTIONAL)

    if (findTestData('Team_PageDesign_AppLanding').getValue('FontColor', 1) == 'White') {
		WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/FontColor_White'))
    } 
    
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Landing_SelectFont'))
	WebUI.delay(1)
    CustomKeywords.'reusableKeywords.Reusable.ClickDynamicTextObj'(findTestData('Team_PageDesign_AppLanding').getValue('Font', 
            1))

    WebUI.delay(2)

    not_run: WebUI.uploadFile(findTestObject('Admin_Settings/Team/TeamCreation/Logo_UPLOAD'), findTestData('Team_PageDesign_AppLanding').getValue(
            'BrandLogo', 1), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Landing_AppTagline'), findTestData('Team_PageDesign_AppLanding').getValue(
            'AppTagline', 1), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Landing_AppDescription'), findTestData('Team_PageDesign_AppLanding').getValue(
            'AppDesc', 1), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Landing_SAVE'))

    WebUI.delay(2)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('Team_PageDesign_AppLanding').getValue('Expected_Msg_Header', 1)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Team Landing page design: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Team Landing page design: ' + actualMsg)
    }
	WebUI.delay(2)
    logger.logInfo('***END Of TEST CASE: ' + TCname)
/*}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}*/ 

