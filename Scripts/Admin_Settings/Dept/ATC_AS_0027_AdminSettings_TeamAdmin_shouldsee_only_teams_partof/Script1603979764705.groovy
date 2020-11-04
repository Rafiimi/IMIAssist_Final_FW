import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.lang.Integer as Integer
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

not_run: CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(8)

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

try {
    TCname = 'Verifying Admin should see only the teams he is part of'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    String actValList = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/Table_speciality'))

    KeywordUtil.logInfo(actValList)

    String[] parseList = actValList.split('\n')

    int SplCount = parseList.size()

    //Check type casting below
    String[] pageNum2 = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/Pagination_LastCnt'))

    int pageNo = pageNum2[0].value[0]

    //while (WebUI.verifyElementPresent(findTestObject('Admin_Settings/Team/TeamCreation/Page_Next'), 2, FailureHandling.OPTIONAL)) {
    for (int i = 2; i <= pageNo; i++) {
        WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Page_Next'))

        String actValList2 = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/Table_speciality'))

        KeywordUtil.logInfo(actValList2)

        String[] parseList2 = actValList2.split('\n')

        int count2 = parseList2.size()

        SplCount = (SplCount + count2)
    }
    
    println(SplCount)

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

    String DeptValList = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/DeptList_Teams'))

    String[] parseList2 = DeptValList.split('\n')

    int DeptCount = parseList2.size()

    if (SplCount == DeptCount) {
        KeywordUtil.markPassed('Admin is successfully able to see only the teams he is part of')
    } else {
        KeywordUtil.markFailed('Admin is NOT able to see only the teams he is part of')
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
		
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

