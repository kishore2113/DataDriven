package org.datadriven;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\AK.xlsx");
	Workbook book= new XSSFWorkbook();
	Sheet createSheet = book.createSheet();
	Row createRow = createSheet.createRow(1);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Kishore");
	FileOutputStream f=new FileOutputStream(file);
	book.write(f);

	}
}
