package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation {
	
	@Test(invocationCount = 5)
	public void executeTest() {
		System.out.println("Launching Chrome browser");
	}

}
