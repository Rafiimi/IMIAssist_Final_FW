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
try{
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_settings'))
WebUI.delay(3)
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Department'))

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Brandlogondashbord'))
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Department_testing_object'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Appointment Management'))
try
{
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Create a Tag'))

//WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_close_tagNameInput'))
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Create a TagcloseCharacter limit  50CAN_685ed1'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Tagnamcreationpopup'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/input_close_tagNameInput'), findTestData("Allthetabsatagentside").getValue(4, 1))
WebUI.delay(2)
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_CREATE'))
KeywordUtil.markPassed('SUCCESS: Agent able to click create button')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to click on create button:'+e.getMessage())
	
	WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Tagnamecreatepopupclosebutton'))
}
/*WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Notification'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/label_SMS'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_SAVE_1'))*/

KeywordUtil.markPassed('SUCCESS: Agent able to create tagname under appointment managemenet tab')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: Agent Unable to create tagname:'+e.getMessage())
	
}
WebUI.delay(2)
CustomKeywords.'reusableKeywords.Reusable.Logout'()
WebUI.closeBrowser()
KeywordUtil.markPassed('SUCCESS: Agent able to create tagname and logouted successfully')

}


catch(Exception e)
{
KeywordUtil.markFailed('ERROR:Agent Unable to create tagname and logouted successfully')
	
}
