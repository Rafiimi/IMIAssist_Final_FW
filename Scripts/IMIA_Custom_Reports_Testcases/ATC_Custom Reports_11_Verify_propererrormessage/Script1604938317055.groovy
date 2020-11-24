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

//Verify the filter section is available under custom report page
try {
	Filtersectionstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Filtersectionobject'))

	if (Filtersectionstatus == true) {
		KeywordUtil.markPassed('SUCCESS:agent able to see the filter section in custom reports page')
	}
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR:agent unable to see the filter sections in custom reports page:' + e.getMessage())
}

//Verify filter subtab group By
try {
	GroupBystatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_Custome_Reports_objects/GroupByobject'))

	if (GroupBystatus == true) {
		KeywordUtil.markPassed('SUCCESS:agent able to see the GroupBy subtab under filter section in custom reports page')
	}
}
catch (Exception e) {
	KeywordUtil.markFailed('ERROR:agent unable to see the GroupBy subtab under filter section  in custom reports page:' + e.getMessage())
}

//Check whether proper error message is displaying on selecting invalid date using date pickers in the time period under filters section while creating Custom Report
for(int i=0;i<=1;i++){
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Deselectteamsingroupbysection'))
		
}
 try
 {
Errormessage=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/GroupByerror'))
Experrormessage=findTestData('IMI_Custome_reports_TD').getValue(5, 1)
if(Errormessage.equals('Experrormessage'))
{
	KeywordUtil.markFailed('ERROR:agent able see the grup by Error message')
	
}

}
 catch(Exception e)
 {
	 KeywordUtil.markFailed('ERROR:agent unable see the grup by Error message:'+e.getMessage())
 }
 