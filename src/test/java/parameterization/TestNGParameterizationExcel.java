package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider = "getData")
	public void testData(String username, String password, String is_correct) {
		System.out.println(username + "---" + password + "---" + is_correct);
	}
	
	@DataProvider
	public static Object[][] getData() {
		
		if(excel == null) {
			//Path of Excel file reference.
			excel = new ExcelReader("C:\\Users\\hello\\Documents\\testngdata.xlsx");
		}
		
		//Get the total number of rows and columns.
		String sheetName = "loginTest";
		int rows = excel.getRowCount(sheetName);
		
		//Create an object array with total number of rows and columns.
		Object[][] data = new Object[2][3];
		return data;
		
	}

}
