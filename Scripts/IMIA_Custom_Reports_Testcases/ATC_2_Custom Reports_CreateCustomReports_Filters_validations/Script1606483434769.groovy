import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordLogger logger = new KeywordLogger()

CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(10)

CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()

WebUI.delay(2)

//Add filter Attributes
try {
    TCname1 = findTestData('CustomReports_Filters').getValue('Description', 1)
    logger.logInfo('***START Of TEST CASE: ' + TCname1)
   
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    String FilterlistSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Values_SelectFilter'))

	String[] list1 = FilterlistSource.split('\n')
	
	int ListCount = list1.size()
	
	String expList = findTestData('CustomReports_Filters').getValue('TestData', 1)
	
	String[] list2 = expList.split(',')
	
	int List2Count = list2.size()
		
	if (ListCount == List2Count) {
		
		for (int i = 0; i <= List2Count-1; i++)
		{
			if (list2[i] == list1[i])
			{
				KeywordUtil.markPassed('Add filter attributes : '+'Actual: ' + list1[i] +' , ' + 'Expected: ' + list2[i])
			} else {
				KeywordUtil.markFailed('Add filter attributes are NOT displaying correctly: '+'Actual: ' + list1[i] +' , ' + 'Expected: ' + list2[i])
			}
		}
	 }
	
    logger.logInfo('***END Of TEST CASE: ' + TCname1)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

//GroupBy Speciality
try {
	TCname2 = findTestData('CustomReports_Filters').getValue('Description', 2)
	logger.logInfo('***START Of TEST CASE: ' + TCname2)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Groupby_Specialty'))

	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/gb_Select_Specialty'))

	String gblistSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/gb_Speciality_filters'))
	String[] gblist = gblistSource.split('\n')
	int gbListCount = gblist.size()
	
	String expList2 = findTestData('CustomReports_Filters').getValue('TestData', 2)
	String[] tdlist = expList2.split(',')
	int tdlistCount = tdlist.size()
	
	if (gbListCount == tdlistCount) {
		
		for (int j = 0; j <= tdlistCount-1; j++)
		{
			if (tdlist[j] == gblist[j])
			{
				KeywordUtil.markPassed('Specialties are displaying correctly under group by filter : '+'Actual: ' + gblist[j] +' , ' + 'Expected: ' + tdlist[j])
			} else {
				KeywordUtil.markFailed('specialties are NOT displaying correctly under group by filter : '+'Actual: ' + gblist[j] +' , ' + 'Expected: ' + tdlist[j])
			}
		}
	 }
	
	logger.logInfo('***END Of TEST CASE: ' + TCname2)
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}

//Select/deselect the specialties/teams
try {
	TCname3 = findTestData('CustomReports_Filters').getValue('Description', 3)
	logger.logInfo('***START Of TEST CASE: ' + TCname3)
	
	String gbFiltListSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/gb_Speciality_filters'))
	String[] Filtlist = gbFiltListSource.split('\n')
	int FiltListCount = Filtlist.size()
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/dept_multiselect_down'))
	
	//Dept for de-selection
	String testData = findTestData('CustomReports_Filters').getValue('TestData', 3)
	String[] tdListVals = testData.split(',')
	String Dept=tdListVals[0]
	String Team=tdListVals[1]
	
	String xpath = ((('//label[contains(text(),' + '\' ') + Dept) + ' \'') + ')][1]'
	TestObject to = new TestObject('objectName')
	to.addProperty('xpath', ConditionType.EQUALS, xpath)
	WebUI.click(to)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/dept_multiselect_up'))
	
	String gbFiltListSource2 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/gb_Speciality_filters'))
	String[] Filtlist2 = gbFiltListSource2.split('\n')
	int FiltListCount2 = Filtlist2.size()
	
	if (FiltListCount2 != FiltListCount) {
		KeywordUtil.markPassed('Able to deselect the specialties successfully')
	} else 
	{
		KeywordUtil.markFailed('Not able to deselect the specialties successfully')
	}
			
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/dept_multiselect_down'))
	WebUI.click(to)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/dept_multiselect_up'))
	
	String gbFiltListSource3 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/gb_Speciality_filters'))
	String[] Filtlist3 = gbFiltListSource3.split('\n')
	int FiltListCount3 = Filtlist3.size()
	
	if (FiltListCount3 == FiltListCount) {
		KeywordUtil.markPassed('Able to Select the specialties successfully')
	} else {
		KeywordUtil.markFailed('Not able to Select the specialties successfully')
	}
	
	logger.logInfo('***END Of TEST CASE: ' + TCname3)
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}

//Select/deselect the available Statuses
try {
	TCname4 = findTestData('CustomReports_Filters').getValue('Description', 4)
	logger.logInfo('***START Of TEST CASE: ' + TCname4)
	
	String statusListSource = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Status_Container'))
	String[] StatList = statusListSource.split('\n')
	int StatListCount = StatList.size()
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Filters_Status_down'))
	
	//Dept for de-selection
	String testStatus = findTestData('CustomReports_Filters').getValue('TestData', 4)
		
	String xpath = ((('//label[contains(text(),' + '\' ') + testStatus) + ' \'') + ')][1]'
	TestObject to2 = new TestObject('objectName')
	to2.addProperty('xpath', ConditionType.EQUALS, xpath)
	WebUI.click(to2)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Filters_Status_up'))
	
	String statusListSource2 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Status_Container'))
	String[] StatList2 = statusListSource2.split('\n')
	int StatListCount2 = StatList2.size()
	
	if (StatListCount2 != StatListCount) {
		KeywordUtil.markPassed('Able to deselect the Statuses successfully')
	} else
	{
		KeywordUtil.markFailed('Not able to deselect the Statuses successfully')
	}
			
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Filters_Status_up'))
	WebUI.click(to2)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Filters_Status_down'))
	
	String statusListSource3 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/Status_Container'))
	String[] StatList3 = statusListSource3.split('\n')
	int StatListCount3 = StatList3.size()
	
	if (StatListCount3 == StatListCount) {
		KeywordUtil.markPassed('Able to Select the Statuses successfully')
	} else {
		KeywordUtil.markFailed('Not able to Select the Statuses successfully')
	}
	
	logger.logInfo('***END Of TEST CASE: ' + TCname4)
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}

//Time Period selection
try {
	TCname5 = findTestData('CustomReports_Filters').getValue('Description', 5)
	logger.logInfo('***START Of TEST CASE: ' + TCname5)
	
	String startDateVal = findTestData('CustomReports_Filters').getValue('fromDate', 5)
    String endDateVal = findTestData('CustomReports_Filters').getValue('toDate', 5)	

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))
    WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'))
    WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_startDate'), startDateVal)

	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))
	WebUI.clearText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'))
	WebUI.setText(findTestObject('IMIA_Custome_Reports_objects/Calendar/input_endDate'), endDateVal)
	
	WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))
	
	String startDateAppl = WebUI.executeJavaScript(fromDate, null)
	String endDateAppl = WebUI.executeJavaScript(toDate, null)
	
	if ((startDateAppl == startDateVal) && (endDateAppl == endDateVal)) {
		KeywordUtil.markPassed('Selected dates are displayed at time period section correctly')
	} else {
		KeywordUtil.markFailed('Selected dates are NOT displayed at time period section correctly')
	}
	
	logger.logInfo('***END Of TEST CASE: ' + TCname5)
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 


//Select /deselect the available tags under filters section
try {
    TCname6 = findTestData('CustomReports_Filters').getValue('Description', 6)

    logger.logInfo('***START Of TEST CASE: ' + TCname6)

    input = findTestData('CustomReports_Filters').getValue('TestData', 6)
	
	//WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))
    //WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Link_AddFilter'))	//duplicate

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/List_SelectFilter'))

    //Clicking Tags
    String Txpath = ((('//*[@class="ng-binding ng-scope" and contains(text(),' + '\'') + input) + '\'') + ')]'

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

    boolean Tstat1= WebUI.verifyElementNotPresent(findTestObject('IMIA_Custome_Reports_objects/Placeholder_SelectTags'), 2, FailureHandling.OPTIONAL)
	if (Tstat1 == true) {
		KeywordUtil.markPassed('Able to Select the Tags from available list successfully')
	} else {
		KeywordUtil.markFailed('Not able to Select the Tags from available list successfully')
	}
	
	//De-select
	WebUI.click(toC)
	
	boolean Tstat2= WebUI.verifyElementPresent(findTestObject('IMIA_Custome_Reports_objects/Placeholder_SelectTags'), 2, FailureHandling.OPTIONAL)
	if (Tstat2 == true) {
		KeywordUtil.markPassed('Able to DeSelect the Tags from available list successfully')
	} else {
		KeywordUtil.markFailed('Not able to DeSelect the Tags from available list successfully')
	}
	logger.logInfo('***END Of TEST CASE: ' + TCname6)
	
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

//Select /deselect the additional attribues using  add an  attribute link
try {
    TCname7 = findTestData('CustomReports_Filters').getValue('Description', 7)

    logger.logInfo('***START Of TEST CASE: ' + TCname7)

    WebUI.mouseOver(findTestObject('IMIA_Custome_Reports_objects/Add_an_attribute'))

    String attrFiltListSource1 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/AttributesContainer'))

    String[] attrlist1 = attrFiltListSource1.split('\n')

    int attrlist1Count = attrlist1.size()

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Add_an_attribute'))

    WebUI.click(findTestObject('IMIA_Custome_Reports_objects/Select_newAttribute'))

	attrData = findTestData('CustomReports_Filters').getValue('TestData', 7)
	
	String selectAxpath = ((('//*[@title=' + '\'') + attrData) + '\'') + ']'
    TestObject toSelectA = new TestObject('objectName')
    toSelectA.addProperty('xpath', ConditionType.EQUALS, selectAxpath)
    WebUI.click(toSelectA)

    WebUI.delay(1)

    String attrFiltListSource2 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/AttributesContainer'))

    String[] attrlist2 = attrFiltListSource2.split('\n')

    int attrlist1Count2 = attrlist2.size()

    if (attrlist1Count2 != attrlist1Count) {
        KeywordUtil.markPassed('Able to add new Attribute successfully')
    } else {
        KeywordUtil.markFailed('Not able to add new Attribute successfully')
    }
    
    String Axpath = '//*[@class="d-flex imi-close create-custom-reports-tag-close"]'

    TestObject toA = new TestObject('objectName')

    toA.addProperty('xpath', ConditionType.EQUALS, Axpath)

    WebUI.click(toA)

    WebUI.delay(1)

    String attrFiltListSource3 = WebUI.getText(findTestObject('IMIA_Custome_Reports_objects/AttributesContainer'))

    String[] attrlist3 = attrFiltListSource3.split('\n')

    int attrlist1Count3 = attrlist3.size()

    if (attrlist1Count3 == attrlist1Count) {
        KeywordUtil.markPassed('Able to remove new Attribute successfully')
    } else {
        KeywordUtil.markFailed('Not able to remove new Attribute successfully')
    }
    
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
    logger.logInfo('***END Of TEST CASE: ' + TCname7)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

