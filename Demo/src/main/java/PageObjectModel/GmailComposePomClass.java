package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailComposePomClass {
	
	//Declaration
		@FindBy(xpath = "//div[. = 'Compose']")
		private WebElement Composebtn;
		
		@FindBy(xpath = "//textarea[@name='to']")
		private WebElement mailTo;
		
		@FindBy(xpath = "//input[@name='subjectbox']")
		private WebElement mailSubject;
		
		@FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
		private WebElement mailBody;
		
		@FindBy(xpath = "//div[. = 'Send']")
		private WebElement sendbtnclick;
		
		//initialization
		public GmailComposePomClass (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilization
		public void gmalcomposebtn()
		{
			Composebtn.click();
		}
		public void ComposemailTo(String emailaddress)
		{
			mailTo.sendKeys(emailaddress);
		}
		public void ComposemailSubject(String emailsubject)
		{
			mailSubject.sendKeys(emailsubject);
		}
		public void Composemailbody(String emailbody)
		{
			mailBody.sendKeys(emailbody);
		}
		public void ComposemailSendbtn()
		{
			sendbtnclick.click();
		}

}
