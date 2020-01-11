package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebook_login {
	
	@Test
	public void facebooklog() throws InterruptedException
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		LoginPage lp = new LoginPage(driver);
		lp.setuname("9092292280");
		lp.setpwd("9092292290");
		lp.logbtn();
		
		Thread.sleep(2000);
		
		driver.close();
	
	}

}
