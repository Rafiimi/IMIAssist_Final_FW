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

teamuserdeleteconfirmation = 'Users deleted successfully'

try {
    WebUI.openBrowser('')

    WebUI.navigateToUrl(findTestData('Allthetabsatagentside').getValue(1, 1))

    WebUI.maximizeWindow()

    WebUI.delay(4)

    WebUI.setText(findTestObject('null'), 
        findTestData('Allthetabsatagentside').getValue(2, 1))

    WebUI.setText(findTestObject('Page_IMIassist - Virtual Assistance/input_Please enter your details below_user-_90355e'), 
        findTestData('Allthetabsatagentside').getValue(3, 1))

    WebUI.click(findTestObject('null'))

    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/i_settings'))

    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Settings'))

    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/span_Team'))

    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Select a team to view detailsPlease sel_21f0a7'))

    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/div_Assets Test'))

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/label'))

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/i_delete'))

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/button_REMOVE'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/Teamusedeleteframeobj'))

    WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/p_Users deleted successfully'))

    WebUI.delay(2)

    WebUI.takeScreenshot('D:\\IMIAssist- Automation\\IMIAssist_Screenshots\\LoginAndprofile_screens\\Tc_1008_Team_user_delete.png')

    userdeleteconfirmation = WebUI.getText(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/p_Users deleted successfully'))

    println(userdeleteconfirmation)

    if (userdeleteconfirmation.equals(teamuserdeleteconfirmation)) {
        KeywordUtil.markPassed('SUCCESS:User deleted successfully')

        WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/teamuserdeletepopupcloseicon'))
    } else {
        KeywordUtil.markFailed('ERROR:User unable to deleted')
    }
    
    //WebUI.click(findTestObject('Object Repository/Page_IMIassist - Virtual Assistance/i_close'))
    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/a_Finance_navProfileDropdown'))

    WebUI.click(findTestObject('Page_IMIassist - Virtual Assistance/li_Logout'))

    WebUI.delay(5)

    WebUI.closeBrowser()
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:User unable to deleted')
} 

