package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	@Test
	public void validateTitles() {
		System.out.println("Beginning");
		
		String expected_title = "Yahoo.com";	//excel
		String actual_title = "Gmail.com";		//selenium
		
		/*if(expected_title.equals(actual_title)) {
			System.out.println("Test Case Passed.");
		} else {
			System.out.println("Test Case Failed.");
		}*/
		
		SoftAssert softAssert = new SoftAssert();
		
		//Compare an actual result vs expected result.
		System.out.println("Validating title.");
		softAssert.assertEquals(actual_title, expected_title);
		
		/*//isElementPresent("xpath") - True, False
		Assert.assertTrue(false, "Element not found.");*/
		
		System.out.println("Validating image.");
		softAssert.assertEquals(true, false, "Image not present.");
		
		System.out.println("Validating Text box presence.");
		softAssert.assertEquals(true, false, "Text box not present.");
		
		/*//Forcefully fail a test case.
		Assert.fail("Failing the test as the condition is not met.");*/
		
		System.out.println("Ending");
		
		softAssert.assertAll();
	}

}
