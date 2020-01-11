package parallelexec;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Generic {
	
	@Parameters({"city"})
	@Test
	public void type_cat(String city)
	{
		Reporter.log(city, true);
	}

}
