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

import com.kms.katalon.core.util.KeywordUtil
CustomKeywords.'reusableKeywords.Reusable.Login'()

try{

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Profiledropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Profile'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_create'))
WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_mobinput'), findTestData('Login_testdata').getValue(11,1))
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Savbuttonobject'))
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_SAVE'))

WebUI.delay(2)
Invalidpasswordexptext=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Invalidpassworderror'));
Expectinvaliderrormessage=findTestData('IMIAssist_sprint30_testdata').getValue(3,1)
if(Expectinvaliderrormessage.contains(Invalidpasswordexptext))
{
	KeywordUtil.markPassed('SUCCESS:User able to see the error message with invalid number')
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/CancelButtonobject'))
	
}

else
{
	KeywordUtil.markFailed('ERROR: Unable to see the error message with invalid number')
	
}
//CustomKeywords.'reusableKeywords.Reusable.Logout'()
KeywordUtil.markPassed('SUCCESS:User able to see the error message with invalid number')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Unable to see the error message with invalid number')
	
}

