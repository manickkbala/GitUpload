package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Gmail {
	public WebDriver driver;
	
	@Test(priority = 0)
	public void gmailloginout() throws InterruptedException
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		
		GmailLoginUsernamepagePomClass gp = new GmailLoginUsernamepagePomClass(driver);
		gp.setuname("bala@digbihealth.com");
		gp.Unnxtbtn();
		Thread.sleep(2000);

		GmailLoginPasswordPagePomClass gp2 = new GmailLoginPasswordPagePomClass(driver);
		gp2.setpwd("9092292290");
		gp2.pwnxtbtn();
		Thread.sleep(2000);
		
		GmailLogoutPomClass gp3 = new GmailLogoutPomClass(driver);
		gp3.clickusrnmelogo();
		gp3.clicksignoutbtn();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(5000);
	}
	
//	@Test(priority = 0)
//	public void gmailcompose() throws InterruptedException
//	{
//		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
//		driver = new FirefoxDriver();
//		driver.get("https://www.gmail.com/");
//		GmailLoginUsernamepagePomClass gp = new GmailLoginUsernamepagePomClass(driver);
//		gp.setuname("bala@digbihealth.com");
//		gp.Unnxtbtn();
//		Thread.sleep(2000);
//		
//		GmailLoginPasswordPagePomClass gp2 = new GmailLoginPasswordPagePomClass(driver);
//		gp2.setpwd("9092292290");
//		gp2.pwnxtbtn();
//		Thread.sleep(2000);
//		
//		GmailComposePomClass gp4 = new GmailComposePomClass(driver);
//		gp4.gmalcomposebtn();
//		gp4.ComposemailTo("balatester2014@gmail.com");
//		Thread.sleep(1000);
//		gp4.ComposemailSubject("test subject");
//		Thread.sleep(1000);
//		gp4.Composemailbody("test body");
//		Thread.sleep(1000);
//		gp4.ComposemailSendbtn();
//		Thread.sleep(2000);
//
//		
//		GmailLogoutPomClass gp3 = new GmailLogoutPomClass(driver);
//		gp3.clickusrnmelogo();
//		gp3.clicksignoutbtn();
//		Thread.sleep(2000);
//		driver.close();
//
//	}
	
	@Test(priority = 0)
	public void GmailSentPage() throws InterruptedException
	{
		System.setProperty ("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		GmailLoginUsernamepagePomClass gp = new GmailLoginUsernamepagePomClass(driver);
		gp.setuname("bala@digbihealth.com");
		gp.Unnxtbtn();
		Thread.sleep(2000);
		
		GmailLoginPasswordPagePomClass gp2 = new GmailLoginPasswordPagePomClass(driver);
		gp2.setpwd("9092292290");
		gp2.pwnxtbtn();
		Thread.sleep(2000);
		
		GmailSentPage gp5 = new GmailSentPage(driver);
		gp5.sentbutton();
		gp5.gmailsentlinks();
		Thread.sleep(2000);
		
		GmailLogoutPomClass gp3 = new GmailLogoutPomClass(driver);
		gp3.clickusrnmelogo();
		gp3.clicksignoutbtn();
		Thread.sleep(2000);
		driver.close();

	}


}
