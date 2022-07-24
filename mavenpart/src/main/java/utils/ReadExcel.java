package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		String filelocation = "./test-data/Logindata.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(filelocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int LastrowNum = sheet.getLastRowNum();
		int PhysicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("No.of Rows :" +LastrowNum);
		System.out.println("Inclusive of header : "+ PhysicalNumberOfRows);
		short lastcellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("No.of cells :" +lastcellNum);
		/* XSSFSheet sheet = wbook.getSheetAt(0); */
		for (int i = 1; i <=LastrowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastcellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
		}  wbook.close(); 

	}

}
