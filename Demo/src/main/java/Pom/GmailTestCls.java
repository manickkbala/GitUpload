package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailTestCls {
	
	@Test
	public void facebooklog() throws InterruptedException
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		GmailPom gp = new GmailPom(driver);
		gp.setuname("9092292280");
		gp.Unnxtbtn();
		
		GmailPom2 gp2 = new GmailPom2(driver);
		gp2.setpwd("9092292280");
		gp2.pwnxtbtn();
		
		
		Thread.sleep(2000);
		
		driver.close();

	}
}
