package GenericMethods;

import org.openqa.selenium.WebElement;

public class WebElementMethods {
	
	public boolean elementdisplayed(WebElement ele)
	{
		 boolean result = ele.isDisplayed();
		 return result;
	}
	public boolean elementenabled(WebElement ele)
	{
		 boolean result = ele.isEnabled();
		
		 return result;
	}
	public boolean elementselected(WebElement ele)
	{
		boolean result = ele.isSelected();
		 return result;
	}
	public void elementclear(WebElement ele)
	{
		ele.clear();
	}
	public void elementclick(WebElement ele)
	{
		ele.click();
	}
	public void elementattribute(WebElement ele, String text)
	{
		ele.getAttribute(text);
	}
	public void elementcssvale(WebElement ele, String text)
	{
		ele.getCssValue(text);
	}
	public void elementlocation(WebElement ele)
	{
		ele.getLocation();
	}
	public void elementrect(WebElement ele)
	{
		ele.getRect();
	}
//	public void elementscreenshot(WebElement ele, int path)
//	{
//		ele.getScreenshotAs(path);
//	}
	public void elementsize(WebElement ele)
	{
		ele.getSize();
	}
	public void elementtagname(WebElement ele)
	{
		ele.getTagName();
	}
	public void elementtext(WebElement ele)
	{
		ele.getText();
	}
	public void elementsendkeys(WebElement ele, String charc)
	{
		ele.sendKeys(charc);
	}
	public void elementsubmit(WebElement ele)
	{
		ele.submit();
	}

}
