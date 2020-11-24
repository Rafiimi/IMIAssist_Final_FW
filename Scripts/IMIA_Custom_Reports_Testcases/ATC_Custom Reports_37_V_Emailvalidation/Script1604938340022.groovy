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
//Navigate to the custom report under reports tab
CustomKeywords.'reusableKeywords.Reusable.Selectcustom_reports'()
//Verify default attributes in filter section
try
{
	WebUI.setText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Reporttitle'), findTestData('IMI_Custome_reports_TD').getValue(7, 1))
	
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/EnableemailCB'))
	WebUI.setText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Emailtextfield'), findTestData('IMI_Custome_reports_TD').getValue(19, 1))
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Createreportbutton'))
	Invalidemailtext=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Emailinavlaiderror'))
	Expemailerror=findTestData('IMI_Custome_reports_TD').getValue(20, 1)
	if(Invalidemailtext.equals(Expemailerror))
	{
		KeywordUtil.markPassed('SUCCESS:Agent able to see the onvalid email')
		
	}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to see the onvalid email:' + e.getMessage())
	
}

//Add extra attribute
try
{
	WebUI.click(findTestData('Object Repository/IMIA_Custome_Reports_objects/SelectAttribute'))
	WebUI.delay(3)
	
}

catch(Exception e)
{
	
}