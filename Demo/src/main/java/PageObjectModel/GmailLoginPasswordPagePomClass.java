package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPasswordPagePomClass {
	
	//Declaration

		@FindBy(xpath = "//input[@name=\"password\"]")
		private WebElement pwdtextbox;
		
		@FindBy(xpath = "//span[. = 'Next']")
		private WebElement passwdnext;
		
		//initialization
		public GmailLoginPasswordPagePomClass (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void setpwd(String unmae)
		{
			pwdtextbox.sendKeys(unmae);
		}
		public void pwnxtbtn()
		{
			passwdnext.click();
		}

}
