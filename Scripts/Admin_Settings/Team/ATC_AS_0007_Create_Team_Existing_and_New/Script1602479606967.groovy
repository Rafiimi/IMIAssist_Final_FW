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
for (int i = 1; i <= 2; i++) {

        TCname = findTestData('AdminSettings_Team').getValue('Description', i)
        KeywordLogger logger = new KeywordLogger()
        logger.logInfo('***START Of TEST CASE: ' + TCname)

		CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()
		
        WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Link_CreateNewTeam'))

        WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/div_SelectSpecialty'))

        CustomKeywords.'reusableKeywords.Reusable.ClickDynamicTextObj'(findTestData('AdminSettings_Team').getValue('Speciality', 
                i))

        WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Team_teamName'), findTestData('AdminSettings_Team').getValue(
                'TeamName', i), FailureHandling.OPTIONAL)

        WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/team_CREATE'))

        WebUI.delay(1)

        actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

        expectedMsg = findTestData('AdminSettings_Team').getValue('Expected_Msg_Header', i)

        if (actualMsg == expectedMsg) {
            KeywordUtil.markPassed('Team creation: ' + expectedMsg)
        } else {
            KeywordUtil.markFailed('Team creation: ' + actualMsg)
        }
        
        WebUI.delay(1)
		
		if (findTestData('AdminSettings_Team').getValue('TestType', i) == 'Positive') {		
		WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/team_RE_LOGIN'))
		WebUI.delay(2)
		WebUI.closeBrowser()
		CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)
		}
		
        if (findTestData('AdminSettings_Team').getValue('TestType', i) == 'Negative') {
                  WebUI.click(findTestObject('Object Repository/Admin_Settings/Team/TeamCreation/team_CANCEL'))
        }
        
        logger.logInfo('***END Of TEST CASE: ' + TCname)
    }
}
    catch (Exception e) {
        KeywordUtil.markFailed('ERROR: ' + e.getMessage())
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Close_CreateTeam'))
    } 


