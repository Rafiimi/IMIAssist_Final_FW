package reusableKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.util.KeywordUtil


import internal.GlobalVariable

public class Reusable {
//Login Resusable method
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

			WebUI.delay(8)
		} 
		catch (Exception e) {
			KeywordUtil.markFailed("Unable to login")
		}
	}
	//Logout Resusable Method
	@Keyword
	def Logout()
	{
		
			try
			 {
			 WebUI.delay(5)
			 
			 WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))
			 
			 WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
			 }
			 catch(Exception e)
			 {
				 KeywordUtil.markFailed('ERROR:Agent unable to logouted the application:'+e.getMessage())
				 
			 }
	}
}
