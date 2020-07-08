package parameterization;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "dp1")
	public static Object[][] getData() {
		
		//Create an object array for 2 rowns and 2 columns.
		Object[][] data = new Object[2][2];
		return data;
		
	}

}
