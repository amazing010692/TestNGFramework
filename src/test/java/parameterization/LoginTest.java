package parameterization;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp1")
	//Add arguments based on the columns.
	public void testLogin(String username, String password) {
		System.out.println(username + "---" + password);
	}
	
	@Test(dataProviderClass = DataProviders.class, dataProvider = "dp1")
	//Add arguments based on the columns.
	public void testUserReg(String fName, String lName, String email) {
		System.out.println(fName + "---" + lName + "---" + email);
	}

}
