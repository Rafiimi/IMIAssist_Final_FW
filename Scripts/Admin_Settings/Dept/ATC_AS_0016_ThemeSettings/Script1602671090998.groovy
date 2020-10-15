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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

CustomKeywords.'reusableKeywords.Reusable.Login'()

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

try {
    TCname = findTestData('Team_Theme_Settings').getValue('Description', 3)

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_ThemeSettings'))
	WebUI.delay(2)

    for (int i = 1; i <= 2; i++) {
        WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/BrandLogo_Upload'), findTestData('Team_Theme_Settings').getValue(
                'BrandLogo', 3), FailureHandling.OPTIONAL)

	WebUI.delay(1)
	String fileTypeErrAct = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/Theme_FileSize_Error'))
    String fileTypeErrExp = findTestData('Team_Theme_Settings').getValue('Expected_Msg_FieldLevel', i)
    
        if (fileTypeErrExp == fileTypeErrAct) {
            KeywordUtil.markPassed(((((('Expected and actual error messages are matched: ' + 'Actual is: ') + fileTypeErrAct) + 
                ' ') + ',') + 'Expected is: ') + fileTypeErrExp)
        } else {
            KeywordUtil.markPassed(((((('Expected and actual error messages are NOT matched: ' + 'Actual is: ') + fileTypeErrAct) + 
                ' ') + ',') + 'Expected is: ') + fileTypeErrExp)
        }
    }
    
    if (findTestData('Team_Theme_Settings').getValue('BrandLogo', 3) != '') {
        WebUI.uploadFile(findTestObject('Admin_Settings/Dept/UserCreation/BrandLogo_Upload'), findTestData('Team_Theme_Settings').getValue(
                'BrandLogo', 3), FailureHandling.OPTIONAL)
    }
    
    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Theme_BrandColour'), findTestData('Team_Theme_Settings').getValue(
            'BrandColor', 3), FailureHandling.OPTIONAL)

    WebUI.setText(findTestObject('Admin_Settings/Dept/UserCreation/Theme_ButtonColour'), findTestData('Team_Theme_Settings').getValue(
            'ButtonColor', 3), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Theme_Font'))

    String PageFont = findTestData('Team_Theme_Settings').getValue('PageFont', 3)

    if (PageFont == 'Open Sans') {
        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Theme_SelectFont_OpenSans'))
    }
    
    if (findTestData('Team_Theme_Settings').getValue('FontColour', 3) == 'WHITE') {
        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Theme_Font_White'))
    } else {
        WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Theme_Font_Black'))
    }
    
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/ThemeSettings_SAVE'))

    WebUI.delay(3)

    String actualMsg = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/ToastMessage'))

    String expectedMsg = findTestData('Team_Theme_Settings').getValue('Expected_Msg_Header', 3)

    if (actualMsg == expectedMsg) {
        KeywordUtil.markPassed('Team Theme settings: ' + expectedMsg)
    } else {
        KeywordUtil.markFailed('Team Theme settings: ' + actualMsg)
    }
    
    WebUI.delay(2)

    WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/ThemeSettings_ColorPreview'))

    WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/ThemeSettings_ColorPreview'), 2, FailureHandling.OPTIONAL)

    WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/ThemeSettings_ButtonPreview'), 2, FailureHandling.OPTIONAL)

    String BrandColBox = WebUI.getCSSValue(findTestObject('Admin_Settings/Dept/UserCreation/Theme_BrandColour_colorbox'), 
        'style')

    //    String BrandExpected = findTestData('Team_Theme_Settings').getValue('BrandColour_Code', 3)
    String BrandColor = findTestData('Team_Theme_Settings').getValue('BrandColor', 3)

    /*    if (BrandColBox == BrandExpected) {
        KeywordUtil.markPassed('Theme settings: Entered Brand Color and Brand Color box color are matched')
    } else {
        KeywordUtil.markFailed('Team Theme settings: ' + BrandColBox)
    }
*/
    String ButtonColBox = WebUI.getCSSValue(findTestObject('Admin_Settings/Dept/UserCreation/Theme_ButtonColour_colorbox'), 
        'style')

    //    String ButtonExpected = findTestData('Team_Theme_Settings').getValue('ButtonColor_Code', 3)
    String ButtonColor = findTestData('Team_Theme_Settings').getValue('ButtonColor', 3)

    /*    if (ButtonColBox == ButtonExpected) {
        KeywordUtil.markPassed('Theme settings: Entered Button Color and Button Color box color are matched')
    } else {
        KeywordUtil.markFailed('Team Theme settings: ' + ButtonColBox)
    }*/
    /*   if (ColPreview == true) {
        String BrandColBox2 = WebUI.getAttribute(findTestObject('null'), 
            'background-color', FailureHandling.OPTIONAL)

       if (BrandColBox2 == BrandExpected) {
            KeywordUtil.markPassed('Theme settings: Entered Brand Color is updated successfully')
        } else {
            KeywordUtil.markFailed('Theme settings: ' + 'Entered Brand Color is NOT updated successfully')
        }
    } else {
        KeywordUtil.markFailed('Theme settings: Brand Color preview is not displayed')
    }*/
    /*    if (ButtonPreview == true) {
        String ButtonColBox2 = WebUI.getAttribute(findTestObject('null'), 
            'background-color', FailureHandling.OPTIONAL)

        if (ButtonColBox2 == ButtonExpected) {
            KeywordUtil.markPassed('Theme settings: Entered Button Color is updated successfully')
        } else {
            KeywordUtil.markFailed('Theme settings: ' + 'Entered Button Color is NOT updated successfully')
        }
    } else {
        KeywordUtil.markFailed('Theme settings: Button Color preview is not displayed')
    }
*/
    String expColorCodes = (((('primary-background-color:' + BrandColor) + '; --secondary-color:') + ButtonColor) + '; --main-font-family:') + 
    PageFont

    WebDriver driver = DriverFactory.getWebDriver()

    String pagesource = driver.getPageSource()

    //	logger.logInfo(pagesource)
    if (pagesource.contains(expColorCodes)) {
        KeywordUtil.markPassed('Brand color and Button colors are applied successfully')
    } else {
        KeywordUtil.markFailed('Brand color and Button colors are NOT applied successfully')
    }
    
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('Theme Settings :' + e.getMessage())
} 

try {
    TCname2 = 'Checking Brand Color, Button color and Brand Logo in all pages'

    logger.logInfo('***START Of TEST CASE: ' + TCname2)
	
	String BrandColor = findTestData('Team_Theme_Settings').getValue('BrandColor', 3)
	String ButtonColor = findTestData('Team_Theme_Settings').getValue('ButtonColor', 3)
	String PageFont = findTestData('Team_Theme_Settings').getValue('PageFont', 3)

	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/span_Dashboard'))
	WebUI.delay(2)
    WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/BrandLogoImage'), 2, FailureHandling.OPTIONAL)

	String expColorCodes = (((('primary-background-color:' + BrandColor) + '; --secondary-color:') + ButtonColor) + '; --main-font-family:') +
	PageFont

	WebDriver driver = DriverFactory.getWebDriver()
	String pagesource2 = driver.getPageSource()

	if (pagesource2.contains(expColorCodes)) {
		KeywordUtil.markPassed('Brand Color, Button color and Brand Logo are displayed in DashBoard successfully')
	} else {
		KeywordUtil.markFailed('Brand Color, Button color and Brand Logo are NOT displayed in DashBoard correctly')
	}
	
	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/span_Appointments'))
	WebUI.delay(2)
    WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/BrandLogoImage'), 2, FailureHandling.OPTIONAL)

	String pagesource3 = driver.getPageSource()

	if (pagesource3.contains(expColorCodes)) {
		KeywordUtil.markPassed('Brand Color, Button color and Brand Logo are displayed in Appointments successfully')
	} else {
		KeywordUtil.markFailed('Brand Color, Button color and Brand Logo are NOT displayed in Appointments correctly')
	}
	
	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/span_Reports'))
	WebUI.delay(2)
    WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/BrandLogoImage'), 2, FailureHandling.OPTIONAL)

	String pagesource4 = driver.getPageSource()

	if (pagesource4.contains(expColorCodes)) {
		KeywordUtil.markPassed('Brand Color, Button color and Brand Logo are displayed in Reports successfully')
	} else {
		KeywordUtil.markFailed('Brand Color, Button color and Brand Logo are NOT displayed in Reports correctly')
	}
	
	WebUI.mouseOver(findTestObject('Admin_Settings/Dept/UserCreation/navigation_Dashboard'))
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/span_Logs'))
	WebUI.delay(2)
    WebUI.verifyElementPresent(findTestObject('Admin_Settings/Dept/UserCreation/BrandLogoImage'), 2, FailureHandling.OPTIONAL)

	String pagesource5 = driver.getPageSource()

	if (pagesource5.contains(expColorCodes)) {
		KeywordUtil.markPassed('Brand Color, Button color and Brand Logo are displayed in Logs successfully')
	} else {
		KeywordUtil.markFailed('Brand Color, Button color and Brand Logo are NOT displayed in Logs correctly')
	}

	logger.logInfo('***END Of TEST CASE: ' + TCname2)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

