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

CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation'()

KeywordLogger logger = new KeywordLogger()

WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

try {
    TCname = 'Pagination for Department summary'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.scrollToElement(findTestObject('Admin_Settings/Dept/UserCreation/Page_Previous'), 3, FailureHandling.OPTIONAL)

	PageStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/paginationObject'), 2, FailureHandling.OPTIONAL)
	
	if (PageStatus == true) {
		KeywordUtil.markPassed('Pagination text is displaying successfully')
	} else {
		KeywordUtil.markFailed('NO Pagination text is displaying')
	}

    prevStatus= WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/Page_Previous'), 2, FailureHandling.OPTIONAL)
    nextStatus= WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/Page_Next'), 2, FailureHandling.OPTIONAL)

	if ((prevStatus == true) && (nextStatus == true)) {
		KeywordUtil.markPassed('Previous and Next buttons are displaying successfully in Pagination')
	} else {
		KeywordUtil.markFailed('Previous and Next buttons are NOT displaying in Pagination')
	}
	
    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_User'), GlobalVariable.Username, FailureHandling.OPTIONAL)

    WebUI.delay(2)

    prevDisStatus= WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/Page_Previous_Disabled'), 2, FailureHandling.OPTIONAL)
    nextDisStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/Page_Next_Disabled'), 2, FailureHandling.OPTIONAL)
	
	if ((prevDisStatus == true) && (nextDisStatus == true)) {
		KeywordUtil.markPassed('Previous and Next buttons are disabled as user data is less than or equal to 10')
	} else {
		KeywordUtil.markFailed('Previous and Next buttons are NOT disabled even user data is less than or equal to 10')
	}
	
}

catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Unable to check the pagination :' + e.getMessage())
} 

