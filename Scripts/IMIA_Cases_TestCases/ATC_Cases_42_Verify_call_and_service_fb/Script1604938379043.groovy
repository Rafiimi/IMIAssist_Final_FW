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


CustomKeywords.'reusableKeywords.Reusable.Login'()

'In same script added below cases\'s\r\nTC_Cases_4'
CustomKeywords.'reusableKeywords.Reusable.Selectcasestab'()

/*//Verify Right click should not be allowed in cases page
try
{
	boolean rightclickkstatus=WebUI.rightClickOffset(findTestObject('Object Repository/Cases_Module_objects/Viewtranscripts',5,5))
if(rightclickkstatus==false)
{
	KeywordUtil.markPassed('SUCCESS:Right click is not working on cases page')
	
}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Right click is  working on cases page:' + e.getMessage())
	
}*/
//Verify location is available in cases page
try {
    Location = WebUI.verifyElementVisible(findTestObject('Object Repository/Cases_Module_objects/Location_object'))

    if (Location == true) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see the location in cases page')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see the location in cases page:' + e.getMessage())
} 

//Call feedback in cases page
try {
    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Customer_feedback'))

    serviceheadertext = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Servicefeedbackheader'))

    if (serviceheadertext.equals('Service')) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see Customer feedabk popup')

        WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Customerfbpclose'))
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see Customer feedabk popup:' + e.getMessage())

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Customerfbpclose'))
} 

//Service feedback in cases page
try {
    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Agent_sidefeedabck'))

    Callheadertext = WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/calltabinagnetfb'))

    if (Callheadertext.equals('Call')) {
        KeywordUtil.markPassed('SUCCESS:Agent able to see Customer feedabk popup')

        WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Agentfeedabckpopclose'))
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:Agent unable to see Customer feedabk popup:' + e.getMessage())

    WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Agentfeedabckpopclose'))
} 

//CustomKeywords.'reusableKeywords.Reusable.Logout'()

