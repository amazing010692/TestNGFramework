package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test
	public void doLogin(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		return data;
	}

}
