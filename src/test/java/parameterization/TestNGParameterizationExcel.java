package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
	
	@Test(dataProvider = "getData")
	public void testData() {
		
	}
	
	@DataProvider
	public static Object[][] getData() {
		//Create an object array with total number of rows and columns.
		Object[][] data = new Object[3][2];
		return data;
		
	}

}
