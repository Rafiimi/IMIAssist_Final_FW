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

Newppointmenttextvalue = 'New Appointment'

try {
	WebUI.openBrowser('')
	
    for (def rowNum=1; rowNum <=findTestData("Appointmentcreation_UI").getRowNumbers(); rowNum++) 
	{
      
				WebUI.navigateToUrl(findTestData("Appointmentcreation_UI").getValue(1, rowNum))


        WebUI.delay(4)
		WebUI.maximizeWindow()

        WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-email'), 
            findTestData("Appointmentcreation_UI").getValue(2, rowNum))

        WebUI.setText(findTestObject('Page_eClinic - Video Consultations/input_Please enter your details below_user-_90355e'), 
            findTestData("Appointmentcreation_UI").getValue(3, rowNum))

        WebUI.click(findTestObject('Page_eClinic - Video Consultations/button_LOGIN'))

        WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/i_insert_invitation'))

      //  WebUI.click(findTestObject('Object Repository/Page_eClinic - Video Consultations/span_Appointments'))

        WebUI.delay(3)

      String  Newappointmentlinktext = WebUI.getText(findTestObject('Object Repository/Page_eClinic - Video Consultations/Neappointment_link'))

        println(Newappointmentlinktext)
		
		WebUI.takeScreenshot('D:/IMIAssist- Automation/IMIAssist_Screenshots/Sprint_29_Screens/ATC_AP_1025_Check_whether_New_Appointment_link_is_displaying_in_Appointments_page.png')
		
        if (Newappointmentlinktext.equals(Newppointmenttextvalue))
		 {
            KeywordUtil.markPassed('SUCCESS:New appointment link is available to the selection for user')
			WebUI.takeScreenshot('Test Cases\\IMIAssist_Automation_Test_Snapshots\\Appointment_creation/TC_001_Appointmentlink_verification_with_different_user_rolls.png')
			WebUI.click(findTestObject('Page_eClinic - Video Consultations/a_Support_navProfileDropdown'))
			WebUI.click(findTestObject('Page_eClinic - Video Consultations/li_Logout'))
        } 
		else 
		{
            KeywordUtil.markFailed('ERROR:New appointment link is available to the selection for user')
        }
    }
    
	KeywordUtil.markPassed('SUCCESS:New appointment link is available to the selection for allusers')
	
	
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:New appointment link is available to the selection for user')
} 

