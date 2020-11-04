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

CustomKeywords.'reusableKeywords.Reusable.Login'()
CustomKeywords.'reusableKeywords.Reusable.UserNavigation_Team'()

try
{
WebUI.click(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Firstteamfrom_settings'))
WebUI.delay(3)
List<WebELement> teamslist=WebUI.findWebElements(findTestObject('Object Repository/IMIA_Custome_Reports_objects/Listofteamsfromdepartment'),2)
int count=teamslist.size()
println("Teams count from testing department:"+count)
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Agent unable to get the teams list from dep:' + e.getMessage())
	
}