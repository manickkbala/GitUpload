package mip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollcheck {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://varvy.com/pagespeed/wicked-fast.html");
		WebElement ele = driver.findElement(By.xpath("//h2 [.='Javascript']"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		String pr = ele.getText(); 
		System.out.println(pr);
		
	}

}
