package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "dp1")
	public static Object[][] getData(Method m) {
		
		//Apply the method name from the LoginTest.java file.
		Object[][] data = null;
		if(m.getName().equals("testLogin")) {
			data = new Object[2][2];
			
			data[0][0] = "janielle";
			data[0][1] = "password123";
			
			data[1][0] = "jangreg";
			data[1][1] = "password321";
			
		} else if (m.getName().equals("testUserReg")) {
			
			data = new Object[2][3];
			
			data[0][0] = "janielle";
			data[0][1] = "gregorio";
			data[0][2] = "test@gmail.com";
			
			data[1][0] = "jangreg";
			data[1][1] = "jjsg";
			data[0][1] = "test1@outlook.com";
		}
		
		return data;

	}
	
	/*@DataProvider(name = "dp2")
	public static Object[][] getData2() {
		
		//Create an object array for 2 rowns and 2 columns.
		Object[][] data = new Object[2][3];
		
		data[0][0] = "janielle";
		data[0][1] = "gregorio";
		data[0][2] = "test@gmail.com";
		
		data[1][0] = "jangreg";
		data[1][1] = "jjsg";
		data[0][1] = "test1@outlook.com";
		
		return data;

	}*/

}
