package GenericMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass extends WebDriverMethods
{
	public WebDriver driver = new FirefoxDriver();
	
	public void main()
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		MyClass my = new MyClass();
		my.driverclose(driver);
		//WebDriverMethods.driverclose(driver);
	}

}
