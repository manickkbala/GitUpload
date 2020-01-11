package parallelexec;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelbrowser {
	
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
		public void parallelbrowse(String browser) throws InterruptedException
		{
		Properties p = new Properties();
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		System.setProperty ("webdriver.chrome.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/chromedriver 2");

		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.get(p.getProperty("url"));
			Thread.sleep(5000);
			driver.close();
		}else
		{
			driver = new FirefoxDriver();
			Thread.sleep(1000);
			driver.get(p.getProperty("url"));
			Thread.sleep(5000);
			driver.close();
		}
		
		}
}
