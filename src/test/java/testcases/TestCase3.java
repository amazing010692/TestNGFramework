package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing User Registration test");
		Assert.fail("User not registered successfully.");
	}
	
	@Test(priority = 2)
	public void doLogin() {
		System.out.println("Executing login test");
	}

}