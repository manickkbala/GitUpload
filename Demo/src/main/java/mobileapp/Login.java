package mobileapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class Login {
	
	public WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");

		driver = new FirefoxDriver();
		
		Reporter.log("Driver declared",true);
	}
	
	@BeforeMethod
	public void beforemethod() throws InterruptedException
	{
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("balatester2014@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Reporter.log("Username is entrered",true);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9092292290");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Reporter.log("Password is entrered",true);

		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//span[@class=\"gb_Ia gbii\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[.='Sign out']")).click();

		Reporter.log("Logout the application",true);
		
		driver.close();
		Reporter.log("close the browser",true);

	}

}
