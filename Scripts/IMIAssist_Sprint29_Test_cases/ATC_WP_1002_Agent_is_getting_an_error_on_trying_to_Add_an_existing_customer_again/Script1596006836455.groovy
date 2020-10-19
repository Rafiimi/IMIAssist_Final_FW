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

Customeraddedconfirmationtext = 'already exists. Please try with other details'
try
{
//CustomKeywords.'reusableKeywords.Reusable.Login'()


WebUI.delay(3)
try
{
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/span_Appointments'))

WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/div_Start New Appointment'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_New Appointment   close          Start _142398'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/label_Start An Appointment   Start an appoi_1ec487'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_Next'))
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Select Team'),2)
WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Select Team'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Rafi'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_'))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_customerFirstName'),  findTestData('IMiAsssist_dashbord').getValue(6, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_customerLastName'),  findTestData('IMiAsssist_dashbord').getValue(7, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_close_clientId'),  findTestData('IMiAsssist_dashbord').getValue(8, 1))
//WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_close_iti__selected-flag'))
//
//WebUI.click(findTestObject('Page_eClinic - Video Consultations/span_India ()'))
//WebUI.waitForElementClickable(findTestObject('Object Repository/workspace_page_object/countryflag_drop_down_objects'), 2)
//WebUI.click(findTestObject('Object Repository/workspace_page_object/countryflag_drop_down_objects'))
//WebUI.delay(2)
//WebUI.waitForElementClickable(findTestObject('Object Repository/workspace_page_object/indiaflagobject'),2)
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/workspace_page_object/indiaflagobject'))
WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_customerPhone'),  findTestData('IMiAsssist_dashbord').getValue(9, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_customerEmail'),  findTestData('IMiAsssist_dashbord').getValue(10, 1))

WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_customerLocation'),
	 findTestData('IMiAsssist_dashbord').getValue(11, 1))

//WebUI.setText(findTestObject('Object Repository/Page_eClinic - Video Consultations/input_land Islands_form-control ng-pristine_a7addd'),
//	 findTestData('IMiAsssist_dashbord').getValue(12, 1))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_ADD'))
}
catch(Exception e)

{
	KeywordUtil.markFailed('ERROR:Agent unable fill the customer details:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/addcustomerpopupclose'))
	
}
try{
	WebUI.delay(3)
customeraddedconfirmation=WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/Custmerexistconfirmatextmessage'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Work_Space/ATC_WP_1002_Agent_is_getting_an_error_on_trying_to_Add_an_existing_customer_again.png')

if(customeraddedconfirmation.contains(Customeraddedconfirmationtext))
{
	KeywordUtil.markPassed('SUCCESS:Agent able to added successfully')
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_close'))
	
}
else
{
	KeywordUtil.markFailed('ERROR:Customer is exsited with these details')
	
}
}
catch(Exception e)

{
	KeywordUtil.markFailed('ERROR:Confimration message is not matching:'+e.getMessage())
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/addcustomerpopupclose'))
	
}
WebUI.delay(3)
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))*/
KeywordUtil.markPassed('SUCCESS:Agent able to added successfully')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Customer is exsited with these details:'+e.getMessage())
	
}
