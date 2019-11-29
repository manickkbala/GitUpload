package mip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///Users/bala/Desktop/frames.html");
		
		driver.findElement(By.id("t1")).sendKeys("text value one");
		
		WebElement abc = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(abc);
		
		driver.findElement(By.id("t2")).sendKeys("value for the frame");
		
	}

}
