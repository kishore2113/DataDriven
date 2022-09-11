package org.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDay1 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\Kishore.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book= new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
		}
			
		}


