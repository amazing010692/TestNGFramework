package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	
	@Test(priority = 1)
	public void doLogin() {
		System.out.println("Executing Login Test");
	}
	
	@Test(priority = 2)
	public void registerUsers() {
		Assert.fail("Execution Failed While Registering a User");
	}

}
