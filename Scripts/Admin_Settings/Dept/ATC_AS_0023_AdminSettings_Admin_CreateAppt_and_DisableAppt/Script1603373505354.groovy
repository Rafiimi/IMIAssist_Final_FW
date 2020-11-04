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

KeywordLogger logger = new KeywordLogger()

try {
    TCname = findTestData('Appointment_Tags').getValue('Description', 1)

    logger.logInfo('***START Of TEST CASE: ' + TCname)

	CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(8)

    CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('AppointmentTypes').getValue('SpecialityObjectClass', 
            1), findTestData('AppointmentTypes').getValue('Speciality', 1))

    not_run: WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/SelectDepartment'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_AppointmentType'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Link_CreateAppointmentType'))

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Enter_AppointmentType'), findTestData('AppointmentTypes').getValue(
            'ApptType', 1), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/ApptType_SelectTeam'))

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('AppointmentTypes').getValue('TeamObjClass', 
            1), findTestData('AppointmentTypes').getValue('Team', 1))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/ApptType_CREATE'))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AppointmentTypes').getValue('Expected_Msg_Header', 1)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Admin should be able to Create Appointment Type successfully in Appointment Management tab')
    } else {
        KeywordUtil.markFailed(actualMsg)
    }
	
	//Create Appointment with existing data
	TCname2 = 'Verifying error message when creating Appointment type with existing data'
	logger.logInfo('***START Of TEST CASE: ' + TCname2)
	
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Link_CreateAppointmentType'))
	
	WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Enter_AppointmentType'), findTestData('AppointmentTypes').getValue(
			'ApptType', 1), FailureHandling.OPTIONAL)

	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/ApptType_SelectTeam'))

	CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('AppointmentTypes').getValue('TeamObjClass',
			1), findTestData('AppointmentTypes').getValue('Team', 1))

	WebUI.delay(1)

	WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/ApptType_CREATE'))

	WebUI.delay(1)

	actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

	expectedMsg = 'Appointment Type already exists'

	if (actualMsg == expectedMsg) {
		KeywordUtil.markPassed('Proper error message is displayed: '+expectedMsg)
	} else {
		KeywordUtil.markFailed(actualMsg)
	}
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

try {
    TCname3 = findTestData('AppointmentTypes').getValue('Description', 2)

    logger.logInfo('***START Of TEST CASE: ' + TCname3)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_AppointmentType'), findTestData('AppointmentTypes').getValue(
            'ApptType', 2), FailureHandling.OPTIONAL)

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.ClickToggleObject'(findTestData('AppointmentTypes').getValue('ApptType', 2))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = findTestData('AppointmentTypes').getValue('Expected_Msg_Header', 2)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Appointment Type is Disabled successfully: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Appointment Type is NOT Disabled: ' + actualMsg)
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname3)

	//Enable checking
	TCname4 = findTestData('AppointmentTypes').getValue('Description', 3)
	logger.logInfo('***START Of TEST CASE: ' + TCname4)
	
	WebUI.delay(5)
	CustomKeywords.'reusableKeywords.Reusable.ClickToggleObject'(findTestData('AppointmentTypes').getValue('ApptType', 3))
	
	WebUI.delay(1)

	actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

	expectedMsg =  findTestData('AppointmentTypes').getValue('Expected_Msg_Header', 3)

	if (actualMsg == expectedMsg) {
		KeywordUtil.markPassed('Appointment Type is Enabled successfully: ' + expectedMsg)
	} else {
		KeywordUtil.markFailed('Tag is NOT Disabled: ' + actualMsg)
	}

 //   CustomKeywords.'reusableKeywords.Reusable.Logout'()
   
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

