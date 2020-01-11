package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
		@FindBy(id ="email")
		private WebElement unbox;
		
		@FindBy(xpath = "//input[@id ='pass']")
		private WebElement pwd;

		@FindBy(xpath = "//input[@type='submit']")
		private WebElement login;
		

		//initialization
		public LoginPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		
		public void setuname(String unmae)
		{
			unbox.sendKeys(unmae);
		}
		public void setpwd(String passpwd)
		{
			pwd.sendKeys(passpwd);
		}
		public void logbtn()
		{
			login.click();
		}
}
