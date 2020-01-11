package GenericMethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Generic_test implements Constants {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void mydrivers()
	{
		System.setProperty (GECKO_KEY, GECKO_VALUE);
		driver = new FirefoxDriver();
		driver.get(URL);
	}
	
//	@AfterMethod
//	public void closebrowser()
//	{
//		driver.quit();
//	}

}
