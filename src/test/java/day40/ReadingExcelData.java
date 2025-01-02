package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File ----> workBook ---> Sheets ---> Rows ---> Cells

public class ReadingExcelData {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println(totalRows + "--->" + totalCells);
		for(int r = 0 ; r <= totalRows ; r++) {
			XSSFRow row = sheet.getRow(r);
			for(int c = 0 ; c < totalCells ; c++) {
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString() + "	");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
	}
}
