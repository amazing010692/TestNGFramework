package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider = "getData")
	public void testData(Hashtable<String, String> data) {
		System.out.println(username + "---" + password + "---" + is_correct);
	}
	
	//Hashtable
	
	
	@DataProvider
	public static Object[][] getData() {
		
		if(excel == null) {
			//Path of Excel file reference.
			excel = new ExcelReader("C:\\Users\\hello\\Documents\\testngdata.xlsx");
		}
		
		//Get the total number of rows and columns.
		String sheetName = "loginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		//Create an object array with total number of rows and columns.
		Object[][] data = new Object[rows - 1][1];
		
		//Loop to run on rows and columns.
		for(int rowNum = 2; rowNum <= rows; rowNum++) {
			for(int colNum = 0; colNum < cols; colNum++) {
				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
		
	}

}
