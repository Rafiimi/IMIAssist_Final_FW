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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
//User login
CustomKeywords.'reusableKeywords.Reusable.Login'()
//Navigate to the create custom report under reports tab
CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()

//Select the invaliddateformate
try
{
	WebUI.clearText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/FromDateinCRP'))
	WebUI.setText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/FromDateinCRP'), findTestData('IMI_Custome_reports_TD').getValue(6, 1))
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Time_period'))
	WebUI.delay(5)
	
	WebUI.setText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Createreporttitle'),findTestData('IMI_Custome_reports_TD').getValue(7, 1))
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Createreportbutton'))
	}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:agent unable to pass the past date into to dat in time period section:' + e.getMessage())
	
}


//Verify Time period error 
try
{
	TimeperiodErrormessage=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/TimeperiodErrormessage')).trim()
 Expectederrorm=findTestData('IMI_Custome_reports_TD').getValue(8, 1)
 if(TimeperiodErrormessage.equals(Expectederrorm))
 {
	 KeywordUtil.markPassed("SUCCESS:Agent able to see the time period error message")
 }
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:agent unable to see the error message like"Please Select End Date":' + e.getMessage())
	
}
//verify default attributes in filter section

try
{
	
}
catch(Exception e)
{
	
}