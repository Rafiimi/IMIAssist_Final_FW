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
'In same script below cases is added\r\nTC_Custom Reports_20'
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
    addfilterstatus = WebUI.verifyElementVisible(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Add-flter'))

    if (addfilterstatus == true) {
        WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Add-flter'))

        WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Selectfilterdropdown'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/patientemail_object'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/deleteObject'))

        KeywordUtil.markPassed('SUCCESS:agent able to see the addfilter link under filter section in custom reports page and he able to added/deleted patient email option and he ')
    }
}
catch (Exception e) {
    KeywordUtil.markFailed('ERROR:agent unable to add patient email in add filter drop down:' + e.getMessage())
} 

try
{
	addattributelibktext=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Add_attributelink'))
	Expectedaddattributelibktext=findTestData('IMI_Custome_reports_TD').getValue(18, 1)
	if(Expectedaddattributelibktext.equals(addattributelibktext))
	{
		KeywordUtil.markPassed('SUCESS:addattributelibktext link is available in aattribute section')
		
	}
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:addattributelibktext link is not available in aattribute section:' + e.getMessage())
	
}

//Add extra attribute
try
{
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Add_attributelink'))
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/addattributeodropdown'))
//	WebUI.click(findTestData('Object Repository/IMIA_Custome_Reports_objects/SelectAttribute'))
	WebUI.delay(3)
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/PatientPhoneObject'))
	WebUI.delay(3)
	WebUI.mouseOver(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Selectattributesropdown'))
	WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Deleteattribute'))
	
}

catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent able to delete the added attribute :' + e.getMessage())
	
}
