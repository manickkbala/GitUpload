package parallelexec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallelclass {
	public WebDriver driver;
	@Test
	public void test_property() throws FileNotFoundException, IOException
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		Properties p = new Properties();
		
		driver = new FirefoxDriver();
		p.load(new FileInputStream("./pp.properties"));
		driver.get(p.getProperty("url"));
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(p.getProperty("uname"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
