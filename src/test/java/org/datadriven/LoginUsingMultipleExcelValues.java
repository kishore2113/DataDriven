package org.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUsingMultipleExcelValues {
	public static void main(String[] args) throws IOException, InterruptedException {
		for (int i = 0; i < 5 ; i++) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			File file = new File("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\Login.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet("Facebook");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String stringCellValue = cell.getStringCellValue();
			WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys(stringCellValue);
			
			File file1 = new File("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\Login.xlsx");
			FileInputStream stream1 = new FileInputStream(file1);
			Workbook book1 = new XSSFWorkbook(stream1);
			Sheet sheet1 = book1.getSheet("Facebook");
			Row row1 = sheet1.getRow(i);
			Cell cell1 = row1.getCell(1);
			String stringCellValue1 = cell1.getStringCellValue();
			WebElement userName1 = driver.findElement(By.id("pass"));
			userName1.sendKeys(stringCellValue1,Keys.ENTER);
			Thread.sleep(6000);
			
			
			
		}


			
			
			
		}
	

}
