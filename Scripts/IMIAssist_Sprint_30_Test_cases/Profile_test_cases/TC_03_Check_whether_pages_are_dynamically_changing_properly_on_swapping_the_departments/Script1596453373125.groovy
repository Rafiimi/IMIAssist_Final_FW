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

try
{
 WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('IMiAsssist_dashbord').getValue(1, 1))

    WebUI.delay(3)
	WebUI.maximizeWindow()
	

    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(2, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(3, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))
	WebUI.delay(3)
WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Specialty_option_object'))


WebUI.delay(3)
changedspecialityname=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Speciality_change_object'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Speciality_change_object'))
WebUI.delay(3)

expectedchangedspeciality=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Speciality_on_dashbord'))
WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Profile_Page\\TC_03_Check_whether_pages_are_dynamically_changing_properly_on_swapping_the_departments.png')


if(expectedchangedspeciality.contains(changedspecialityname))
{
	KeywordUtil.markPassed('SUCCESS:User successfully changed the departoment')
	
}

else
{
	KeywordUtil.markFailed('ERROR:user unable to change the department')
	
}
WebUI.delay(3)
/*WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))

WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))*/

KeywordUtil.markPassed('SUCCESS:User successfully changed the departoment')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:user unable to change the department:'+e.getMessage())
	
}
