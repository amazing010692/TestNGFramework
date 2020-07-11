package testNGListenerOnFailure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public void setUp() {
		if(driver == null) {
			driver = new FirefoxDriver();
			driver.get("https://gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	}
	
	public void tearDown() {
		
	}

}
