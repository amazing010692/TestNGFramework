package testNGListenerOnFailure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test
	public void doLogin() throws InterruptedException {
		//Input email address.
		Thread.sleep(3000);
		WebElement fieldEmail = driver.findElement(By.xpath("//*[@id='email']"));
		fieldEmail.sendKeys("test_email@gmail.com");
		System.out.println("TC1 - Successfully inputted email address.");
	}

}
