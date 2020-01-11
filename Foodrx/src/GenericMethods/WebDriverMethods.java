package GenericMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriverMethods {

	public void driverclose(WebDriver driver)
	{
		driver.close();
	}
	public void driverget(WebDriver driver, String url)
	{
		driver.get(url);
	}
	public String drivertitle(WebDriver driver)
	{
		String result = driver.getTitle();
		return result;
	}
	public void driverurl(WebDriver driver)
	{
		driver.getCurrentUrl();
	}
	public String driverpagesource(WebDriver driver)
	{
		String result = driver.getPageSource();
		return result;
	}
	public String drivergetwindowhandle(WebDriver driver)
	{
		String result = driver.getWindowHandle();
		return result;
	}
	public Set<String> drivergetwindowhandles(WebDriver driver)
	{
		Set<String> result = driver.getWindowHandles();
		return result;
	}
	public void drivermanage(WebDriver driver)
	{
		driver.manage();
	}
	public void driverrefresh(WebDriver driver)
	{
		driver.navigate().refresh();	
	}
	public void driverforward(WebDriver driver)
	{
		driver.navigate().forward();	
	}
	public void driverbackward(WebDriver driver)
	{
		driver.navigate().back();	
	}
	public void driverquit(WebDriver driver)
	{
		driver.quit();
	}
	public void driverswitchtoframeIndex(WebDriver driver, int i)
	{
		driver.switchTo().frame(i);
	}
	public void driverswitchtoframeValue(WebDriver driver, String value)
	{
		driver.switchTo().frame(value);
	}
	public void driverswitchtoframeWebelement(WebDriver driver, WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	
}
