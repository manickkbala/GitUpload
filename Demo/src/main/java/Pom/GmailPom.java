package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPom {
	
	//Declaration
	@FindBy(xpath = "//input[@id = 'identifierId']")
	private WebElement unbox;
	
	@FindBy(xpath = "//div[. = 'Next']")
	private WebElement lnext;


	//initialization
	public GmailPom (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void setuname(String unmae)
	{
		unbox.sendKeys(unmae);
	}
	public void Unnxtbtn()
	{
		lnext.click();
	}
}

