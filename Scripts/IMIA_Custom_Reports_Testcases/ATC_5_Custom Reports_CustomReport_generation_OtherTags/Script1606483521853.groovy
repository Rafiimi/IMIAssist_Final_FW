import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

KeywordLogger logger = new KeywordLogger()

//check and disable as per flow
CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)

CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()

WebUI.delay(2)

try {
    TCname1 = 'Validation of Clinician email, Tags, Patient email, Patient phone and Client ID tags'

    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    //GroupBy
    String groupBy = findTestData('CustomReports_Filters').getValue('GroupBy', 15)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Groupby_Specialty'))

    if (groupBy == 'Speciality') {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Specialty'))
    } else {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Team'))
    }
    
    //Date
    String startDateVal = findTestData('CustomReports_Filters').getValue('fromDate', 15)

    String endDateVal = findTestData('CustomReports_Filters').getValue('toDate', 15)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))

    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'), startDateVal)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))

    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'), endDateVal)

    //Clinician Email
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    String pExpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Clinician Email') + '\'') + ')]'

    TestObject pEto = new TestObject('objectName')

    pEto.addProperty('xpath', ConditionType.EQUALS, pExpath)

    WebUI.click(pEto)

    String clinicianEmail = findTestData('CustomReports_Filters').getValue('TestData', 14)

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Clinician_email'), clinicianEmail)

    String cliEmailSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/ClinicianEmail_Container'))

    String[] cliEmailSourceList = cliEmailSource.split('\n')

    //validation
    int clinicianEmailCount = cliEmailSourceList.size()

    //Tags
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    //Clicking Tags
    String Txpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Tags') + '\'') + ')]'

    TestObject toT = new TestObject('objectName')

    toT.addProperty('xpath', ConditionType.EQUALS, Txpath)

    WebUI.click(toT)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Placeholder_SelectTags'))

    WebUI.delay(1)

    WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/Add_an_attribute'))

    //Select any random Tag
    String Cxpath = '//*[@class="imiassist-multiselect-input ng-pristine ng-untouched ng-valid ng-empty"]//following::label[1]'

    TestObject toC = new TestObject('objectName')

    toC.addProperty('xpath', ConditionType.EQUALS, Cxpath)

    WebUI.click(toC)

    //validation
    String TagsSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Tags_Container'))

    String[] TagsSourceList = TagsSource.split('\n')

    int TagsSourceListCount = TagsSourceList.size()

    //Patient Email
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    String pExpath2 = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Patient Email') + '\'') + ')]'

    TestObject pEto2 = new TestObject('objectName')

    pEto2.addProperty('xpath', ConditionType.EQUALS, pExpath2)

    WebUI.click(pEto2)

    String patEmail = findTestData('CustomReports_Filters').getValue('TestData', 12)

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Patient_email'), patEmail)

    //Need to change this once existing issue is fixed for Patient email 
    String patEmailSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/PatientEmail_Container'))

    String[] patEmailSourceList = patEmailSource.split('\n')

    //validation 
    int patEmailListCount = patEmailSourceList.size()

    //Patient Phone
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    String pPxpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Patient Phone') + '\'') + ')]'

    TestObject pPto = new TestObject('objectName')

    pPto.addProperty('xpath', ConditionType.EQUALS, pPxpath)

    WebUI.click(pPto)

    String patPhone = findTestData('CustomReports_Filters').getValue('TestData', 13)

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Patient_email'), patPhone)

    //Need to change this once existing issue is fixed for Patient email
    String patPhoneSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/PatientPhone_Container'))

    String[] patPhoneSourceList = patPhoneSource.split('\n')

    //validation
    int patPhoneListCount = patPhoneSourceList.size()

    //Client ID
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    String cliIDxpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Client ID') + '\'') + ')]'

    TestObject cliIdto = new TestObject('objectName')

    cliIdto.addProperty('xpath', ConditionType.EQUALS, cliIDxpath)

    WebUI.click(cliIdto)

    String clientID = findTestData('CustomReports_Filters').getValue('TestData', 15)

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Client_Id'), clientID)

    String cliIdSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/ClientID_Container'))

    String[] cliIdSourceList = cliIdSource.split('\n')

    //validation
    int cliIdListCount = cliIdSourceList.size()

    //Create Report
    WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_ReportTitle'), findTestData('CustomReports_Filters').getValue(
            'ReportTitle', 15), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/checkbox_EmailReport'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_emailAddress'), findTestData('CustomReports_Filters').getValue(
            'Email_ID', 15), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))

    WebUI.delay(1)

    actualSuccMsg = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/ErrorMsg_Header_CR'))

    expectedSuccMsg = findTestData('CustomReports_Filters').getValue('Expected_Msg_Header', 15)

    if (actualSuccMsg == expectedSuccMsg) {
        KeywordUtil.markPassed('Custom Report is generated successfully: ' + actualSuccMsg)
    } else {
        KeywordUtil.markFailed(((((('Custom Report is NOT generated : ' + 'Actual is: ') + actualSuccMsg) + ' ') + ',') + 
            'Expected is: ') + expectedSuccMsg)
    }
    
    WebUI.delay(5)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_button_Close'))

    WebUI.delay(2)

    String reportTitle = findTestData('CustomReports_Filters').getValue('ReportTitle', 15)

    //clicking on the report created
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Search_CustomReports'), reportTitle)

    WebUI.delay(1)

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('CustomReports_Filters').getValue('ReportTitle', 
            15))

    WebUI.delay(2)

    //Report validations
    //Clinician email 
    String clinEmailpath = '//*[@class="custom-report-detail-title mr-2 ng-binding" and contains (text(),"Clinician Email")]//following::div[1]'

    TestObject viewRepcliEmail = new TestObject('objectName')

    viewRepcliEmail.addProperty('xpath', ConditionType.EQUALS, viewRepcliEmail)

    String cliEmailList = WebUI.getText(viewRepcliEmail)

    int cliEmailListcntVal

    String[] cliEmailListcnt

    if (cliEmailList.length() >= 1) {
        if (cliEmailList.contains(',')) {
            cliEmailListcnt = cliEmailList.split(', ')

            cliEmailListcntVal = cliEmailListcnt.size()
        } else {
            cliEmailListcntVal = 1
        }
    } else {
        cliEmailListcntVal = 0
    }
    
    //Tags
    String viewRepTagspath = '//*[@class="custom-report-detail-title mr-2 ng-binding" and contains (text(),"Tags")]//following::div[1]'

    TestObject viewRepTagspath2 = new TestObject('objectName')

    viewRepTagspath2.addProperty('xpath', ConditionType.EQUALS, viewRepTagspath)

    String viewRepTagspathList = WebUI.getText(viewRepTagspath2)

    int viewRepTagspathListcntVal

    String[] viewRepTagspathListcnt

    if (viewRepTagspathList.length() >= 1) {
        if (viewRepTagspathList.contains(',')) {
            viewRepTagspathListcnt = viewRepTagspathList.split(', ')

            viewRepTagspathListcntVal = viewRepTagspathListcnt.size()
        } else {
            viewRepTagspathListcntVal = 1
        }
    } else {
        viewRepTagspathListcntVal = 0
    }
    
    //Patient Email
    String patientEmailpath = '//*[@class="custom-report-detail-title mr-2 ng-binding" and contains (text(),"Patient Email")]//following::div[1]'

    TestObject viewreppatientEmail = new TestObject('objectName')

    viewreppatientEmail.addProperty('xpath', ConditionType.EQUALS, patientEmailpath)

    String viewreppatientEmailList = WebUI.getText(viewreppatientEmail)

    int patientEmailListcntVal

    String[] patientEmailListcnt

    if (viewreppatientEmailList.length() >= 1) {
        if (viewreppatientEmailList.contains(',')) {
            patientEmailListcnt = viewreppatientEmailList.split(', ')

            patientEmailListcntVal = patientEmailListcnt.size()
        } else {
            patientEmailListcntVal = 1
        }
    } else {
        patientEmailListcntVal = 0
    }
    
    //Patient Phone
    String patientPhonepath = '//*[@class="custom-report-detail-title mr-2 ng-binding" and contains (text(),"Patient Phone")]//following::div[1]'

    TestObject viewreppatientPhone = new TestObject('objectName')

    viewreppatientPhone.addProperty('xpath', ConditionType.EQUALS, patientPhonepath)

    String viewreppatientList = WebUI.getText(viewreppatientPhone)

    int patientPhoneListcntVal

    String[] patientPhoneListcnt

    if (viewreppatientList.length() >= 1) {
        if (viewreppatientList.contains(',')) {
            patientPhoneListcnt = viewreppatientList.split(', ')

            patientPhoneListcntVal = patientPhoneListcnt.size()
        } else {
            patientPhoneListcntVal = 1
        }
    } else {
        patientPhoneListcntVal = 0
    }
    
    //Client ID
    String clientIDpath = '//*[@class="custom-report-detail-title mr-2 ng-binding" and contains (text(),"Client ID")]//following::div[1]'

    TestObject viewrepclientIDpath = new TestObject('objectName')

    viewrepclientIDpath.addProperty('xpath', ConditionType.EQUALS, clientIDpath)

    String viewrepclientIDList = WebUI.getText(viewrepclientIDpath)

    int viewrepclientIDListcntVal

    String[] viewrepclientIDListcnt

    if (viewrepclientIDList.length() >= 1) {
        if (viewrepclientIDList.contains(',')) {
            viewrepclientIDListcnt = viewrepclientIDList.split(', ')

            viewrepclientIDListcntVal = viewrepclientIDListcnt.size()
        } else {
            viewrepclientIDListcntVal = 1
        }
    } else {
        viewrepclientIDListcntVal = 0
    }
    
    //Validations from here...
    //Clinician email filters
    if (clinicianEmailCount == cliEmailListcntVal) {
        for (int l = 0; l <= (clinicianEmailCount - 1); l++) {
            if ((cliEmailSourceList[l]) == (cliEmailListcnt[l])) {
                KeywordUtil.markPassed('Clinician email filters are displaying correctly in Custom report generated')
            } else {
                KeywordUtil.markFailed('Clinician email filters are NOT displaying correctly in Custom report generated')
            }
        }
        
        KeywordUtil.markPassed('Clinician email filters count is showing correctly in Custom report generated')
    } else {
        KeywordUtil.markFailed('Clinician email filters count mismatched in Custom report generated')
    }
    
    //Tags filters
    if (TagsSourceListCount == viewRepTagspathListcntVal) {
        for (int m = 0; m <= (TagsSourceListCount - 1); m++) {
            if ((TagsSourceList[m]) == (viewRepTagspathListcnt[m])) {
                KeywordUtil.markPassed('Tags filters are displaying correctly in Custom report generated')
            } else {
                KeywordUtil.markFailed('Tags filters are NOT displaying correctly in Custom report generated')
            }
        }
        
        KeywordUtil.markPassed('Tags filters count is showing correctly in Custom report generated')
    } else {
        KeywordUtil.markFailed('Tags filters count mismatched in Custom report generated')
    }
    
    //Patient email filters
    if (patEmailListCount == patientPhoneListcntVal) {
        for (int n = 0; n <= (patEmailListCount - 1); n++) {
            if ((patEmailSourceList[n]) == (patientEmailListcnt[n])) {
                KeywordUtil.markPassed('Patient email filters are displaying correctly in Custom report generated')
            } else {
                KeywordUtil.markFailed('Patient email filters are NOT displaying correctly in Custom report generated')
            }
        }
        
        KeywordUtil.markPassed('Patient email filters count is showing correctly in Custom report generated')
    } else {
        KeywordUtil.markFailed('Patient email filters count mismatched in Custom report generated')
    }
    
    //Patient Phone filters
    if (patPhoneListCount == patientEmailListcntVal) {
        for (int o = 0; o <= (patPhoneListCount - 1); o++) {
            if ((patPhoneSourceList[o]) == (patientPhoneListcnt[o])) {
                KeywordUtil.markPassed('Patient Phone filters are displaying correctly in Custom report generated')
            } else {
                KeywordUtil.markFailed('Patient Phone filters are NOT displaying correctly in Custom report generated')
            }
        }
        
        KeywordUtil.markPassed('Patient Phone filters count is showing correctly in Custom report generated')
    } else {
        KeywordUtil.markFailed('Patient Phone filters count mismatched in Custom report generated')
    }
    
    //Client ID filters
    if (cliIdListCount == viewrepclientIDListcntVal) {
        for (int p = 0; p <= (cliIdListCount - 1); p++) {
            if ((cliIdSourceList[p]) == (viewrepclientIDListcnt[p])) {
                KeywordUtil.markPassed('Client ID filters are displaying correctly in Custom report generated')
            } else {
                KeywordUtil.markFailed('Client ID filters are NOT displaying correctly in Custom report generated')
            }
        }
        
        KeywordUtil.markPassed('Client ID filters count is showing correctly in Custom report generated')
    } else {
        KeywordUtil.markFailed('Client ID filters count mismatched in Custom report generated')
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
    logger.logInfo('***END Of TEST CASE: ' + TCname1)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

