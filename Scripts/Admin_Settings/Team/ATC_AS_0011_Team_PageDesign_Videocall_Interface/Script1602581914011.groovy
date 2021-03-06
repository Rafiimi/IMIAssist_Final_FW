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
TCname = findTestData('Team_PageDesign_VideoCall').getValue('Description', 1)

KeywordLogger logger = new KeywordLogger()

logger.logInfo('***START Of TEST CASE: ' + TCname)

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Tab_VideoCallInterface'))

WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/VCI_AddressSupportPerson'), findTestData('Team_PageDesign_VideoCall').getValue(
        'SupportPerson', 1))

if (findTestData('Team_PageDesign_VideoCall').getValue('VideoOnFocus', 1) == 'PatientQA') {
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/VCI_PatientQA'))
} else {
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/VCI_ClinicianQA'))
}

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/VCI_SAVE'))

WebUI.delay(2)

actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

expectedMsg = findTestData('Team_PageDesign_Onboarding').getValue('Expected_Msg_Header', 1)

if (actualMsg == expectedMsg) {
    KeywordUtil.markPassed('Team Page Design Videocall: ' + expectedMsg)
} else {
    KeywordUtil.markFailed('Team Page Design Videocall: ' + actualMsg)
}

logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}
