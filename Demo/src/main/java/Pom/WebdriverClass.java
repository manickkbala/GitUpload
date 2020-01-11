package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");	
		
	}
	
	public void launchbrowser(WebDriver driver, String url)
	{
		driver.get(url);
	}
	
	public void closebrowser(WebDriver driver)
	{
		driver.close();
	}


}
