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

KeywordLogger logger = new KeywordLogger()
CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(7)

try {
    String UserRole = findTestData('Login_testdata').getValue('Role', 7)

    logger.logInfo('***Verify the Landing page of ***' + UserRole)
   
//    if (UserRole == 'Team admin') {
        CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

        WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Search_Team'), findTestData('Role_Mgmt').getValue(
                'TeamName', 1), FailureHandling.OPTIONAL)

        if (findTestData('Role_Mgmt').getValue('Speciality', 1) == 'Testing') {
            WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/ExpandTeam_Testing'))
        } else {
            WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/ExpandTeam_QualityAssurance'))
        }
        
        CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('Role_Mgmt').getValue('TeamName', 1))

        WebUI.delay(3)

        WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_TeamMember'), findTestData('Role_Mgmt').getValue(
                'TeamMember', 1), FailureHandling.OPTIONAL)

        CustomKeywords.'reusableKeywords.Reusable.ClickDynamicObject'(findTestData('Role_Mgmt').getValue('TeamMember', 1))

        not_run: WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/DeleteCheckbox'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Edit_TeamMember'))

        WebUI.delay(1)

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/SelectRole_TeamMember'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/SelectRole_Clinician'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Role_SAVE'))

        WebUI.delay(1)

        actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

        expectedMsg = findTestData('Role_Mgmt').getValue('Expected_Msg_Header', 1)

        if (actualMsg == expectedMsg) {
            KeywordUtil.markPassed('Team admin is NOT able to edit the role for any other member in the team')
        } else {
            KeywordUtil.markFailed(actualMsg)
        }
 //   } 
    CustomKeywords.'reusableKeywords.Reusable.Logout'()

}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

