package testcases;

import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing User Registration test");
	}
	
	@Test(priority = 2)
	public void doLogin() {
		System.out.println("Executing login test");
	}

}