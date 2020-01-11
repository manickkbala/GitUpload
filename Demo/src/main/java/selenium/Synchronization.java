package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://foodrx.3tandai.com/");
		
		driver.findElement(By.xpath("//input[@placeholder=\"email address\"]")).sendKeys("bala@digbihealth.com");;
		driver.findElement(By.xpath("//input[@placeholder=\"password\"]")).sendKeys("bala123");;
		driver.findElement(By.xpath("//div[.='submit']")).click();

		Thread.sleep(9000);
		
		WebDriverWait wait = new WebDriverWait(driver,10 );
		wait.until(ExpectedConditions.titleContains("Your"));
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
