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
    TCname = findTestData('Team_Settings_Notification').getValue('Description', 1)

    KeywordLogger logger = new KeywordLogger()

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/TeamSettings_TabNotification'))

	if (findTestData('Team_Settings_Notification').getValue('EmailHeader', 1) != '') {
		WebUI.uploadFile(findTestObject('Admin_Settings/Team/TeamCreation/EmailHeader_UPLOAD'), findTestData('Team_Settings_Notification').getValue(
            'EmailHeader', 1), FailureHandling.OPTIONAL)
		}
    
	if (findTestData('Team_Settings_Notification').getValue('EmailFooter', 1) != '') {
		WebUI.uploadFile(findTestObject('Admin_Settings/Team/TeamCreation/EmailFooter_UPLOAD'), findTestData('Team_Settings_Notification').getValue(
            'EmailFooter', 1), FailureHandling.OPTIONAL)
		}
	
	if (findTestData('Team_Settings_Notification').getValue('SenderEmail', 1) != '') {
		WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Notification_SenderEmail'), findTestData('Team_Settings_Notification').getValue(
            'SenderEmail', 1))
		}
  
    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Notification_SubjectLine'), findTestData('Team_Settings_Notification').getValue(
            'SubjectLine', 1), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Notification_EmailBody'), findTestData('Team_Settings_Notification').getValue(
            'EmailBody', 1), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Notification_SmsBody'), findTestData('Team_Settings_Notification').getValue(
            'SMStemp_Body', 1), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/NotificationSettings_SAVE'))

    WebUI.delay(2)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('Team_Settings_Notification').getValue('Expected_Msg_Header', 1)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Team Notification settings: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Team Notification settings: ' + actualMsg)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

