package testNGListenerOnFailure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test
	public void doLogin() {
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("java@way2automation.com");
		
		WebElement nextButtonU = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span"));
		nextButtonU.click();
	}

}
