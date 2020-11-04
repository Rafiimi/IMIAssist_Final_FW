import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


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

        String xpath = ('//*[@class="department ng-binding" and contains(text(),' + Dept) + ')]'

        TestObject to = new TestObject('objectName')

        to.addProperty('xpath', ConditionType.EQUALS, xpath)

        WebUI.click(to)

        WebUI.delay(1)

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_Notification'))

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_ViewContent'))

        WebUI.delay(1)

        WebElement actValList = document.getElementById('adminNotificationAgentReminderModal').value

        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Reminder_Content_SAVE'))

        actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

        expectedMsg = findTestData('Login_testdata').getValue('User_RoleChange_Delete', 5)

        if (actualMsg == expectedMsg) {
            KeywordUtil.markPassed(('Verify ' + UserRole) + ' is able to edit the content of messages in reminders successfully')
        } else {
            KeywordUtil.markFailed(actualMsg)
        }
        
        CustomKeywords.'reusableKeywords.Reusable.Logout'()

        logger.logInfo('***END Of TEST CASE: ' + TCname)
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

