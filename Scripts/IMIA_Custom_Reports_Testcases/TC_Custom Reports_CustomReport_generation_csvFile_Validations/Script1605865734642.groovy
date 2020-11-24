import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testdata.CSVData
import com.kms.katalon.core.testdata.reader.CSVSeparator

KeywordLogger logger = new KeywordLogger()

//check and disable as per flow
CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)

CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()

WebUI.delay(2)

try {
    TCname1 = findTestData('CustomReports_Filters').getValue('Description', 16)
    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    //GroupBy
    String groupBy = findTestData('CustomReports_Filters').getValue('GroupBy', 16)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Groupby_Specialty'))

    if (groupBy == 'Speciality') {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Specialty'))
    } else {
        WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Team'))
    }
    
//From date - To date
    String startDateVal = findTestData('CustomReports_Filters').getValue('fromDate', 16)
    String endDateVal = findTestData('CustomReports_Filters').getValue('toDate', 16)
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))
    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'), startDateVal)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))
    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'), endDateVal)

//Status

//Priority
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))
    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

	String p1xpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + "Priority") + '\'') + ')]'
    TestObject p1to = new TestObject('objectName')
    p1to.addProperty('xpath', ConditionType.EQUALS, p1xpath)
    WebUI.click(p1to)
		

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


//***	Patient Email, Patient Phone, Clinician Email, Client Id
	String tagsTestData = findTestData('CustomReports_Filters').getValue('TestData', 16)	
	String[] tagsTestDataVals = split(tagsTestData,",")

	PatientEmail = tagsTestDataVals[0]
	PatientPhone = tagsTestDataVals[1]
	ClinicianEmail = tagsTestDataVals[2]
	ClientId = tagsTestDataVals[3]

	
//Patient Email
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

	String pExpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Patient Email') + '\'') + ')]'

	TestObject pEto = new TestObject('objectName')

	pEto.addProperty('xpath', ConditionType.EQUALS, pExpath)

	WebUI.click(pEto)

	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Patient_email'), PatientEmail)


//Patient Phone
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

	String pPxpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Patient Phone') + '\'') + ')]'

	TestObject pPto = new TestObject('objectName')

	pPto.addProperty('xpath', ConditionType.EQUALS, pPxpath)

	WebUI.click(pPto)

	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Patient_email'), PatientPhone)


//Clinician Email
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

	String pExpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Clinician Email') + '\'') + ')]'

	TestObject pEto = new TestObject('objectName')

	pEto.addProperty('xpath', ConditionType.EQUALS, pExpath)

	WebUI.click(pEto)

	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Clinician_email'), ClinicianEmail)
	
	
//Client ID
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

	String cliIDxpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + 'Client ID') + '\'') + ')]'

	TestObject cliIdto = new TestObject('objectName')

	cliIdto.addProperty('xpath', ConditionType.EQUALS, cliIDxpath)

	WebUI.click(cliIdto)	
	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/input_Client_Id'), ClientId)

	
 //Create Report
    WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_ReportTitle'), findTestData('CustomReports_Filters').getValue(
            'ReportTitle', 16), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/checkbox_EmailReport'))

    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/CR_emailAddress'), findTestData('CustomReports_Filters').getValue(
            'Email_ID', 16), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_CREATE REPORT'))
	WebUI.delay(1)

	actualSuccMsg = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/ErrorMsg_Header_CR'))
	
	expectedSuccMsg = findTestData('CustomReports_Filters').getValue('Expected_Msg_Header', 16)

	if (actualSuccMsg == expectedSuccMsg) {
		KeywordUtil.markPassed('Custom Report is generated successfully: ' + actualSuccMsg)
	} else {
		KeywordUtil.markFailed(((((('Custom Report is NOT generated : ' + 'Actual is: ') + actualSuccMsg) +
			' ') + ',') + 'Expected is: ') + expectedSuccMsg)
	}
	
	WebUI.delay(5)
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_button_Download'))
	WebUI.delay(3)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/CR_button_Close'))
	WebUI.delay(2)
	
//Generated csv file report validations		
	String reportTitle = findTestData('CustomReports_Filters').getValue('ReportTitle', 16)
	//Considering default downloads folder
	String userprofile = System.getenv("USERPROFILE");
	CSVData csvData = new CSVData(userprofile+"//Downloads//"+reportTitle+".csv", true, CSVSeparator.COMMA)

	patEmail = csvData.getValue('Patient Email', 2)
	patPhone = csvData.getValue('Patient Phone', 2)
	cliEmail = csvData.getValue('Clinician Email', 2)
	priorityTag = csvData.getValue('Priority', 2)
	statusTag = csvData.getValue('Status', 2)
	
	totRecords = csvData.rowNumbers //this is to get all the used rows or total number of rows
	println totRecords
	
	//Update once the existing issue is resolved
	if ((PatientEmail == patEmail) && (PatientPhone == patPhone) && (ClinicianEmail == cliEmail) && (ClientId == cliID) && (priority==priorityTag) && (status==statusTag))
	{
		KeywordUtil.markPassed('Custom Report is generated successfully selected filters')
	} else {
		KeywordUtil.markFailed('Custom Report generated is not having the selected filters properly')
	}
	

	logger.logInfo('***END Of TEST CASE: ' + TCname1)
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}