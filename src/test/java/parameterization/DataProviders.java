package parameterization;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "dp1")
	public static Object[][] getData() {
		
		//Create an object array for 2 rowns and 2 columns.
		Object[][] data = new Object[2][2];
		
		data[0][0] = "janielle";
		data[0][1] = "password123";
		
		data[1][0] = "jangreg";
		data[1][1] = "password321";
		
		return data;
		
	}

}
