package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	@DataProvider
	public Object[][] getData() {
		//Create an object array with total number of rows and columns.
		Object[][] data = new Object[3][2];
		
		data[0][0] = "trainer@way2automation.com";
		data[0][1] = "testpass123";
		
		data[1][0] = "seleniumcoaching@gmail.com";
		data[1][1] = "testpass123";
		
		data[2][0] = "java@way2automation.com";
		data[2][1] = "testpass123";
		
		return data;
	}

}