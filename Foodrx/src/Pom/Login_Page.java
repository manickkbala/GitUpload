package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	//Declaration
	@FindBy(xpath = "//input[@id='admin_email']")
	private WebElement untextbox;

	@FindBy(xpath = "//input[@id='admin_password']")
	private WebElement pwdtextbox;
	
	@FindBy(xpath = "//input[@class='button']")
	private WebElement loginbtn;
	
	//initialization
	public Login_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void enteruname(String unmae)
	{
		untextbox.sendKeys(unmae);
	}
	public void enterpwd(String pass)
	{
		pwdtextbox.sendKeys(pass);
	}
	public void loginbutton()
	{
		loginbtn.click();
		
	}

}
