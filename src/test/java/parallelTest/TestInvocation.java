package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	
	@Test(invocationCount = 5)
	public void executeTest() {
		driver = getDriver("chrome");
		driver.get("https://google.com");
		System.out.println("TITLE: " + driver.getTitle() + " | URL: " + driver.getCurrentUrl());
		driver.quit();
	}

}
