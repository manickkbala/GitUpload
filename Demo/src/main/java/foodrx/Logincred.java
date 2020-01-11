package foodrx;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Logincred extends Login {
	
	
	
	@BeforeMethod
	public void cred() throws InterruptedException
	{
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@3tandai.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("getf!t");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Reporter.log("credentials are entered", true);
			Thread.sleep(10000);

	}

}
