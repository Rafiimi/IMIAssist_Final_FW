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
try
{
CustomKeywords.'reusableKeywords.Reusable.Login'()

try
{
WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Aoointmenticon'))

WebUI.click(findTestObject('AppointmentCreationpopup/AppointmentCreationPopup/Appointments'))

WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/filter_options_object'))
Resetbuttonstatus=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Reset_button_under_filter'), 2)
if(Resetbuttonstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Reset button is available under filters')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Reset button is not available under filters')
	
}
KeywordUtil.markPassed('SUCCESS:Reset button is available under filters')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Reset button is not available under filters:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
Teamsstatus=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Teamsfield'), 2)
if(Teamsstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Teams are available under section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Teams are not available under section')
	
}
KeywordUtil.markPassed('SUCCESS:Teams are available under section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Teams are not available under section:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
	

Teamsstatus=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Teamsfield'), 2)
if(Teamsstatus==true)
{
	KeywordUtil.markPassed('SUCCESS:Teamstatus are available under section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Teamstatus are not available under section')
	
}
KeywordUtil.markPassed('SUCCESS:Teamstatus are available under section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Teamstatus are not available under section:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
StatusType=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/StatusType_object'), 2)
if(StatusType==true)
{
	KeywordUtil.markPassed('SUCCESS:StatusType is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:StatusType field is not available under section')
	
}

KeywordUtil.markPassed('SUCCESS:StatusType are available under section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:StatusType are not available under section:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
Duelabeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Due_label_object'), 2)
if(Duelabeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:Due Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Due Label field is not available under section')

}

KeywordUtil.markPassed('SUCCESS:Due Label field is available under section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Due Label field is not available under section:'+e.getMessage())
	
}
WebUI.delay(3)
try
{
OverDuelabeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Overduelable_text'), 2)
if(OverDuelabeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:OverDue Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:OverDue Label field is not available under section')

}
	KeywordUtil.markPassed('SUCCESS:OverDue Label is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:OverDue Label field is not available under section')
	
}
WebUI.delay(3)
try
{
Startedlabeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Started_Object'), 2)
if(Startedlabeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:Started Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Started Label field is not available under section')

}
	KeywordUtil.markPassed('SUCCESS:Started Label is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Started Label field is not available under section')
	
}
try
{
WebUI.delay(3)

Prioritytypelabeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/PriorityType_object'), 2)
if(Prioritytypelabeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:Prioritytype Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Prioritytype Label field is not available under section')

}

	KeywordUtil.markPassed('SUCCESS:Prioritytype Label is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Prioritytype Label field is not available under section')

}

WebUI.delay(3)
try
{
Time_period_labeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Time_period_Object'), 2)
if(Time_period_labeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:Time_period Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Time_period Label field is not available under section')

}
	KeywordUtil.markPassed('SUCCESS:Time_period Label is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Time_period Label field is not available under section')

}
WebUI.delay(3)
try
{
Formdate_labeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/FormDate_filed'), 2)
if(Formdate_labeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:Formdate Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Formdate Label field is not available under section')

}
	KeywordUtil.markPassed('SUCCESS:Formdate Label is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Formdate Label field is not available under section')

}
WebUI.delay(3)
try
{
Todate_labeltext=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Todate_object'), 2)
if(Todate_labeltext==true)
{
	KeywordUtil.markPassed('SUCCESS:Todate Label is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Todate Label field is not available under section')

}
	KeywordUtil.markPassed('SUCCESS:Todate Label is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Todate Label field is not available under section')

}
WebUI.delay(3)
try
{
Applyfilterbutton=WebUI.verifyElementPresent(findTestObject('Object Repository/AppointmentCreationpopup/Applyfilterbutton'), 2)
if(Applyfilterbutton==true)
{
	KeywordUtil.markPassed('SUCCESS:Applyfilterbutton is available under filter section')
	
}

else
{
	KeywordUtil.markFailed('ERROR:Applyfilterbutton is not available under section')

}
	KeywordUtil.markPassed('SUCCESS:Applyfilterbutton is available under filter section')

}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:Applyfilterbutton is not available under section')

}
WebUI.delay(2)

KeywordUtil.markPassed('SUCCESS:All optikons is available under filter section')
//WebUI.delay(3)
//WebUI.delay(3)
//WebUI.click(findTestObject('Object Repository/AppointmentCreationpopup/Filter_Clear_object'))
WebUI.delay(3)
CustomKeywords.'reusableKeywords.Reusable.Logout'()
}
catch(Exception e)
{
	KeywordUtil.markFailed('ERROR:All optikons is not available under filter section:'+e.getMessage())
	
}