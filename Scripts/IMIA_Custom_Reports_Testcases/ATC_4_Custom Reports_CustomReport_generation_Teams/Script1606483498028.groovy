import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

KeywordLogger logger = new KeywordLogger()

//check and disable as per flow
CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)

CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()

WebUI.delay(2)

try {
    TCname1 = findTestData('CustomReports_Filters').getValue('Description', 11)

    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    //GroupBy
    String groupBy = findTestData('CustomReports_Filters').getValue('GroupBy', 11)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Groupby_Specialty'))

    //Teams
    if (groupBy == 'Speciality') {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Specialty'))
    } else {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Team'))
    }
    
    //validation  - Teams
    String teamsSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Teams_Container'))

    String[] teamsList = teamsSource.split('\n')

    int teamsListCount = teamsList.size()

    //From date
    String startDateVal = findTestData('CustomReports_Filters').getValue('fromDate', 11)

    String endDateVal = findTestData('CustomReports_Filters').getValue('toDate', 11)

    String timePerBefore = startDateVal + " to " + endDateVal

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))

    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'), startDateVal)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))

    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'), endDateVal)

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_ReportTitle'), findTestData('CustomReports_Filters').getValue(
            'ReportTitle', 11), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/checkbox_EmailReport'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_emailAddress'), findTestData('CustomReports_Filters').getValue(
            'Email_ID', 11), FailureHandling.OPTIONAL)

    WebUI.delay(1)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))

    WebUI.delay(1)

    actualSuccMsg = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/ErrorMsg_Header_CR'))

    expectedSuccMsg = findTestData('CustomReports_Filters').getValue('Expected_Msg_Header', 11)

    if (actualSuccMsg == expectedSuccMsg) {
        KeywordUtil.markPassed('Custom Report is generated successfully: ' + actualSuccMsg)
    } else {
        KeywordUtil.markFailed(((((('Custom Report is NOT generated : ' + 'Actual is: ') + actualSuccMsg) + ' ') + ',') + 
            'Expected is: ') + expectedSuccMsg)
    }
    
    WebUI.delay(5)

    WebUI.verifyElementPresent(findTestObject('IMIA_Custome_Reports_objects/CR_button_Download'), 2, FailureHandling.OPTIONAL)

    WebUI.verifyElementPresent(findTestObject('IMIA_Custome_Reports_objects/CR_button_Close'), 2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_button_Close'))

    WebUI.delay(2)

    String reportTitle = findTestData('CustomReports_Filters').getValue('ReportTitle', 11)

    //clicking on the report created
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Search_CustomReports'), reportTitle)

    WebUI.delay(1)

    //Expires on
    String eXxpath = ('//*[contains(text(),"' + reportTitle) + '")]/following::div[6]'

    TestObject eXto = new TestObject('objectName')

    eXto.addProperty('xpath', ConditionType.EQUALS, eXxpath)

    String expiresOn = WebUI.getText(eXto)

    if (expiresOn.contains('days')) {
        KeywordUtil.markPassed('Expiry date is updating in the custom reports table successfully')
    } else {
        KeywordUtil.markFailed('Expiry date is NOT updating in the custom reports table')
    }
    
    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('CustomReports_Filters').getValue('ReportTitle', 
            11))

    WebUI.delay(2)

    WebUI.delay(2)

    //Report validations
    //Teams
    String viewRepSplList = '//*[@class="custom-report-detail-title ng-binding ng-scope"][2]'

    TestObject viewRepSpl = new TestObject('objectName')

    viewRepSpl.addProperty('xpath', ConditionType.EQUALS, viewRepSplList)

    String viewRepSplListCnt = WebUI.getText(viewRepSpl)

    String[] specialtyListcnt = viewRepSplListCnt.split(', ')

    int specialtyListcntVal = specialtyListcnt.size()

    //Teams filters
    if (teamsListCount == specialtyListcntVal) {
        for (int i = 0; i <= (teamsListCount - 1); i++) {
            if ((specialtyListcnt[i]) == (teansList[i])) {
                KeywordUtil.markPassed('Teams filters are displaying correctly in Custom report generated')
            } else {
                KeywordUtil.markFailed('Teams filters are NOT displaying correctly in Custom report generated')
            }
        }
        
        KeywordUtil.markPassed('Teams filters count is showing correctly in Custom report generated')
    } else {
        KeywordUtil.markFailed('Teams filters count mismatched in Custom report generated')
    }
    
    //Time periods
    String viewRepTimePer = '//*[@class="custom-report-detail-title mr-2" and contains (text(),"Time Period")]//following::div[1]'

    TestObject viewRepTime = new TestObject('objectName')

    viewRepTime.addProperty('xpath', ConditionType.EQUALS, viewRepTimePer)

    String timePerAfter = WebUI.getText(viewRepTime)

    if (timePerBefore == timePerAfter) {
        KeywordUtil.markPassed('Report is showing the selected time period episodes data successfully')
    } else {
        KeywordUtil.markFailed('Report is NOT showing the selected time period episodes data successfully')
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
    logger.logInfo('***END Of TEST CASE: ' + TCname1)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

