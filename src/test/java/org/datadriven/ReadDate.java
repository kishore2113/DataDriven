package org.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDate {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\Kishore.xlsx");
		FileInputStream f = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(f);
		Sheet sheet = book.getSheet("Sheet2");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				switch (cellType) {
				case STRING:
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"\t");
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
						String format = d.format(date);
						System.out.print(format+"\t");

					} else {
						double numericCellValue = cell.getNumericCellValue();
						long l=(long)numericCellValue;
						System.out.print(l+"\t");
					}

					break;

				default:
					break;
				}
			}
System.out.println();
		}

	}
}
