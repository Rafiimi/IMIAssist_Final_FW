import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//issue with email id field---react element********
//delete login
//CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)
CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(11)

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

//try {
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

CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('AdminSettings_Team').getValue('TeamName', 3))

WebUI.delay(2)

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Team_AddMember'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/SelectMemberEmail'))

WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/SelectMemberEmail'), findTestData('AdminSettings_Team').getValue(
        'MemberEmail', 3), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('Admin_Settings/Team/TeamCreation/SelectMemberEmail'), Keys.chord(Keys.TAB), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/div_SelectRole'))

CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('AdminSettings_Team').getValue('SelectRole', 3))

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

    boolean sStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Team/TeamCreation/Search_Success'), 2, FailureHandling.OPTIONAL)

    if (sStatus == true) {
        KeywordUtil.markPassed('Search functionality is working fine in Teams page')
    } else {
        KeywordUtil.markFailed('Search functionality is NOT working in Teams page')
    }
} else {
    KeywordUtil.markFailed('Add member: ' + actualMsg)
}

logger.logInfo('***END Of TEST CASE: ' + TCname)

