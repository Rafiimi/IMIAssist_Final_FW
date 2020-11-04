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

//****Need to change the data in .CSV file every time as there are formulas won't work in CSV****
CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

try {
    TCname1 = 'Checking Error message with 10MB Bulk Upload data'

    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/BulkUploadIcon'))

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/Choosefile_ToUpload'), 'D:\\IMI_Automation\\IMIAssist_Automtion\\TestData\\BulkUploadUsers_Morethan_10MB.csv', 
        FailureHandling.OPTIONAL)

    WebUI.delay(10)

    WebUI.verifyElementText(findTestObject('Admin_Settings/Dept/UserCreation/Error_FileType'), 'File size exceeded more than 10 MB', 
        FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/CLOSE_BulkUP_error'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CANCEL_Upload'))

    logger.logInfo('***END Of TEST CASE: ' + TCname1)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

try {
    TCname2 = 'Checking Error message with invalid user fields data'

    logger.logInfo('***START Of TEST CASE: ' + TCname2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/BulkUploadIcon'))

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/Choosefile_ToUpload'), 'D:\\IMI_Automation\\IMIAssist_Automtion\\TestData\\BulkUpload_InvalidUserFields.csv', 
        FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Admin_Settings/Dept/UserCreation/Error_FileType'), 'Invalid Users .Please try uploading with valid users', 
        FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CANCEL_Upload'))

    logger.logInfo('***END Of TEST CASE: ' + TCname2)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

try {
    TCname3 = 'Checking Error message with missing mandatory fields data'

    logger.logInfo('***START Of TEST CASE: ' + TCname3)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/BulkUploadIcon'))

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/Choosefile_ToUpload'), 'D:\\IMI_Automation\\IMIAssist_Automtion\\TestData\\BulkUpload_MandatoryFldsMissing.csv', 
        FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Admin_Settings/Dept/UserCreation/Error_FileType'), 'Mandatory fields are missing .Please try uploading with valid data', 
        FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CANCEL_Upload'))
	
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
	
    logger.logInfo('***END Of TEST CASE: ' + TCname3)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

