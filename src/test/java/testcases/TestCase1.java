package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {

	@BeforeTest
	public void creatingDBConn() {
		System.out.println("Creating DB connection");
	}

	@AfterTest
	public void closingDBConn() {
		System.out.println("Closing DB connection");
	}

	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Launching the Browser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing the Browser");
	}

	@Test(priority = 1, groups = "functional")
	public void doUserReg() {
		try {
			System.out.println("Executing User Registration test");
		} catch (Throwable t) {
			System.out.println("Capturing Screenshot");
		}
	}

	@Test(priority = 2, groups = "functional")
	public void doLogin() {
		try {
			System.out.println("Executing login test");
		} catch (Throwable t) {
			System.out.println("Capturing Screenshot");
		}
	}

}