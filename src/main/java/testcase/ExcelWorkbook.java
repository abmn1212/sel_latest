package testcase;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelWorkbook {

	public Object[][] readExcel(String fileName) throws IOException {

		XSSFWorkbook wBook =  new XSSFWorkbook("./Data/"+fileName+".xlsx");

		//Go to Sheet
		XSSFSheet sheet = wBook.getSheetAt(0);

		//Row count
		int rowCount = sheet.getLastRowNum();

		// Cell count
		short colCount = sheet.getRow(0).getLastCellNum();

		//read data
		Object[][] data = new Object[rowCount][colCount];
		for(int i=1; i<=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0; j<colCount; j++)
			{
				try {
					XSSFCell cell = row.getCell(j);
					data[i-1][j] = cell.getStringCellValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					data[i-1][j]="";
				}
				//System.out.println(data1);
			}
		}
		wBook.close();
		return data;
	}


}


