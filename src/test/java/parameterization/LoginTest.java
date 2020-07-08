package parameterization;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProvider = "dp1")
	//Add arguments based on the columns.
	public void testData(String username, String password) {
		System.out.println(username + "---" + password);
	}

}
