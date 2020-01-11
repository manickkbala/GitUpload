package GenericMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {
	public Actions ar ;

	
	public void Draganddrop(WebDriver driver, WebElement ele)
	{
		ar = new Actions(driver);
		ar.dragAndDrop(ele, ele).perform();
	}
	public void DoubleClick(WebDriver driver, WebElement ele)
	{
		Actions ar = new Actions(driver);
		ar.doubleClick(ele).perform();
	}
	public void RightClick(WebDriver driver, WebElement ele)
	{
		Actions ar = new Actions(driver);
		ar.contextClick(ele).perform();
	}
	public void mousehover(WebDriver driver, WebElement ele)
	{
		Actions ar = new Actions(driver);
		ar.moveToElement(ele).perform();

	}

}
