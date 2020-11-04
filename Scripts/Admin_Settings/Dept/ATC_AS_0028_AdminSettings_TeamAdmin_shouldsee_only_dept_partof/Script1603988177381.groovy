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

CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(2)

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

KeywordLogger logger = new KeywordLogger()

try {
    TCname = 'Verifying User should see only the Dept he is part of'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    String DeptValList = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/DeptList_Teams'))

    String[] parseList2 = DeptValList.split('\n')

    int DeptCount = parseList2.size()

    if (DeptCount == 1) {
        KeywordUtil.markPassed('User is successfully able to see only the Dept he is part of')
    } else {
        KeywordUtil.markFailed('User is NOT able to see only the Dept he is part of')
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
	
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

