package org.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpdateData {
	public static void main(String[] args) throws IOException {
		BaseClass c=new BaseClass();
		c.replacexcl("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\Kishore.xlsx", "Sheet1", 1, 1, "CHENNAI", "CHEYYAR");
	}
	}


