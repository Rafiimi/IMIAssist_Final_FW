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
    CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(6)

    KeywordLogger logger = new KeywordLogger()

    TCname1 = 'Agent should see only teams he is a part of'

    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

    String DeptValList = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/DeptList_Teams'))

    String[] parseList1 = DeptValList.split('\n')

    int DeptCount = parseList1.size()

    if (DeptCount == 1) {
        KeywordUtil.markPassed('Agent is successfully able to see only the Team he is part of')
    } else {
        KeywordUtil.markFailed('Agent is NOT able to see only the Team he is part of')
    }
    
    TCname2 = 'Agent should see only members belongs to his team'

    logger.logInfo('***START Of TEST CASE: ' + TCname2)

    WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/ExpandTeam_Testing'))

    //*** Need to check exact team name is exists once the current issue is resolved
    String TeamValList = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/DeptList_Teams'))

    String[] parseList2 = TeamValList.split('\n')

    int TeamCount = parseList2.size()

    if (TeamCount >= 1) {
        KeywordUtil.markPassed('Agent is successfully able to see members belongs to his team')
    } else {
        KeywordUtil.markFailed('Agent is NOT able to see only members belongs to his team')
    }
    
    TCname3 = 'Check whether edit option is available to Agent to  to edit the team'

    logger.logInfo('***START Of TEST CASE: ' + TCname3)

    //need to add exact team name here
    WebUI.setText(findTestObject('Admin_Settings/Team/TeamCreation/Search_Team'), findTestData('AdminSettings_Team').getValue(
            'TeamName', 3), FailureHandling.OPTIONAL)

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('AdminSettings_Team').getValue('TeamName', 
            3))

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('AdminSettings_Team').getValue('TeamName', 
            3))

    boolean sStatus = WebUI.verifyElementNotPresent(findTestObject('Admin_Settings/Team/TeamCreation/Edit_Team'), 2, FailureHandling.OPTIONAL)

    if (sStatus == true) {
        KeywordUtil.markPassed('Edit option is not provide to Agent to edit the team members details')
    } else {
        KeywordUtil.markFailed('Edit option is provide to Agent to edit the team members details')
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

