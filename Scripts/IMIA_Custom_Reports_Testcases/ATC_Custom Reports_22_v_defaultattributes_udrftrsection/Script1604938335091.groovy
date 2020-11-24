import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.bouncycastle.operator.KeyWrapper

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
	TeamName=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/TeamName')).trim()
	expteamanme=findTestData('IMI_Custome_reports_TD').getValue(9, 1)
	if(TeamName.equals(expteamanme))
	{
		KeywordUtil.markPassed('SUCCESS:Team Name attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Team Name attribute is not available in aattribute section:' + e.getMessage())
	
}

try
{
	CaseID=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Case_Id')).trim()
	expCaseID=findTestData('IMI_Custome_reports_TD').getValue(10, 1)
	if(CaseID.equals(expCaseID))
	{
		KeywordUtil.markPassed('SUCCESS:CaseID attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:CaseID attribute is not available in aattribute section:' + e.getMessage())
	
}

try
{
	APPID=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Appointment_ID')).trim()
	expAPPID=findTestData('IMI_Custome_reports_TD').getValue(11, 1)
	if(APPID.equals(expAPPID))
	{
		KeywordUtil.markPassed('SUCCESS:APPID attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:APPID attribute is not available in aattribute section:' + e.getMessage())
	
}

try
{
	Clinicianname=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Clinician_Name')).trim()
	expClinicianname=findTestData('IMI_Custome_reports_TD').getValue(12, 1)
	if(Clinicianname.equals(expClinicianname))
	{
		KeywordUtil.markPassed('SUCCESS:Clinicianname attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Clinicianname attribute is not available in aattribute section:' + e.getMessage())
	
}


try
{
	patientname=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/PatientName')).trim()
	exppatientname=findTestData('IMI_Custome_reports_TD').getValue(13, 1)
	if(patientname.equals(exppatientname))
	{
		KeywordUtil.markPassed('SUCCESS:patientname attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:patientname attribute is not available in aattribute section:' + e.getMessage())
	
}

try
{
	ClientID=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/ClientiD')).trim()
	expClientID=findTestData('IMI_Custome_reports_TD').getValue(14, 1)
	if(ClientID.equals(expClientID))
	{
		KeywordUtil.markPassed('SUCCESS:ClientID attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:ClientID attribute is not available in aattribute section:' + e.getMessage())
	
}


try
{
	Patientphone=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/PatientPhone')).trim()
	expPatientphone=findTestData('IMI_Custome_reports_TD').getValue(15, 1)
	if(Patientphone.equals(expPatientphone))
	{
		KeywordUtil.markPassed('SUCCESS:Patientphone attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Patientphone attribute is not available in aattribute section:' + e.getMessage())
	
}

try
{
	Note=WebUI.getText(findTestObject('Object Repository/IMIA_Custome_Reports_objects/PatientPhone')).trim()
	expNote=findTestData('IMI_Custome_reports_TD').getValue(16, 1)
	if(Note.equals(expNote))
	{
		KeywordUtil.markPassed('SUCCESS:Note attribute is available in aattribute section')
		
	}
	}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Note attribute is not available in aattribute section:' + e.getMessage())
	
}





