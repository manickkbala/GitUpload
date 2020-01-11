package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLogoutPomClass {
	
	//Declaration

	@FindBy(xpath = "//span[@class='gb_Ia gbii']")
	private WebElement usernamelogo;
	
	@FindBy(xpath = "//a[. = 'Sign out']")
	private WebElement signout;
	
	
	//initialization
	public GmailLogoutPomClass (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickusrnmelogo()
	{
		usernamelogo.click();
	}
	public void clicksignoutbtn()
	{
		signout.click();
	}

}
