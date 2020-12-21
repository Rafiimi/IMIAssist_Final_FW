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

try {
    logger.logInfo('***Login as Department---To check Department settings option is visible***')

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Settings'))

    boolean deptStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/Settings_Dept'), 2, 
        FailureHandling.OPTIONAL)

    if (deptStatus == true) {
        KeywordUtil.markPassed('Page design and settings tab is visible only for the respective team-admin')
    } else {
        KeywordUtil.markFailed('Page design and settings tab is visible for User also')
    }
    
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Settings_Team'))

    WebUI.mouseOver(findTestObject('Admin_Settings/Team/TeamCreation/teamsWindow_empty'))

    boolean teamStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Team/TeamCreation/Link_CreateNewTeam'), 
        2, FailureHandling.OPTIONAL)

    if (teamStatus == true) {
        KeywordUtil.markPassed('New Team creation option is available only for Admins')
    } else {
        KeywordUtil.markFailed('New Team creation option is available for User also')
    }
    
    CustomKeywords.'reusableKeywords.Reusable.Logout'()

    WebUI.delay(3)

    WebUI.closeBrowser()

    logger.logInfo('***Login as User---To check Department settings option is NOT visible***')

    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', 2))

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
            'Username', 2))

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
            'Password', 2))

    WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))

    WebUI.delay(3)

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Settings'))

    boolean deptStatus2 = WebUI.verifyElementNotPresent(findTestObject('Admin_Settings/Dept/UserCreation/Settings_Dept'), 
        2, FailureHandling.OPTIONAL)

    if (deptStatus2 == true) {
        KeywordUtil.markPassed('Page design and settings tab is Not visible for User')
    } else {
        KeywordUtil.markFailed('Page design and settings tab is visible for User also')
    }
    
    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Settings_Team'))

    WebUI.mouseOver(findTestObject('Admin_Settings/Team/TeamCreation/teamsWindow_empty'))

    boolean teamStatus2 = WebUI.verifyElementNotPresent(findTestObject('Admin_Settings/Team/TeamCreation/Link_CreateNewTeam'), 
        2, FailureHandling.OPTIONAL)

    if (teamStatus2 == true) {
        KeywordUtil.markPassed('New Team creation option is Not available for user')
    } else {
        KeywordUtil.markFailed('New Team creation option is available for user also')
    }
    
    CustomKeywords.'reusableKeywords.Reusable.Logout'()
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

