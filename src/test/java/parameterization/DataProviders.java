package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test(dataProvider = "dp1")
	//Add arguments based on the columns.
	public void testData(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
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
