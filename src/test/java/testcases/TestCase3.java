package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing User Registration test");
		Assert.fail("User is not registered successfully.");
	}
	
	@Test(priority = 2, dependsOnMethods = {"doUserReg", "thirdTest"})
	public void doLogin() {
		System.out.println("Executing login test");
	}
	
	@Test(priority = 3)
	public void thirdTest() {
		System.out.println("Executing Third Test");
	}
	
	@Test(priority = 4)
	public void fourthTest() {
		System.out.println("Executing Fourth Test");
	}

}