package mobileapp;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dashboard extends Login{
	
	@Test
	public void openapp() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//a[@title='Sent']")).click();

		Reporter.log("clicks on sent items",true);
		
		Thread.sleep(4000);
		
	}

}
