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
import org.openqa.selenium.Keys as Keys

KeywordLogger logger = new KeywordLogger()

try {
    TCname = findTestData('User_RoleChange_Delete').getValue('Description', 1)

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('SpecialityObjectClass', 
            1), findTestData('User_RoleChange_Delete').getValue('Speciality', 1))

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('TeamObjectClass', 
            1), findTestData('User_RoleChange_Delete').getValue('TeamName', 1))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_TeamMember'), findTestData('User_RoleChange_Delete').getValue(
            'TeamMember', 1), FailureHandling.OPTIONAL)

    CustomKeywords.'reusableKeywords.Reusable.ClickDynamicObject'(findTestData('User_RoleChange_Delete').getValue('TeamMember', 
            1))

    not_run: WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/DeleteCheckbox'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Edit_TeamMember'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/SelectRole_TeamMember'))

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('RoleObjectClass', 
            1), findTestData('User_RoleChange_Delete').getValue('NewRole', 1))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Role_SAVE'))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 1)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Admin is able to edit the role of a user in the team')
    } else {
        KeywordUtil.markFailed(actualMsg)
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

try {
    TCname2 = findTestData('User_RoleChange_Delete').getValue('Description', 2)

    logger.logInfo('***START Of TEST CASE: ' + TCname2)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_TeamMember'), findTestData('User_RoleChange_Delete').getValue(
            'TeamMember', 2), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.ClickDynamicObject'(findTestData('User_RoleChange_Delete').getValue('TeamMember', 
            2))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Delete_Member'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_REMOVE'))

    WebUI.delay(1)

    delConfirmation = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/DeleteConfirmation'))

    if (delConfirmation == ' Users deleted successfully') {
        KeywordUtil.markPassed('Admin is able to delete a user in the team')

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Close_Window'))
    } else {
        KeywordUtil.markFailed('Admin is NOT able to delete a user in the team: ' + delConfirmation)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname2)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

