package parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGParameterizationExcel {
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider = "getData")
	public void testData(Hashtable<String, String> data) {
		//System.out.println(username + "---" + password + "---" + is_correct);
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
		
		//Create an object of the Hashtable.
		Hashtable<String, String> table = null;
		
		//Loop to run on rows and columns.
		for(int rowNum = 2; rowNum <= rows; rowNum++) {
			// A hashtable will also be created for each row.
			table = new Hashtable<String, String>();
			
			for(int colNum = 0; colNum < cols; colNum++) {
				//data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
				
				//Way to put the data in a hashtable.
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				//Create a 2 dimensional array.
				data[rowNum - 2][0] = table;
			}
		}
		
		return data;
		
	}

}
