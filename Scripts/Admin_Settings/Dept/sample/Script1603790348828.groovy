import com.kms.katalon.core.testdata.CSVData
import com.kms.katalon.core.testdata.reader.CSVSeparator




/*WebUI.openBrowser('https://gmail.com')

System.setProperty('webdriver.chrome.driver', 'C:\\Users\\ravi.b\\Downloads\\Driver_Chrome_Katalon\\chromedriver_win32\\chromedriver.exe')

WebDriver driver = new ChromeDriver()

driver.get('http://172.16.98.29/Davinci/GetDet/Default.aspx')

Thread.sleep(5000)

//WebUI.navigateToUrl('https://stg.imiassist.ai/agent/#!/registration/login')
driver.findElement(By.xpath('//*[@id="txtUserName"]')).sendKeys('dbdetails');
driver.findElement(By.xpath('//*[@id="txtPassword"]')).sendKeys('db@imi@123');
driver.findElement(By.xpath('//*[@id="btnOk"]')).click();
Thread.sleep(5000);

Select dbval = new Select(driver.findElement(By.xpath('//*[@id="cmbDSNs"]')));
dbval.selectByValue("PWA_STG");
smsisdn="2348247623005"
driver.findElement(By.xpath('//*[@id="txtQuery"]')).sendKeys('select otp from otp_reg_logs (nolock) where msisdn='+"'"+smsisdn+"'");
driver.findElement(By.xpath('//*[@id="cmdShow"]')).click();
Thread.sleep(3000);

WebElement ele = driver.findElement(By.xpath('//*[@id="dbGrid"]/tbody/tr[2]/td'));
String sOtp= ele.getText();
System.out.println("TOTP is : " + sOtp);

driver.findElement(By.xpath('//*[@id="btnLogout"]')).click();
driver.close();

WebUI.setText(findTestObject('Admin_Settings/Dept/Page_Gmail/email'), 'ravi.b23@gmail.com', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Admin_Settings/Dept/Page_Gmail/Next'))
*/

/*System.setProperty('webdriver.chrome.driver', 'C:\\Users\\ravi.b\\Downloads\\Driver_Chrome_Katalon\\chromedriver_win32\\chromedriver.exe')
WebDriver driver = new ChromeDriver()
JavascriptExecutor jse = (JavascriptExecutor)driver;
WebElement element = driver.findElement(By.xpath("//*[@id='input']"));
String emailid = jse.executeScript("email id displayed is: ", element);
System.out.println(emailid);*/

//CSVData csvData = new CSVData("C://Users//ravi.b//Downloads//saveas2.csv", true, CSVSeparator.COMMA)
String reportTitle = "Ravibolla"
	String userprofile = System.getenv("USERPROFILE");
	CSVData csvData = new CSVData(userprofile+"//Downloads//"+reportTitle+".csv", true, CSVSeparator.COMMA)
	
//to access or to get the .csv file values refer to some commonly used commands
csvData.allData 
patEmail = csvData.getValue('Patient Email', 2)
patPhone = csvData.getValue('Patient Phone', 2)
cliEmail = csvData.getValue('Clinician Email', 2)
priorityTag = csvData.getValue('Priority', 2)
statusTag = csvData.getValue('Status', 2)

println patEmail
println patPhone
println cliEmail
println priorityTag
println statusTag


totRecords = csvData.rowNumbers //this is to get all the used rows or total number of rows
println totRecords


//csvData.columnNumbers
//csvData.columnNames
