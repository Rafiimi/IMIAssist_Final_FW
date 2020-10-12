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


//CustomKeywords.'reusableKeywords.Reusable.Login'()

WebUI.delay(3)

try {
	SelectTimePeriod=WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Selecttimeperiod_dd'))
	
if (SelectTimePeriod == true) {
	KeywordUtil.markPassed('SUCCESS:Agent able to see the Select Time Period')
	WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Selecttimeperiod_dd'))
	
}

else 
{
KeywordUtil.markFailed('ERROR:Agent Unable to see the Select Time Period Drop Down:')
}
	}

catch (Exception e) {
    KeywordUtil.markFailed('ERROR:All options are avilable in view as drop down field')
} 

//First option
try
{
	TodayOption=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Today_option_fdd'))
	if(TodayOption.equals('Today'))
	{
		KeywordUtil.markPassed('Sucess:Today option is available under view as drop down')
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('Failure:Today option is not available under view as drop down')
}
try
{
	Yesterdaytext=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Yesterday_option_STDD'))
	if(Yesterdaytext.equals('Yesterday'))
	{
		KeywordUtil.markPassed('Sucess:Yesterday option is available under view as drop down')
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('Failure:Yesterday option is not available under view as drop down')
}

try
{
	Last_7_DaysText=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Last7days_option'))
	if(Last_7_DaysText.equals('Last 7 Days'))
	{
		KeywordUtil.markPassed('Sucess:Last 7 Days option is available under view as drop down')
	}

}
catch(Exception e)
{
	KeywordUtil.markFailed('Failure:Last 7 Days option is not available under view as drop down')
}
//CustomKeywords.'reusableKeywords.Reusable.Logout'()





