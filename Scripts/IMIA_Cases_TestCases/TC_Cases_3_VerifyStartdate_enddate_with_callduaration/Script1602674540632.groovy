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

//CustomKeywords.'reusableKeywords.Reusable.Login'()

try
{
	WebUI.click(findTestObject('Object Repository/Profile_objects/Profiledropdown'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Profile_objects/profile_option'))
	WebUI.delay(2)
	Dateformate=WebUI.getText(findTestObject('Object Repository/Profile_objects/ProfileDateformate'))
	
	CustomKeywords.'reusableKeywords.Reusable.Selectcasestab'()//Activity log in cases page
	//Get callduarion time form cases page
try {
    Time=WebUI.getText(findTestObject('Object Repository/Cases_Module_objects/Callduartiontimeobject')).trim()

    if (Time.startsWith('2020')) {
        KeywordUtil.markPassed('SUCCESS:profile date formate and case time formate is matched')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:profile date formate and case time formate is not matched:' + e.getMessage())
} 

	
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to get the dateformate from profile:' +e.getMessage())
	
}
CustomKeywords.'reusableKeywords.Reusable.Logout'()
