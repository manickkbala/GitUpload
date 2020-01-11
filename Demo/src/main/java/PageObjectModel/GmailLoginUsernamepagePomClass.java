package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginUsernamepagePomClass {
	
	//Declaration
	@FindBy(xpath = "//input[@id = 'identifierId']")
	private WebElement untextbox;

	@FindBy(xpath = "//div[. = 'Next']")
	private WebElement unnext;
	
	//initialization
	public GmailLoginUsernamepagePomClass (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void setuname(String unmae)
	{
		untextbox.sendKeys(unmae);
	}
	public void Unnxtbtn()
	{
		unnext.click();
	}

}
