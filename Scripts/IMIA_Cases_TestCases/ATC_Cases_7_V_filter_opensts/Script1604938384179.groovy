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

'In same script added below cases \r\nTC_Cases_8\r\nTC_Cases_9'
//CustomKeywords.'reusableKeywords.Reusable.Login'()

try {
    WebUI.delay(3)

    WebUI.click(findTestObject('Cases_Module_objects/Reports_Tab_icon'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/ReportsTab'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Cases_subTab_icon'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Filteropt'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Closed_status'))

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Applyfilter_object'))
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to use filter option in cases page:' + e.getMessage())
} 

//Verify closed status appointments are available in cases page
try {
    Appointmentstatsuafterfilter = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Appointmentstatus')).trim()

    if (Appointmentstatsuafterfilter.equals('Closed')) {
        KeywordUtil.markPassed('SUCESS:Agent able filter closed app in cases page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to filterclosed filters in cases page:' + e.getMessage())
} 

WebUI.delay(2)

//Verify esclated statsu appointment are able to filter
try {
    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Closed_status'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/EsclatedStatus'))

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Applyfilter_object'))
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to filter esclated app in cases page:' + e.getMessage())
} 

//Verifyesclated app are filtered using filter option
try {
    Appointmentesclatedstatsuafterfilter = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Appointmentstatus')).trim()

    if (Appointmentesclatedstatsuafterfilter.equals('Escalated')) {
        KeywordUtil.markPassed('SUCESS:Agent able to filter esclated status app in cases page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to filter esclated filters in cases page:' + e.getMessage())
} 

//Verify Customer no sow/Patient DNA status appointment are able to filter
try {
	WebUI.click(findTestObject('Object Repository/Cases_Module_objects/EsclatedStatus'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Patientdnastatus'))

	WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Applyfilter_object'))
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR:Agent unable to filter esclated app in cases page:' + e.getMessage())
}

//Verifyesclated app are filtered using filter option
try {
	Appointmentpdnastatsuafterfilter = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Appointmentstatus')).trim()

	if (Appointmentpdnastatsuafterfilter.equals('Escalated')) {
		KeywordUtil.markPassed('SUCESS:Agent able to filter esclated status app in cases page')
	}
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR:Agent unable to filter esclated filters in cases page:' + e.getMessage())
}

CustomKeywords.'reusableKeywords.Reusable.Logout'()

