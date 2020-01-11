package GenericMethods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constants{
	
	
	public static String getdata(String sheetname, int rowvalue, int cellvalue)
	{
		String value = "";
		try {
			
		FileInputStream fis = new FileInputStream(EXCEL_PATH);
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 Sheet sh = wb.getSheet(sheetname);
		 
		 Row r = sh.getRow(rowvalue);
		 
		 Cell c = r.getCell(cellvalue);	
		 
		 value = c.toString();
		    
		}
		catch(Exception e) 
		{
			
		}
		
		return value;
	}

}
