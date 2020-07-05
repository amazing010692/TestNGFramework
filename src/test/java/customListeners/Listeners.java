package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("This is a Passed Test -- " + result.getName());	
	}

	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href = \"C:\\Users\\hello\\Documents\\Java_Tests\\"
				+ "Selenium_WebDriverManager_Tests\\screenshot\\error.jpg\" target = \"_blank\">Screenshot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href = \"C:\\Users\\hello\\Documents\\Java_Tests\\"
				+ "Selenium_WebDriverManager_Tests\\screenshot\\error.jpg\" target = \"_blank\">"
				+ "<img height= 200 width = 200 src = \"C:\\Users\\hello\\"
				+ "Documents\\Java_Tests\\Selenium_WebDriverManager_Tests\\screenshot\\error.jpg\"></a>");
		System.out.println("Capturing screenshot for the Failed Test -- " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
