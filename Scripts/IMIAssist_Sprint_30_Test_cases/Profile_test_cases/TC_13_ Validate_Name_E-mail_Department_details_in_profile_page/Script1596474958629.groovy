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
/*WebUI.openBrowser('')


WebUI.navigateToUrl(findTestData("TestDataForchangepassword").getValue(1,1))

WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TestDataForchangepassword").getValue(2,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataForchangepassword").getValue(3,1))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/button_LOGIN'))*/


WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/a_Testing_navProfileDropdown'))

WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/li_Profile'))
WebUI.delay(3)
ActualEmail=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Emailformprofile_object'))
WebUI.delay(3)
expectedemail=findTestData('IMiAsssist_dashbord').getValue(2, 1)

if(expectedemail.equals(ActualEmail))
{
KeywordUtil.markPassed('SUCCESS:Email id was matched with user login email')

}

else
{
	KeywordUtil.markFailed('ERROR:Email id was not matched with user login email')
	
}

WebUI.delay(2)
Specialityname=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Specilitynameatprofile_object'))
WebUI.delay(2)
Specilitynameatleftside=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Specialitynameatleftside'))

if(Specialityname.equalsIgnoreCase(Specilitynameatleftside))
{
KeywordUtil.markPassed('SUCCESS:Speciality name is matched with under profile section')

}

else
{
	KeywordUtil.markFailed('ERROR:Speciality name is not matched with under profile section')
	
}
WebUI.delay(2)

Companyname=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Compnayname_object'))
Expectcompanyname=findTestData("IMIAssist_sprint30_testdata").getValue(5,1)
WebUI.delay(2)
if(Companyname.equals(Expectcompanyname))
{
KeywordUtil.markPassed('SUCCESS:Company name is matched with expected company name')

}

else
{
	KeywordUtil.markFailed('ERROR:Company name is not matched with expected company name')
	
}
WebUI.delay(2)
Username=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Username_object'))
ExpectUsername=findTestData("IMIAssist_sprint30_testdata").getValue(6,1)
WebUI.delay(2)
if(Username.contains(ExpectUsername))
{
KeywordUtil.markPassed('SUCCESS:Username is matched with expected Username')

}

else
{
	KeywordUtil.markFailed('ERROR:Username is not matched with expected Username')
	
}
WebUI.delay(2)
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))
KeywordUtil.markPassed('SUCCESS:Profile data was matched with expected data')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Profile data was not matched with expected data:'+e.getMessage())
	
}
