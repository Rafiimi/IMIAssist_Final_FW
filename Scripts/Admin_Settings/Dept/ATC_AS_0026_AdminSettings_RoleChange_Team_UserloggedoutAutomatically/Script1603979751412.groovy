import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

KeywordLogger logger = new KeywordLogger()

try {
    TCname = 'Checking user is logged out when Team Role changed while logged in'

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
	
	driver.findElement(By.xpath('//input[@id="user-email"]')).sendKeys(userId);
	driver.findElement(By.xpath('//input[@id="user-password"]')).sendKeys(Password);
	driver.findElement(By.xpath('//button[@id="login-button"]')).click();
	Thread.sleep(5000);
	
/*    WebUI.openBrowser('')
    WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', 9))
    WebUI.maximizeWindow()
    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
            'Username', 9))
    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
            'Password', 9))
    WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))
    WebUI.delay(4)*/

    //Admin User
    
	/*WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Login_testdata').getValue('URL', 8))

    WebUI.maximizeWindow()

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/User_Email'), findTestData('Login_testdata').getValue(
            'Username', 8))

    WebUI.setText(findTestObject('Object Repository/LoginPage_TestCases_Objects/PasswordTextfiled'), findTestData('Login_testdata').getValue(
            'Password', 8))

    WebUI.click(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'))

    WebUI.delay(4)
*/
    CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

    WebUI.delay(2)

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('TeamObjectClass', 
            1), findTestData('User_RoleChange_Delete').getValue('Speciality', 3))

    CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('TeamObjectClass', 
            1), findTestData('User_RoleChange_Delete').getValue('TeamName', 3))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Search_TeamMember'), findTestData('User_RoleChange_Delete').getValue(
            'TeamMember', 3), FailureHandling.OPTIONAL)

    CustomKeywords.'reusableKeywords.Reusable.ClickDynamicObject'(findTestData('User_RoleChange_Delete').getValue('TeamMember', 
            3))

    NewRole = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 3)

    String exiRole = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/Edit_TeamMember'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Edit_TeamMember'))

    WebUI.delay(1)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/SelectRole_TeamMember'))

    if (exiRole == NewRole) {
        CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('RoleObjectClass', 
                3), findTestData('User_RoleChange_Delete').getValue('ExistingRole', 3))
    } else {
        CustomKeywords.'reusableKeywords.Reusable.SelectDynamicValue'(findTestData('User_RoleChange_Delete').getValue('RoleObjectClass', 
                3), findTestData('User_RoleChange_Delete').getValue('NewRole', 3))
    }
    
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Role_SAVE'))

    WebUI.delay(1)

    actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    expectedMsg = ('Your role has been changed/deleted, in either case you will be logged out instantly. Please re-login to continue.')

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Admin is able to change the role of a user in the team')
    } else {
        KeywordUtil.markFailed(actualMsg)
    }
    
	
    //***Switch to previous browser
	WebElement ele = driver.findElement(By.xpath('//div[@id="roleChangedPopup"]/div/div/div[2]'));
	String actualMsg2= ele.getText();
	 
    expectedMsg2 = findTestData('User_RoleChange_Delete').getValue('Expected_Msg_Header', 3)

    if (actualMsg2 == expectedMsg2) {
        KeywordUtil.markPassed('Role change popup is showing correctly to the user')
    } else {
        KeywordUtil.markFailed(actualMsg2)
    }
    
	driver.findElement(By.xpath('//button[@type = "button" and (text() = " RE-LOGIN " or . = " RE-LOGIN ")]')).click();
	Thread.sleep(5000)
	if(driver.findElements(By.xpath('//button[@id="login-button"]')).size() != 0){
		KeywordUtil.markPassed('User is logged out successfully when Team role changed')
		System.out.println("User is logged out successfully when Team role changed");
	}else{
		KeywordUtil.markFailed('User is NOT logged out successfully when Team role changed')
		System.out.println("User is NOT logged out successfully when Team role changed");
	}
	
	driver.close();
	
/*    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/button_RE-LOGIN'))
    WebUI.delay(1)
    WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage_TestCases_Objects/Login_button'), 2, FailureHandling.OPTIONAL)*/
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR: ' + e.getMessage())
} 

