package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "/Users/bala/Desktop/Insurance/mip/mip_libraries/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		FileInputStream fis = new FileInputStream("/Users/bala/Desktop/Insurance/Excel/Demo.xlsx");
		
			Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet(null);
		 
		  Row r = sh.getRow(0);
		 Cell c = r.getCell(0);
		 
		String v = c.toString();
		System.out.println(v);

	}

}
