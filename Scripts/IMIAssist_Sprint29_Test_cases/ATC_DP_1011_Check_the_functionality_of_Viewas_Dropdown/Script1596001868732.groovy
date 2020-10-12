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
	WebUI.click(findTestObject('Object Repository/DashBoard_Objects/Viewasdropdown'))
	Viewasdropdown = WebUI.verifyElementVisible(findTestObject('Object Repository/DashBoard_Objects/Viewasdropdown'))
	
if (Viewasdropdown == true) {
	KeywordUtil.markPassed('SUCCESS:Agent able to see the viewas dropdown')
}

else 
{
KeywordUtil.markFailed('ERROR:Agent able to see the viewas Drop Down:')
}
	}

catch (Exception e) {
    KeywordUtil.markFailed('ERROR:All options are avilable in view as drop down field')
} 

//First option
try
{
	SpecialityAdmin=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Departmentadmin_object'))
	if(SpecialityAdmin.contains('Admin'))
	{
		KeywordUtil.markPassed('Sucess:Specialty Admin option is available under view as drop down')
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('Failure:Specialty Admin option is not available under view as drop down')
}
try
{
	TeamViews=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/Teams_view'))
	if(TeamViews.contains('Team View'))
	{
		KeywordUtil.markPassed('Sucess:Team View option is available under view as drop down')
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('Failure:Team View option is not available under view as drop down')
}

try
{
	User=WebUI.getText(findTestObject('Object Repository/DashBoard_Objects/User_view'))
	if(User.contains('User'))
	{
		KeywordUtil.markPassed('Sucess:User option is available under view as drop down')
	}
}

catch(Exception e)
{
	KeywordUtil.markFailed('Failure:User option is not available under view as drop down')
}
//CustomKeywords.'reusableKeywords.Reusable.Logout'()





