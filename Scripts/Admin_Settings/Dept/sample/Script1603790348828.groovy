import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver

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