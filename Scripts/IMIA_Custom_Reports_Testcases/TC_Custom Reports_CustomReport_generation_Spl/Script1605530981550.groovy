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
    TCname1 = "Validation of Speciality, Status and Priority tags"

    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    //GroupBy
    String groupBy = findTestData('CustomReports_Filters').getValue('GroupBy', 8)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Groupby_Specialty'))

    if (groupBy == 'Speciality') {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Specialty'))
    } else {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Team'))
    }
    
	//validation 1 - specialty
	String specialtySource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Specialty_Container'))
	String[] specialtyList = specialtySource.split('\n')
	int specialtyListCount = specialtyList.size()
	
    //From date - To date
    String startDateVal = findTestData('CustomReports_Filters').getValue('fromDate', 8)
    String endDateVal = findTestData('CustomReports_Filters').getValue('toDate', 8)
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))
    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'), startDateVal)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))
    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'), endDateVal)

    //Status- reomve what ever is want to exclude
    String status2Remove = findTestData('CustomReports_Filters').getValue('Status_NO', 8)

    if (status2Remove != '') {
    }
    
    //Status
    String statusListSource2 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Status_Container'))
    String[] StatList1 = statusListSource2.split('\n')
    //validation 2
    int StatListCount1 = StatList1.size()


//Priority
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

	String p1xpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + "Priority") + '\'') + ')]'
    TestObject p1to = new TestObject('objectName')
    p1to.addProperty('xpath', ConditionType.EQUALS, p1xpath)
    WebUI.click(p1to)

    String prioritySource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Priority_Container'))
    String[] priorityList = prioritySource.split('\n')

    //validation 3
    int priorityListCount = priorityList.size()

		
//Create Report
	WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))
   
	actualMsg= WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/CR_errorMsg_ReportTitle'))
	expectedMsg = findTestData('CustomReports_Filters').getValue('Expected_Msg_FieldLevel', 8)
	
	if (actualMsg == expectedMsg) {
		KeywordUtil.markPassed(((((('Report title field validation successful: ' + 'Actual is: ') + actualMsg) +
			' ') + ',') + 'Expected is: ') + expectedMsg)
	} else {
		KeywordUtil.markFailed(((((('Report title field validation is NOT successful: ' + 'Actual is: ') + actualMsg) +
			' ') + ',') + 'Expected is: ') + expectedMsg)
	}
	
		
	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_ReportTitle'), findTestData('CustomReports_Filters').getValue(
            'ReportTitle', 9), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/checkbox_EmailReport'))

    WebUI.delay(1)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))

    WebUI.delay(1)

    actualMsg= WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/CR_errorMsg_EmailReport'))
	
	expectedMsg = findTestData('CustomReports_Filters').getValue('Expected_Msg_FieldLevel', 9)

	if (actualMsg == expectedMsg) {
		KeywordUtil.markPassed(((((('Email Report field validation successful: ' + 'Actual is: ') + actualMsg) +
			' ') + ',') + 'Expected is: ') + expectedMsg)
	} else {
		KeywordUtil.markFailed(((((('Email Report field validation is NOT successful: ' + 'Actual is: ') + actualMsg) +
			' ') + ',') + 'Expected is: ') + expectedMsg)
	}

    
	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_emailAddress'), findTestData('CustomReports_Filters').getValue(
		'Email_ID', 10), FailureHandling.OPTIONAL)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))
	
	WebUI.delay(1)

	actualSuccMsg = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/ErrorMsg_Header_CR'))
	
	expectedSuccMsg = findTestData('CustomReports_Filters').getValue('Expected_Msg_Header', 10)

	if (actualSuccMsg == expectedSuccMsg) {
		KeywordUtil.markPassed('Custom Report is generated successfully: ' + actualSuccMsg)
	} else {
		KeywordUtil.markFailed(((((('Custom Report is NOT generated : ' + 'Actual is: ') + actualSuccMsg) +
			' ') + ',') + 'Expected is: ') + expectedSuccMsg)
	}
	
	WebUI.delay(5)
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_button_Close'))
	WebUI.delay(2)
	
	String reportTitle = findTestData('CustomReports_Filters').getValue('ReportTitle', 9)
	
	//clicking on the report created
	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Search_CustomReports'), reportTitle)
    WebUI.delay(1)
    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicText'(findTestData('CustomReports_Filters').getValue('ReportTitle', 
            9))

    WebUI.delay(2)
	
	//Report validations
	//Status
	String viewRepStatpath = ('//*[@class="custom-report-detail-title mr-2" and contains (text(),"Status")]//following::div[1]')
	TestObject viewRepStat = new TestObject('objectName')
	viewRepStat.addProperty('xpath', ConditionType.EQUALS, viewRepStatpath)
	String statusList =WebUI.getText(viewRepStat)
	
	String[] statusListcnt = statusList.split(', ')
	int statusListcntVal = statusListcnt.size()
	
	//Priority
	String viewRepPripath = ('//*[@class="custom-report-detail-title mr-2 ng-binding" and contains (text(),"Priority")]//following::div[1]')
	TestObject viewRepPri = new TestObject('objectName')
	viewRepPri.addProperty('xpath', ConditionType.EQUALS, viewRepPripath)
	String priorityList2 = WebUI.getText(viewRepPri)
	
	String[] priorityListcnt = priorityList2.split(', ')
	int priorityListcntVal = priorityListcnt.size()
	
	
	//Specialty
	String viewRepSplList = ('//*[@class="custom-report-detail-title ng-binding ng-scope"][2]')
	TestObject viewRepSpl = new TestObject('objectName')
	viewRepSpl.addProperty('xpath', ConditionType.EQUALS, viewRepSplList)
	String viewRepSplListCnt = WebUI.getText(viewRepSpl)
	
	int specialtyListcntVal
	String[] specialtyListcnt
	
	if (viewRepSplListCnt.length()>=1){
		if(viewRepSplListCnt.contains(",")) {
			specialtyListcnt = viewRepSplListCnt.split(', ')
			specialtyListcntVal = specialtyListcnt.size()
		}else
		{
			specialtyListcntVal = 1
		}
	}
	else
	{
		specialtyListcntVal = 0
	}
	
	
	//Validations from here...
	//Specialty filters
	if (specialtyListCount == specialtyListcntVal) {
		for (int i = 0; i <= specialtyListCount-1; i++) {
			if (specialtyListcnt[i] == specialtyList[i]) {
				KeywordUtil.markPassed('Specialty filters are displaying correctly in Custom report generated')
			} else {
				KeywordUtil.markFailed('Specialty filters are NOT displaying correctly in Custom report generated')
			}
		}
		KeywordUtil.markPassed('Specialty filters count is showing correctly in Custom report generated')
	} else {
		KeywordUtil.markFailed('Specialty filters count mismatched in Custom report generated')
	}
	
	//Status filters
	if (StatListCount1 == statusListcntVal) {
		for (int j = 0; j <= StatListCount1-1; j++) {
			if (StatList1[j] == statusListcnt[j]) {
				KeywordUtil.markPassed('Status filters are displaying correctly in Custom report generated')
			} else {
				KeywordUtil.markFailed('Status filters are NOT displaying correctly in Custom report generated')
			}
		}
		KeywordUtil.markPassed('Status filters count is showing correctly in Custom report generated')
	} else {
		KeywordUtil.markFailed('Status filters count mismatched in Custom report generated')
	}
	
	//Priority filters
	if (priorityListCount == priorityListcntVal) {
		for (int k = 0; k <= priorityListCount-1; k++) {
		//	if (priorityList[k] == priorityListcnt[k]) {
			if (priorityList[k].equalsIgnoreCase(priorityListcnt[k])) {
				KeywordUtil.markPassed('Priority filters are displaying correctly in Custom report generated')
			} else {
				KeywordUtil.markFailed('Priority filters are NOT displaying correctly in Custom report generated')
			}
		}
		KeywordUtil.markPassed('Priority filters count is showing correctly in Custom report generated')
	} else {
		KeywordUtil.markFailed('Priority filters count mismatched in Custom report generated')
	}
	

	logger.logInfo('***END Of TEST CASE: ' + TCname1)
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}