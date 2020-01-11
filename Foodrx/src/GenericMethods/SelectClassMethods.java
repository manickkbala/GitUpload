package GenericMethods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {
	
	public void elementdeselectall(WebElement ele)
	{
		Select s = new Select(ele);
		s.deselectAll();
	}
	public void elementdeselectbyindex(WebElement ele, int i)
	{
		Select s = new Select(ele);
		s.deselectByIndex(i);
	}
	public void elementdeselectbyvalue(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.deselectByValue(value);
	}
	public void elementdeselectbyvistext(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.deselectByVisibleText(value);
	}
	public List<WebElement> elementgetallselectoption(WebElement ele)
	{
		Select s = new Select(ele);
		List<WebElement> result = s.getAllSelectedOptions();
		return result;
	}
	public WebElement elementgetfirstselectoption(WebElement ele)
	{
		Select s = new Select(ele);
		 WebElement result = s.getFirstSelectedOption();
		 return result;
	}
	public List<WebElement> elementgetalltheoptions(WebElement ele)
	{
		Select s = new Select(ele);
		List<WebElement> result = s.getOptions();
		return result;
	}
	public WebElement elementgetwrappedElements(WebElement ele)
	{
		Select s = new Select(ele);
		WebElement result = s.getWrappedElement();
		return result;
	}
	public boolean elementselectismultiple(WebElement ele)
	{
		Select s = new Select(ele);
		boolean result = s.isMultiple();
		return result;
	}
	public void elementselectbyindex(WebElement ele, int i)
	{
		Select s = new Select(ele);
		s.selectByIndex(i);
	}
	public void elementselectbyvalue(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	public void elementselectbyvistext(WebElement ele, String value)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}

}
