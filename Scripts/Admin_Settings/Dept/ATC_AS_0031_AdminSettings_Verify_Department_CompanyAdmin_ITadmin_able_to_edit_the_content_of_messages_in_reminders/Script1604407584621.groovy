import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

KeywordLogger logger = new KeywordLogger()

try {
       String UserRole1 = findTestData('Login_testdata').getValue('Role', 3)

        TCname1 = (('Verify ' + UserRole1) + ' is able to edit the content of messages in reminders')

        logger.logInfo('***START Of TEST CASE: ' + TCname1)

        CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(3)
        WebUI.delay(2)

        CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

		String	Dept1 = findTestData('User_RoleChange_Delete').getValue('Speciality', 5)
		String xpath1 = ('//*[@class="department ng-binding" and contains(text(),"'+Dept1+'")]')
		TestObject to1 = new TestObject('objectName')
		to1.addProperty('xpath', ConditionType.EQUALS, xpath1)
		WebUI.click(to1)
		
		WebUI.delay(1)

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_Notification'))

        boolean linkStat = WebUI.verifyElementVisible(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

        if (linkStat == false) {
            WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
        }
        
        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

        WebUI.delay(1)

        String remText = WebUI.executeJavaScript(actValList, null)

        String modText = remText.replace('$Appointment_ID', '$Case_ID')

        WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText, FailureHandling.OPTIONAL)
   
        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))

        String actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

        String expectedMsg = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 5)

        if (actualMsg == expectedMsg) {
            KeywordUtil.markPassed(expectedMsg)
        } else {
            KeywordUtil.markFailed(actualMsg)
        }
		
		//Setting back
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))
		WebUI.delay(1)
		String newText = WebUI.executeJavaScript(actValList, null)
		
		if (newText.contains('$Case_ID')==true)
		{
			KeywordUtil.markPassed(('Verify ' + UserRole1) + ' is able to edit the content of messages in reminders successfully')
			String modText2 = newText.replace('$Case_ID','$Appointment_ID')
	
			WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText2, FailureHandling.OPTIONAL)
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))
		} else {
			KeywordUtil.markFailed(('Verify ' + UserRole1) + ' is NOT able to edit the content of messages in reminders successfully')
		}
		
        //switch back
		if (linkStat == false) {
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
		}
		
        CustomKeywords.'reusableKeywords.Reusable.Logout'()

        logger.logInfo('***END Of TEST CASE: ' + TCname1)
    }

catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}

//2
try {
		String UserRole2 = findTestData('Login_testdata').getValue('Role', 4)

		TCname2 = (('Verify ' + UserRole2) + ' is able to edit the content of messages in reminders')

		logger.logInfo('***START Of TEST CASE: ' + TCname2)

		CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(4)

		WebUI.delay(2)

		CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

	 //Dept selection
	 //	String Dept
		String	Dept2 = findTestData('User_RoleChange_Delete').getValue('Speciality', 6)
		String xpath2 = ('//*[@class="department ng-binding" and contains(text(),"'+Dept2+'")]')
		TestObject to2 = new TestObject('objectName')
		to2.addProperty('xpath', ConditionType.EQUALS, xpath2)
		WebUI.click(to2)
		WebUI.delay(1)

		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_Notification'))

		boolean linkStat = WebUI.verifyElementVisible(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

		if (linkStat == false) {
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
		}
		
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

		WebUI.delay(1)

		String remText = WebUI.executeJavaScript(actValList, null)

		String modText = remText.replace('$Appointment_ID', '$Case_ID')

		WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText, FailureHandling.OPTIONAL)
   
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))

		String actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

		String expectedMsg = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 5)

		if (actualMsg == expectedMsg) {
			KeywordUtil.markPassed(expectedMsg)
		} else {
			KeywordUtil.markFailed(actualMsg)
		}
		
		//Setting back
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))
		WebUI.delay(1)
		String newText = WebUI.executeJavaScript(actValList, null)
		
		if (newText.contains('$Case_ID')==true)
		{
			KeywordUtil.markPassed(('Verify ' + UserRole2) + ' is able to edit the content of messages in reminders successfully')
			String modText2 = newText.replace('$Case_ID','$Appointment_ID')
	
			WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText2, FailureHandling.OPTIONAL)
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))
		} else {
			KeywordUtil.markFailed(('Verify ' + UserRole2) + ' is NOT able to edit the content of messages in reminders successfully')
		}
		
		//switch back
		if (linkStat == false) {
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
		}
		
		CustomKeywords.'reusableKeywords.Reusable.Logout'()

		logger.logInfo('***END Of TEST CASE: ' + TCname2)
	}

catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}

//3
try {
		String UserRole3 = findTestData('Login_testdata').getValue('Role', 8)

		TCname3 = (('Verify ' + UserRole3) + ' is able to edit the content of messages in reminders')

		logger.logInfo('***START Of TEST CASE: ' + TCname3)

		CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(8)

		WebUI.delay(2)

		CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

	 //Dept selection
	 //	String Dept
		String	Dept3 = findTestData('User_RoleChange_Delete').getValue('Speciality', 7)
		 String xpath3 = ('//*[@class="department ng-binding" and contains(text(),"'+Dept3+'")]')
		 TestObject to3 = new TestObject('objectName')
		 to3.addProperty('xpath', ConditionType.EQUALS, xpath3)
		 WebUI.click(to3)
		WebUI.delay(1)

		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_Notification'))

		boolean linkStat = WebUI.verifyElementVisible(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

		if (linkStat == false) {
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
		}
		
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

		WebUI.delay(1)

		String remText = WebUI.executeJavaScript(actValList, null)

		String modText = remText.replace('$Appointment_ID', '$Case_ID')

		WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText, FailureHandling.OPTIONAL)
   
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))

		String actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

		String expectedMsg = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 5)

		if (actualMsg == expectedMsg) {
			KeywordUtil.markPassed(expectedMsg)
		} else {
			KeywordUtil.markFailed(actualMsg)
		}
		
		//Setting back
		WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))
		WebUI.delay(1)
		String newText = WebUI.executeJavaScript(actValList, null)
		
		if (newText.contains('$Case_ID')==true)
		{
			KeywordUtil.markPassed(('Verify ' + UserRole3) + ' is able to edit the content of messages in reminders successfully')
			String modText2 = newText.replace('$Case_ID','$Appointment_ID')
	
			WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText2, FailureHandling.OPTIONAL)
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))
		} else {
			KeywordUtil.markFailed(('Verify ' + UserRole3) + ' is NOT able to edit the content of messages in reminders successfully')
		}
		
		//switch back
		if (linkStat == false) {
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
		}
		
		CustomKeywords.'reusableKeywords.Reusable.Logout'()

		logger.logInfo('***END Of TEST CASE: ' + TCname3)
	}

catch (Exception e) {
	KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}