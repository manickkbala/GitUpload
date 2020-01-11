package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSentPage {
	
	//Declaration
	@FindBy(xpath = "//a[.='Sent']")
	private WebElement sentbtn;
		
		@FindBy(xpath = "//a")
		private List<WebElement> sentpagelinks;
			
	//initialization
		public GmailSentPage (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			
	//Utilization
		public void sentbutton()
		{
			sentbtn.click();
		}
			
		public void gmailsentlinks()
		{
			int count = sentpagelinks.size();
			System.out.println("The total count is "+count);
			
			for( WebElement linkstext :sentpagelinks)
			{
				System.out.println("name of the links "+ linkstext);
			}
		}

}
