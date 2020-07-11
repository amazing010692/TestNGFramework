package testNGListenerOnFailure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		if(driver == null) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			//Pre-conditions | Maximize the browser and apply implicit waits.
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Navigate to this site for sample checkbox.
			driver.get("https://facebook.com");
			System.out.println("TITLE: " + driver.getTitle() + " | URL: " + driver.getCurrentUrl());
		}
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
