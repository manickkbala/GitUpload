package foodrx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Login {

	public WebDriver driver;
	public String url ="https://foodrx.3tandai.com/admins/sign_in";
	public String uname ="admin@3tandai.com";
	public String pwd = "getf!t";
	public String seacrchemail = "bala@digbihealth.com";
	public String role = "Health Coach";
	public String selectcoach = "Vidhya   url: https://digbi-health-consult.as.me/schedule.php?calendarID=2994763";
	
	@BeforeSuite
	public void abeforemethod()
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		driver = new FirefoxDriver();
		Reporter.log("driver is passed", true);

	}
	
	@BeforeTest
	public void aurl() throws InterruptedException
	{
		driver.get(url);
		Reporter.log("url is passed", true);
		Thread.sleep(3000);
	}
	
	@BeforeTest
	public void cred() throws InterruptedException
	{
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Reporter.log("credentials are entered", true);
			Thread.sleep(20000);

	}
	
	@AfterSuite
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		Reporter.log("Signout is passed", true);
		Thread.sleep(20000);
		driver.quit();
		Reporter.log("Browser is closed", true);

	}
	
}
