import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

/*WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', 8))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
        'Username', 8))

WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
        'Password', 8))

WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))

WebUI.delay(4)*/
CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(8)

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

try {
    TCname1 = 'Verify admin is able to see all details for all specialties under the company'

    logger.logInfo('***START Of TEST CASE: ' + TCname1)

    String expTabValues = 'Specialty,Number of Users,Number of Teams,Created On'

    String[] parseList2 = expTabValues.split(',')

    for (int i = 1; i <= 4; i++) {
        j = (i - 1)

        String xpath = ('//*[@id="users-tab"]/div/table/thead/tr/th[' + i) + ']'

        TestObject to = new TestObject('objectName')

        to.addProperty('xpath', ConditionType.EQUALS, xpath)

        if (WebUI.getText(to) == (parseList2[j])) {
            KeywordUtil.markPassed('Admin is able to see the Specialty details')
        } else {
            KeywordUtil.markFailed('admin is NOT able to see the Specialty details')
        }
    }
    
    String xpath3 = '//*[@class="department ng-binding"][1]'

    TestObject to3 = new TestObject('objectName')

    to3.addProperty('xpath', ConditionType.EQUALS, xpath3)

    if (WebUI.getText(to3) != '') {
        KeywordUtil.markPassed('Admin is able to see all details for all specialties successfully')
    } else {
        KeywordUtil.markFailed('admin is NOT able to see all details for all specialties correctly')
    }
    
    for (int k = 1; k <= 3; k++) {
        String xpath4 = ('//*[@class="members ng-binding"][' + k) + ']'

        TestObject to4 = new TestObject('objectName')

        to4.addProperty('xpath', ConditionType.EQUALS, xpath4)

        if (WebUI.getText(to4) != '') {
            KeywordUtil.markPassed('Admin is able to see all details for all specialties successfully')
        } else {
            KeywordUtil.markFailed('admin is NOT able to see all details for all specialties correctly')
        }
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

TCname2 = 'Verify Admin is able to edit all details for all specialties under the company'

logger.logInfo('***START Of TEST CASE: ' + TCname2)

try {
    WebUI.delay(2)

    String xpath4 = '//td[@class = "department ng-binding" and (text() = " Test Department " or . = " Test Department ")]'

    TestObject to4 = new TestObject('objectName')

    to4.addProperty('xpath', ConditionType.EQUALS, xpath4)

    WebUI.click(to4)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/SelectUser_AS'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/edit_DeptMember'))

    NewRole = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/Click_DeptRole'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Click_DeptRole'))

    String exiRole = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/edit_DeptMember'))

    if (exiRole == NewRole) {
        CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('RoleObjectClass', 
                4), findTestData('User_RoleChange_Delete').getValue('ExistingRole', 4))
    } else {
        CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('RoleObjectClass', 
                4), findTestData('User_RoleChange_Delete').getValue('NewRole', 4))
    }
    
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_SAVE'))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = 'Users role has been successfully updated!'

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Admin is able to edit all details for all specialties under the company')
    } else {
        KeywordUtil.markFailed('Admin is NOT able to edit all details for all specialties under the company')
    }
	
	CustomKeywords.'reusableKeywords.Reusable.Logout'()
	
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

