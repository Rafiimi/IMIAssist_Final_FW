import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.util.logging.Logger

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
import com.kms.katalon.core.util.KeywordUtil



try{
Dashboardtitle='dashboard'
CustomKeywords.'reusableKeywords.Reusable.Login'()

 WebUI.delay(5)
Dashboardheader=WebUI.getText(findTestObject('Object Repository/AppointmentCreationpopup/Dashbord'))
 WebUI.delay(5) 
if(Dashboardheader.contains('Dashboard'))
{
	KeywordUtil.markPassed('SUCCESS: User Successfully launched the dashbord')
}
else
{
	KeywordUtil.markFailed('ERROR: User unable to launched the dashbord')
}
KeywordUtil.markPassed('SUCCESS: User Successfully launched the dashbord')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR: User unable to launched the dashbord:'+e.getMessage())
	
}

