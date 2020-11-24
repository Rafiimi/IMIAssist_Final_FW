package reusableKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger



import internal.GlobalVariable

public class Reusable {
	//Login Reussable method
	@Keyword
	def Login(){
		try{
			String loginURL=GlobalVariable.Url
			String loginUserName=GlobalVariable.Username
			String loginPassword=GlobalVariable.Password

			WebUI.openBrowser('')

			WebUI.navigateToUrl(loginURL)

			WebUI.maximizeWindow()

			WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), loginUserName)

			WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), loginPassword)

			WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
			WebUI.delay(5)
		}
		/*		try {
		 boolean AlreadyLoggedIn = WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/button_Login_PROCEED'), 2, FailureHandling.OPTIONAL)
		 if (AlreadyLoggedIn==true) {
		 WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_Login_PROCEED'))
		 }
		 }
		 catch (Exception e) {
		 KeywordUtil.markFailed('MESSAGE: Proceed button not displayed')
		 }
		 WebUI.delay(5)
		 } catch (Exception e) {
		 WebUI.delay(5)
		 } */
		catch (Exception e) {

			KeywordUtil.markFailed("Unable to login")
		}
	}

	@Keyword
	def LoginDiffUser(int rowNum){
		try{
			WebUI.openBrowser('')
			WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', rowNum))
			WebUI.maximizeWindow()
			WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
					'Username', rowNum))
			WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
					'Password', rowNum))
			WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
			WebUI.delay(5)
		}
		catch (Exception e) {

			KeywordUtil.markFailed("Unable to login")
		}
	}


	@Keyword
	def ClickDynamicObject(String dynamicName) {
		try{
			int servCode
			String xpath1=('//*[contains(text(),"'+dynamicName+'")]//preceding::td[2]/div/label')
			TestObject to = new TestObject('objectName')
			to.addProperty('xpath', ConditionType.EQUALS, xpath1)
			WebUI.click(to)
		} catch (Exception e) {
			KeywordUtil.markFailed("Unable to click element: " +e.getMessage())
		}
	}

	@Keyword
	def ClickToggleObject(String dynamicName) {
		try{
			int servCode
			String xpath1=('//*[contains(text(),"'+dynamicName+'")]//preceding::div[1]/label')
			TestObject to = new TestObject('objectName')
			to.addProperty('xpath', ConditionType.EQUALS, xpath1)
			WebUI.click(to)
		} catch (Exception e) {
			KeywordUtil.markFailed("Unable to click element: " +e.getMessage())
		}
	}


	@Keyword
	//Mostly used for speciality selection dropdown values
	def ClickDynamicTextObj(String dynamicText) {
		try{
			String xpath1=('//*[@class="option ui-select-choices-row-inner" and contains(text(),"'+dynamicText+'")]')
			TestObject to = new TestObject('objectName')
			to.addProperty('xpath', ConditionType.EQUALS, xpath1)
			WebUI.click(to)
		} catch (Exception e) {
			KeywordUtil.markFailed("Unable to click element: " +e.getMessage())
		}
	}

	@Keyword
	//Mostly used for dynamic class and dynamic list value in a dropdown list
	def SelectDynamicValue(String objClass, String dynamicText) {
		try{
			String xpath1=('//*[@class="'+objClass+'" and contains(text(),"'+dynamicText+'")]')
			TestObject to = new TestObject('objectName')
			to.addProperty('xpath', ConditionType.EQUALS, xpath1)
			WebUI.click(to)
		} catch (Exception e) {
			KeywordUtil.markFailed("Unable to click element: " +e.getMessage())
		}
	}

	@Keyword
	//used for clicking a team based on search text
	def SelectDynamicText(String dynamicText) {
		try{
			String xpath1=('//*[contains(text(),"'+dynamicText+'")]')
			TestObject to = new TestObject('objectName')
			to.addProperty('xpath', ConditionType.EQUALS, xpath1)
			WebUI.click(to)
		} catch (Exception e) {
			KeywordUtil.markFailed("Unable to click element: " +e.getMessage())
		}
	}
	@Keyword
	//used for clicking a team based on search text
	def SelectDynamicTextobject(String dynamicText) {
		try{
			String xpath1=('//*[contains(text(),"'+dynamicText+'")]')
			TestObject to = new TestObject('objectName')
			to.addProperty('xpath', ConditionType.EQUALS, xpath1)
			WebUI.click(to)
		} catch (Exception e) {
			KeywordUtil.markFailed("Unable to click element: " +e.getMessage())
		}
	}
	@Keyword
	def UserNavigation_Dept() {
		try {
			WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))

			WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Settings'))

			WebUI.delay(2)

			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Settings_Dept'))

			WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/AStab_CompanyDetails'))

		}
		catch (Exception e) {
			KeywordUtil.markFailed('ERROR: ' + e.getMessage())
		}
	}

	@Keyword
	def UserNavigation_Team() {
		try {
			WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))

			WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Settings'))

			WebUI.delay(2)

			WebUI.click(findTestObject('Admin_Settings/Team/TeamCreation/Settings_Team'))
			WebUI.mouseOver(findTestObject('Admin_Settings/Team/TeamCreation/teamsWindow_empty'))

		}
		catch (Exception e) {
			KeywordUtil.markFailed('ERROR: ' + e.getMessage())
		}
	}


	//Logout Reusable Method
	@Keyword
	def Logout()
	{

		try
		{
			WebUI.delay(5)

			WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

			WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
			WebUI.delay(3)
			WebUI.closeBrowser()
		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable to logouted the application:'+e.getMessage())

		}
	}

	//Cases Tab Selection reusable method
	@Keyword
	def Selectcasestab()
	{
		try
		{
			//			WebUI.delay(3)
			WebUI.mouseOver(findTestObject('Cases_Module_objects/Reports_Tab_icon'))
			WebUI.click(findTestObject('Cases_Module_objects/Reports_Tab_icon'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Cases_Module_objects/ReportsTab'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Cases_subTab_icon'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Cases_Module_objects/CasesDropdown'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Appointmentidoption'))
			//			WebUI.selectOptionByValue(findTestObject('Object Repository/Cases_Module_objects/CasesDropdown'), 'Appointment ID', false)
			WebUI.delay(3)
			WebUI.setText(findTestObject('Object Repository/Cases_Module_objects/Searchtextfieldincases'), findTestData('IMIA_cases_testData').getValue(1, 1))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Cases_Module_objects/Caseselectiononfirstrow'))
		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable to search case id from cases:'+e.getMessage())

		}

	}
	@Keyword
	def Naviagateappointmentpage()
	{
		try
		{
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Workspace_Objects/Appointmenticon_on_DB'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Workspace_Objects/Appointmentpan_on_DB'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Workspace_Objects/app_page_refresh'))
		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable naviagte to appointment page:'+e.getMessage())

		}

	}



	//Cases Tab Selection reusable method
	@Keyword
	def Selectcustom_reports()
	{
		try
		{
			WebUI.delay(3)
			WebUI.click(findTestObject('Cases_Module_objects/Reports_Tab_icon'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/Cases_Module_objects/ReportsTab'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/CustomReporttab'))
			WebUI.delay(3)
			WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Create_custom_r'))

		}
		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable to select custom reports tab under reports tab:'+e.getMessage())

		}

	}
	//Navigate department page and select the start an appointment link
	@Keyword
	def navigatetodepartmentpagetoselectsap()
	{
		try
		{
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Apointmenttabicon'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmenttab'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Startnewappointmentdropdown'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Startanappointment'))

		}

		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable to select start an appointment:'+e.getMessage())

		}


	}
	//Navigate department page and select the start an appointment link
	@Keyword
	def navigatetodepartmentpagetoselectscheduleap()
	{
		try
		{
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Apointmenttabicon'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Appointmenttab'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Startnewappointmentdropdown'))
			WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Scheduleanappointment'))

		}

		catch(Exception e)
		{
			KeywordUtil.markFailed('ERROR:Agent unable to select schedule an appointment:'+e.getMessage())

		}


	}
}
