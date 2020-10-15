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
TCname = findTestData('Team_Settings_Feedback').getValue('Description', 1)

KeywordLogger logger = new KeywordLogger()

logger.logInfo('***START Of TEST CASE: ' + TCname)

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/TeamSettings_TabFeedback'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/FBsettings_AddAnewQuestion'))

WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/FBsettings_Question 2'), findTestData('Team_Settings_Feedback').getValue(
        'Question2', 1))

WebUI.selectOptionByLabel(findTestObject('Admin_Settings/Team/TeamCreation/FBsettings_SelectQuestionType'), findTestData(
        'Team_Settings_Feedback').getValue('QuestionType', 1), true)

if (findTestData('Team_Settings_Feedback').getValue('QuestionType', 1) == 'Multiple choice') {
    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Feedback_Input1'), findTestData('Team_Settings_Feedback').getValue(
            'Input1', 1), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Feedback_Input2'), findTestData('Team_Settings_Feedback').getValue(
            'Input2', 1), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Feedback_Input3'), findTestData('Team_Settings_Feedback').getValue(
            'Input3', 1), FailureHandling.OPTIONAL)
}

if (findTestData('Team_Settings_Feedback').getValue('QuestionType', 1) == 'Comment question') {
    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Feedback_CommonQuestion_Description'), findTestData('Team_Settings_Feedback').getValue(
            'Comment_Description', 1), FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/FeedbackSettings_Save'))

WebUI.delay(2)

actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

expectedMsg = findTestData('Team_Settings_Feedback').getValue('Expected_Msg_Header', 1)

if (actualMsg == expectedMsg) {
    KeywordUtil.markPassed('Team Feedback settings: ' + expectedMsg)
} else {
    KeywordUtil.markFailed('Team Feedback settings: ' + actualMsg)
}

logger.logInfo('***END Of TEST CASE: ' + TCname)

}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}
