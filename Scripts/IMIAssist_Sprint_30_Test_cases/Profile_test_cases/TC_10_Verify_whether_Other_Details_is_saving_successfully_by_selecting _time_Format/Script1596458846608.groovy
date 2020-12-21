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
CustomKeywords.'reusableKeywords.Reusable.Login'()

try{

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Profiledropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Edit_button_object'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/TImeformate'))
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/timeformatevalue'))
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_SAVE'))
WebUI.delay(5)
profileconfirmationtext=WebUI.getText(findTestObject('Object Repository/LoginPage_TestCases_Objects/Profilesaveconfirmation'))
WebUI.delay(2)
Expectedprofileconfirmationtext=findTestData('Login_testdata').getValue(7, 1)
if(profileconfirmationtext.equals(Expectedprofileconfirmationtext))
{
	KeywordUtil.markPassed('SUCCESS:Agent is update his profile with time formate')
	
}
else
{
	KeywordUtil.markFailed('ERROR:Agent is not able to updated profile with time formate')
	
}


KeywordUtil.markPassed('SUCCESS:Agent updated profile details with time formate')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent is not updated profile with time formate')
	
}


