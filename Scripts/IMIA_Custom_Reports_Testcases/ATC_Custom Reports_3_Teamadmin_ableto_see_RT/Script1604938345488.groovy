import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'In same script added below cases as well\r\nTC_Custom Reports_5'
try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('IMI_Custome_reports_TD').getValue(1, 1))

    WebUI.setText(findTestObject('null'), 
        findTestData('IMI_Custome_reports_TD').getValue(2, 1))

    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), 
        findTestData('IMI_Custome_reports_TD').getValue(3, 1))

    WebUI.click(findTestObject('null'))

    KeywordUtil.markPassed('SUCCESS:Agent able to login the application')
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to login the application:' + e.getMessage())
} 

//Navigate to the custom report under reports tab
CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()

//Verify the filter section is available under custom report page
try {
    Filtersectionstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Filtersectionobject'))

    if (Filtersectionstatus == true) {
        KeywordUtil.markPassed('SUCCESS:agent able to see the filter section in custom reports page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:agent unable to see the filter sections in custom reports page:' + e.getMessage())
} 

//Verify the attribute section is available under custom report page
try {
    Attributesectionstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Attribute_section'))

    if (Attributesectionstatus == true) {
        KeywordUtil.markPassed('SUCCESS:agent able to see the attribute section in custom reports page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:agent unable to see the attribute sections in custom reports page:' + e.getMessage())
} 

//Verify the export settings section is available under custom report page
try {
    Attributesectionstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Exportsettings_section'))

    if (Attributesectionstatus == true) {
        KeywordUtil.markPassed('SUCCESS:agent able to see the export settings section in custom reports page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:agent unable to see the export settings sections in custom reports page:' + e.getMessage())
} 

