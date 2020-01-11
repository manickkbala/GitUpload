package foodrx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UsersMenu extends Login {
	
	@Test (groups = { "rolechange","Coachchange" })
	public void ausers() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Users']")).click();	
		Thread.sleep(5000);
		Reporter.log("click on users menu", true);
	}
		
	@Test (groups = { "rolechange","Coachchange"  })
	public void bsearchusers() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(seacrchemail);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Reporter.log("searchusers", true);
		Thread.sleep(5000);
	}
	
	@Test (groups = { "rolechange" })
	public void clickeditbutton() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[.='Edit']")).click();
	    Thread.sleep(5000);
		Reporter.log("click edit button", true);
	}
	
	@Test (groups = { "rolechange" })
	public void dselectdropdownOption() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//select[@id='user_type']"));
		Select s = new Select(ele);
		s.selectByVisibleText(role);
		Reporter.log("click option is pass", true);
	    Thread.sleep(2000);
	}
	@Test (groups = { "rolechange" })
	public void esubmit() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
		Reporter.log("submit buttom is passed");
	    Thread.sleep(2000);

	}
	@Test (groups = { "Coachchange" })
	public void fmapcoach() throws InterruptedException
	{
		driver.findElement(By.xpath("(//a[. = 'Map Health Coach'])[2]")).click();;
		Reporter.log("click on MapHelathCoach button is passed");
	    Thread.sleep(2000);

	}
	@Test (groups = { "Coachchange" })
	public void gselectcoach() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"user_user_relation[relative_user_id]\"]"));
		dropdown.click();
		Reporter.log("click on dropdown is passed");
		Select s = new Select(dropdown);
		s.selectByVisibleText(selectcoach);
		Reporter.log("selecet coach is passed");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		Reporter.log("Save button click is passed");
		Thread.sleep(2000);
	}
	
}
