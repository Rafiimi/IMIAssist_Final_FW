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

CustomKeywords.'reusableKeywords.Reusable.LoginDiffUser'(8)

CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Dept'()

KeywordLogger logger = new KeywordLogger()

try {
    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Speciality_Testing'))

    TCname = 'AppointmentNotifications_CustomerReminders'

    logger.logInfo('***START Of TEST CASE: ' + TCname)

    WebUI.delay(2)

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Tab_AppointmentManagement'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/Subtab_Notification'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/AppSettings_Notif_Customer'))

    WebUI.click(findTestObject('Admin_Settings/Dept/UserCreation/CustomerScheduledAppt_input'))

    WebUI.delay(1)

    String actValList = WebUI.getText(findTestObject('Admin_Settings/Dept/UserCreation/CustomerScheduledAppt_ItemList'))
	String[] parseList = actValList.split('\n')
	int count = parseList.size()
	
	String expValList = '5 mins ahead,10 mins ahead,15 mins ahead,30 mins ahead,60 mins ahead,90 mins ahead,120 mins ahead'
	String[] parseList2 = expValList.split(',')
	int count2 = parseList2.size()
	
	for (int i = 0; i <= count2-1; i++) {
		if (parseList2[i]==parseList[i]){
			KeywordUtil.markPassed('Notify scheduled appointment list: Expected- '+parseList2[i] +', Actual is -'+parseList[i])
		} else {
			KeywordUtil.markFailed('Notify scheduled appointment list: Expected- '+parseList2[i] +', Actual is -'+parseList[i])
		}
		
	}
	
    logger.logInfo('***END Of TEST CASE: ' + TCname)
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR :' + e.getMessage())
} 

