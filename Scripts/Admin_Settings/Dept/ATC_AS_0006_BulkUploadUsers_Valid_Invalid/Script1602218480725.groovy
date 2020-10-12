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

//****Need to change the data in .CSV file every time as there are forumas won't work in CSV****
CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

try {
    TCname = 'Import Bulk Upload Users with invalid file type'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/BulkUploadIcon'))

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/Choosefile_ToUpload'), 'D:\\IMI_Automation\\IMIAssist_Automtion\\TestData\\imiassist_user_upload_template.xlsx', 
        FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Admin_Settings/Dept/UserCreation/Error_FileType'), 'Please enter valid file type', 
        FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CANCEL_Upload'))

    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Bulk upload users failed with invalid file type :' + e.getMessage())
} 

try {
    TCname = 'Import Bulk Upload Users with Valid file type'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/BulkUploadIcon'))

    WebUI.delay(2)

    WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/Choosefile_ToUpload'), 'D:\\IMI_Automation\\IMIAssist_Automtion\\TestData\\imiassist_user_upload_template.csv', 
        FailureHandling.OPTIONAL)

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_IMPORT_File'))

    WebUI.delay(2)

    WebUI.verifyElementText(findTestObject('Admin_Settings/Dept/UserCreation/BulkImport_SuccesMsg'), 'Your file has been successfully imported. Please check the users list for update.', 
        FailureHandling.OPTIONAL)

    String BulkImport_UserCount = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/BulkImport_UserCount'))

    String BulkImport_UserAssigned = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/BulkImport_UserAssigned'))

    String BulkImport_ValidErrors = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/BulkImport_ValidErrors'))

    String BulkImport_DuplicateCnt = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/BulkImport_DuplicateCnt'))

    if ((((BulkImport_UserCount != '') && (BulkImport_UserAssigned != '')) && (BulkImport_ValidErrors != '')) && (BulkImport_DuplicateCnt != 
    '')) {
        KeywordUtil.markPassed('User Import Result is showing successfully as below:')

        KeywordUtil.markPassed('Users created: ' + BulkImport_UserCount)

        KeywordUtil.markPassed('Users Assigned roles: ' + BulkImport_UserAssigned)

        KeywordUtil.markPassed('Validation errors: ' + BulkImport_ValidErrors)

        KeywordUtil.markPassed('Duplicates: ' + BulkImport_DuplicateCnt)

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_CLOSE'))

        //	   if ((BulkImport_ValidErrors== 'File Validation Errors :  0') && (BulkImport_DuplicateCnt== 'File Validation Errors :  0'))
        //	   {
        for (int i = 1; i <= findTestData('BulkUploadData').getRowNumbers(); i++) {
            WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_User'), findTestData('BulkUploadData').getValue(
                    'Email', i), FailureHandling.OPTIONAL)

            WebUI.delay(2)

            CreationStatus = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/paginationObject'), 
                2)

            if (CreationStatus == true) {
                KeywordUtil.markPassed('User is created successfully by Bulk Upload')
            } else {
                KeywordUtil.markFailed('User is Not created by Bulk Upload: ' + findTestData('BulkUploadData').getValue(
                        'Email', i))
            }
        } // }
    } else {
        KeywordUtil.markFailed('User Import Result is NOT showing correctly')
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: Unable to Import Bulk Upload Users with Valid file typ :' + e.getMessage())
} 

