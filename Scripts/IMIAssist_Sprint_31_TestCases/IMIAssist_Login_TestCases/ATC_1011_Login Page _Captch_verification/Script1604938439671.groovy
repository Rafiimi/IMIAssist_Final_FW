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

try{
WebUI.openBrowser('')
WebUI.delay(3)
 WebUI.navigateToUrl(findTestData('TC_03_OtherdetailsChenge').getValue(1, 1))
 WebUI.delay(3)
 WebUI.maximizeWindow()
 
 
 WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'),
		findTestData('TC_03_OtherdetailsChenge').getValue(2, 1))
 WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'),
	 findTestData('TC_03_OtherdetailsChenge').getValue(9, 1))
// WebUI.clearText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'))

 //Validating login with invalid password for captch verification
 for (int i=0; i<4;i++) {
 WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
 }
 WebUI.delay(2)
 Capthelementstatus=WebUI.switchToFrame(findTestObject('Object Repository/LoginPage_TestCases_Objects/Cpathframeobject'), 5)
// Capthelementstatus=WebUI.verifyElementVisible(findTestObject('Object Repository/LoginPage_TestCases_Objects/CaptchObject'))
 if(Capthelementstatus==true)
 {
	KeywordUtil.markPassed('SUCCESS:Agent Able to saw the captch after trying to login morethen 4 times')
	
}
else
{
KeywordUtil.markFailed('ERROR:Agent not able to see the captch after trying to login morethen 4 times')

}
WebUI.delay(3)

println('user able to login the page')
}
catch(Exception e)
{
KeywordUtil.markFailed('ERROR:Agent unable to see the captch after trying to login morethen 4 times:'+e.getMessage())
}