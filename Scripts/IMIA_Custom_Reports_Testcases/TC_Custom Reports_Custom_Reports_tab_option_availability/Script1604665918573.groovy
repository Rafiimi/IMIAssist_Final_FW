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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

KeywordLogger logger = new KeywordLogger()

try {
    String listSource = '8,3' //Different logins from login test data

    String[] list = listSource.split(',')

    int LoginCount = list.size()

    for (int j = 0; j <= (LoginCount - 1); j++) {
        int logRow = Integer.parseInt(list[j])

        String UserRole = findTestData('Login_testdata').getValue('Role', logRow)

        TCname = ('Check whether Custom Reports tab option is available for: ' + UserRole)

        logger.logInfo('***START Of TEST CASE: ' + TCname)

        CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(logRow)

        WebUI.delay(2)

        WebUI.mouseOver(findTestObject('Cases_Module_objects/Reports_Tab_icon'))

        WebUI.delay(1)

        WebUI.mouseOver(findTestObject('Object Repository/Cases_Module_objects/ReportsTab'))

        WebUI.delay(1)

        boolean crButton = WebUI.verifyElementPresent(findTestObject('Object Repository/IMIA_Custome_Reports_objects/CustomReporttab'), 
            2)

        if (crButton == true) {
            WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CustomReporttab'))

            WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/Page_CustomReports'))

            WebUI.verifyElementPresent(findTestObject('IMIA_Custome_Reports_objects/Link_CreateCustomReport'), 2)
        }
        
        CustomKeywords.'reusableKeywords.Reusable.Logout'()

        logger.logInfo('***END Of TEST CASE: ' + TCname)
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

