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
    String listSource = '3,4,8' //Different logins from login test data

    String[] list = listSource.split(',')

    int LoginCount = list.size()

    for (int j = 0; j <= (LoginCount - 1); j++) {
        int logRow = Integer.parseInt(list[j])

        String UserRole = findTestData('Login_testdata').getValue('Role', logRow)

        TCname = (('Verify ' + UserRole) + ' is able to edit the content of messages in reminders')

        logger.logInfo('***START Of TEST CASE: ' + TCname)

        CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(logRow)

        WebUI.delay(2)

        CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

        //Dept selection
        String Dept = findTestData('User_RoleChange_Delete').getValue('Speciality', 5)

        String xpath = ((('//*[@class="department ng-binding" and contains(text(),' + '\' ') + Dept) + ' \'') + ')]'

        TestObject to = new TestObject('objectName')

        to.addProperty('xpath', ConditionType.EQUALS, xpath)

        WebUI.click(to)

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
			KeywordUtil.markPassed(('Verify ' + UserRole) + ' is able to edit the content of messages in reminders successfully')
			String modText2 = newText.replace('$Case_ID','$Appointment_ID')
	
			WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/textarea_CreateCustomisedContent'), modText2, FailureHandling.OPTIONAL)
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))
		} else {
			KeywordUtil.markFailed(('Verify ' + UserRole) + ' is NOT able to edit the content of messages in reminders successfully')
		}
		
        //switch back
		if (linkStat == false) {
			WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppointmentReminder_Switch'))
		}
        CustomKeywords.'reusableKeywords.Reusable.Logout'()

        logger.logInfo('***END Of TEST CASE: ' + TCname)
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
}