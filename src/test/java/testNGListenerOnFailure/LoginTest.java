package testNGListenerOnFailure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test(priority = 1)
	public void doLogin() throws InterruptedException {
		//Input email address. This will fail because of invalid xpath inputted.
		Thread.sleep(3000);
		WebElement fieldEmail = driver.findElement(By.xpath("//*[@id='email_invalid']"));
		fieldEmail.sendKeys("test_email@gmail.com");
		System.out.println("TC1 - Successfully inputted email address.");
	}
	
	@Test(priority = 2)
	public void composeEmail() {
		Assert.fail("Error in composing email");
	}

}
