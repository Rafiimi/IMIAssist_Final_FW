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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil


try
{
CustomKeywords.'reusableKeywords.Reusable.Login'()

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Profiledropdown'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Speciality_Object'))
WebUI.delay(5)

departmentsscount=WebUI.getNumberOfTotalOption(findTestObject('Object Repository/AppointmentCreationpopup/Teamslist_object'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Settings_icon_object'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/SettingsTab_object'))
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Teams_Tab_Object'))
WebUI.delay(3)
departmentscountfromdepartment=WebUI.getNumberOfTotalOption(findTestObject('Object Repository/AppointmentCreationpopup/Teams_count_Objects'))


if(departmentsscount.equals(departmentscountfromdepartment))
{
KeywordUtil.markPassed('SUCCESS:Teams count is matched with under teams tab')

}

else
{
	KeywordUtil.markFailed('ERROR:Teams count is not matched with under teams tab')
	
}

WebUI.delay(2)
CustomKeywords.'reusableKeywords.Reusable.Logout'()
KeywordUtil.markPassed('SUCCESS:Teams count is matched with under teams tab')


}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Teams count is not matched with under teams tab:'+e.getMessage())
	
}
