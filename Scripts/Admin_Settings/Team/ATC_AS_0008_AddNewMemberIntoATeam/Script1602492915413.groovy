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

not_run: CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

try {
    TCname = findTestData('AdminSettings_Team').getValue('Description', 3)

    KeywordLogger logger = new KeywordLogger()

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.delay(2)

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Search_Team'), findTestData('AdminSettings_Team').getValue(
            'TeamName', 3), FailureHandling.OPTIONAL)

    if (findTestData('AdminSettings_Team').getValue('Speciality', 3) == 'Testing') {
        WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/ExpandTeam_Testing'))
    } else {
        WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/ExpandTeam_QualityAssurance'))
    }
    
    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('AdminSettings_Team').getValue('TeamName', 
            3))

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Team_AddMember'))

    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/SelectMemberEmail'), findTestData('AdminSettings_Team').getValue(
            'MemberEmail', 3), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/div_SelectRole'))

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('AdminSettings_Team').getValue('SelectRole', 
            3))

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/button_ADD_member'))

    WebUI.delay(2)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AdminSettings_Team').getValue('Expected_Msg_Header', 3)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Add member: ' + expectedMsg)

        //Search functionality
        WebUI.delay(5)

        WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Search_Member'), findTestData('AdminSettings_Team').getValue(
                'MemberEmail', 3), FailureHandling.OPTIONAL)

        WebUI.delay(1)

        boolean sStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Team/TeamCreation/Search_Success'), 
            2, FailureHandling.OPTIONAL)

        if (sStatus == true) {
            KeywordUtil.markPassed('Search functionality is working fine in Teams page')
        } else {
            KeywordUtil.markFailed('Search functionality is NOT working in Teams page')
        }
    } else {
        KeywordUtil.markFailed('Add member: ' + actualMsg)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

