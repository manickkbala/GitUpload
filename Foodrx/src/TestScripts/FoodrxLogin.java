package TestScripts;

import org.testng.annotations.Test;

import GenericMethods.Excel;
import GenericMethods.Generic_test;
import Pom.Login_Page;


public class FoodrxLogin extends Generic_test{
	
	
	@Test
	public void login() throws InterruptedException
	{
		String unm = Excel.getdata("Sheet1", 1, 0);
		String pww = Excel.getdata("Sheet1", 1, 1);

		
		Login_Page lp = new Login_Page(driver);
		Thread.sleep(5000);
		
		lp.enteruname(unm);
		Thread.sleep(5000);
		
		lp.enterpwd(pww);
		Thread.sleep(5000);
		
		lp.loginbutton();
		Thread.sleep(5000);

	}

}
