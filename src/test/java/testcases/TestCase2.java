package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validateTitles() {
		String expected_title = "Yahoo.com";	//excel
		String actual_title = "Gmail.com";		//selenium
		
		/*if(expected_title.equals(actual_title)) {
			System.out.println("Test Case Passed.");
		} else {
			System.out.println("Test Case Failed.");
		}*/
		
		/*//Compare an actual result vs expected result.
		Assert.assertEquals(actual_title, expected_title);*/
		
		//isElementPresent("xpath") - True, False
		Assert.assertTrue(false, "Element not found.");
	}

}
