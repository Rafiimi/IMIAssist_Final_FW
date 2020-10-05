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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

viewasdropdownexplabeltext = 'View As'

try {
/*  try
{*/
	
WebUI.openBrowser('')


WebUI.navigateToUrl(findTestData("TestDataforLogin").getValue(1, 1))
WebUI.maximizeWindow()
WebUI.delay(4)
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), findTestData("TestDataforLogin").getValue(2,1))

//WebUI.setEncryptedText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), findTestData("TestDataforLogin").getValue(3,1))
WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/button_LOGIN'))
/*WebUI.delay(3)
Activelogin=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Active_login_text_objects'), 5)
//Activelogin=WebUI.verifyElementVisible('Object Repository/AppointmentCreationpopup/Active_login_text_objects')

if(Activelogin==true)
{
	WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/ProceedButtononactivelogin'))
	KeywordUtil.markPassed('SUCCESS:All options are avilable in view as drop down field')
	
}

else if(Activelogin==false)
{
	KeywordUtil.markPassed('SUCCESS:There is not active login')
	
}
else
{
	KeywordUtil.markFailed('ERROR:User unable to login')
	
}

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:User unable to login:'+e.getMessage())
	
}*/
    WebUI.delay(2)

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/div_Select Role  Specialty Admin'))

	/*try
	{
		
	WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Select Role  Specialty Admin'))
//    WebUI.verifyOptionsPresent(findTestObject('Object Repository/Page_eClinic - Video Consultations/div_Select Role  Specialty Admin'), 
//        [' Specialty Admin ', ' Team View ', ' User '])
	KeywordUtil.markPassed('SUCCESS:All options are avilable in View_as drop down field')
	
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:All options are avilable in View_as drop down field')
	
}*/
    WebUI.delay(5)

    //	viewasoptioncount=WebUI.getNumberOfTotalOption(findTestObject('Page_eClinic - Video Consultations/div_Select Role  Specialty Admin'))
    //	println('View as drop down options :'+viewasoptioncount)
    //    WebUI.verifyOptionsPresent(findTestObject('Page_eClinic - Video Consultations/div_Select Role  Specialty Admin'), [' Specialty Admin '
    //            , ' Team View ', ' User '])
    KeywordUtil.markPassed('SUCCESS:All options are avilable in view as drop down field')

    WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Dashboard/TC_1029_Check_the_functionality_of_Viewas_Dropdown.png')
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:All options are avilable in view as drop down field')
} 

WebUI.delay(5)

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))

/*Thread.sleep(5000)

try {
    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
        findTestData('IMiAsssist_dashbord').getValue(4, 1))

    WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
        findTestData('IMiAsssist_dashbord').getValue(5, 1))

    WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

    Viewasdropdownlabletext = WebUI.getText(findTestObject('Page_eClinic - Video Consultations/Viewasdropdownverificationobject'))

    WebUI.verifyNotEqual(Viewasdropdownlabletext, viewasdropdownexplabeltext)

    KeywordUtil.markPassed('SUCCESS:View as drop down is not available')

    WebUI.takeScreenshot('D:/IMIAssist- Automation/IMIAssist_Screenshots/Sprint_29_Screens/ATC_DP_1011_Check_the_functionality_of_Viewas_Dropdown.png')
	WebUI.delay(3)
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))
	
	WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
	}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:View as drop down is not available')
} */

