import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

KeywordLogger logger = new KeywordLogger()

try {
    TCname = 'Checking user is logged out when Dept Role changed while logged in'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    LoginUrl = findTestData('Login_testdata').getValue('URL', 9)

    userId = findTestData('Login_testdata').getValue('Username', 9)

    Password = findTestData('Login_testdata').getValue('Password', 9)

    //Login another browser using driver object
    //Need to check and set the Chrome driver path relative
    System.setProperty('webdriver.chrome.driver', 'C:\\Users\\ravi.b\\Downloads\\Driver_Chrome_Katalon\\chromedriver_win32\\chromedriver.exe')

    WebDriver driver = new ChromeDriver()

    driver.get(LoginUrl)

    Thread.sleep(5000)

	//Need to change properties if changed
    driver.findElement(By.xpath('//input[@id="formEmail"]')).sendKeys(userId)

    driver.findElement(By.xpath('//input[@id="formPassword"]')).sendKeys(Password)

    driver.findElement(By.xpath('//button[contains(text(),"LOGIN")]')).click()

    Thread.sleep(5000)

    /*    WebUI.openBrowser('')
    WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', 9))
    WebUI.maximizeWindow()
    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
            'Username', 9))
    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
            'Password', 9))
    WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
    WebUI.delay(4)*/
	
    //Admin User -- need to check the flow
	//CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(8)
	WebUI.delay(2)
	
	//Back to department
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Back_arrow'))
    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('TeamObjectClass', 
            1), findTestData('User_RoleChange_Delete').getValue('Speciality', 4))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_DeptMember'), findTestData('User_RoleChange_Delete').getValue(
            'TeamMember', 3), FailureHandling.OPTIONAL)

    CustomKeywords.'reusableKeywords.Reusable.ClickDynamicObject'(findTestData('User_RoleChange_Delete').getValue('TeamMember', 
            4))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/edit_DeptMember'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Click_DeptRole'))

	NewRole = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 4)

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

    expectedMsg = 'Your role has been changed/deleted, in either case you will be logged out instantly. Please re-login to continue.'

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Admin is able to change the role of a user in the Dept')
    } else {
        KeywordUtil.markFailed(actualMsg)
    }
    
    //***Switch to previous browser
    WebElement ele = driver.findElement(By.xpath('//div[@id="roleChangedPopup"]/div/div/div[2]'))

    String actualMsg2 = ele.getText()

    expectedMsg2 = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 3)

    if (actualMsg2 == expectedMsg2) {
        KeywordUtil.markPassed('Role change popup is showing correctly to the user')
    } else {
        KeywordUtil.markFailed(actualMsg2)
    }
    
    driver.findElement(By.xpath('//button[@type = "button" and (text() = " RE-LOGIN " or . = " RE-LOGIN ")]')).click()

    Thread.sleep(5000)

    if (driver.findElements(By.xpath('//button[@id="login-button"]')).size() != 0) {
        KeywordUtil.markPassed('User is logged out successfully when Dept role changed')

        System.out.println('User is logged out successfully when Dept role changed')
    } else {
        KeywordUtil.markFailed('User is NOT logged out successfully when Dept role changed')

        System.out.println('User is NOT logged out successfully when Dept role changed')
    }
    
    driver.close()
	

 /*    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_RE-LOGIN'))
    WebUI.delay(1)
    WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'), 2, FailureHandling.OPTIONAL)*/

}catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

