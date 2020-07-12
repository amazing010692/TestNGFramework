package testNGListenerOnFailure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test
	public void doLogin() {
		//Input email address.
		WebElement fieldEmail = driver.findElement(By.xpath("//*[@id='email']"));
		fieldEmail.sendKeys("test_email@gmail.com");
		System.out.println("Successfully inputted email address.");
	}

}
