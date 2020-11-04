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

TCname = 'Checking Bulk upload user is able to Login and Take the Call'

logger.logInfo('***START Of TEST CASE: ' + TCname)

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', 8))

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('BulkUploadData').getValue(
            'Email', 1))

    //*** Change password after restting password from mail
    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('BulkUploadData').getValue(
            'Password', 8))

    //***
    WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))

    WebUI.delay(4)

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Navigation_Appointments'))

    WebUI.delay(2)
	
	//*** Objects fro UserCreation/Appointment_Flow
	//*** check these objects and implement flow
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

