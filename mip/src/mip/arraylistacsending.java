package mip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class arraylistacsending {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("file:///Users/bala/Desktop/dropdowns.html");
		
		WebElement ele = driver.findElement(By.id("mtr"));
		
		Select s = new Select(ele);
		
		List<WebElement> options = s.getOptions();

		ArrayList<String> al = new ArrayList<String>();
		//TreeSet<String> tr = new TreeSet<String>(Collections.reverseOrder());
		
		for(WebElement t:options)
		{
				String abc = t.getText();
				al.add(abc);
		}
		System.out.println("The options in ascending order is :");
		
		for(String x:al)
		{

			System.out.println(x);
		}
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
