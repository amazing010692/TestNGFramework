package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {
	
	@Test
	public void doLogin() {
		Assert.fail("Failing the Login Test");
		System.out.println("Capture screenshot");
	}

}
