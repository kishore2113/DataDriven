package org.datadriven;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookMultipleLogin {
	public static void main(String[] args) throws IOException {
		List<String> ls = new LinkedList<String>();
		ls.add("Kishore");
		ls.add("Akalya");
		ls.add("Bhuvanesh");
		ls.add("Ram");
		ls.add("Pooja");
		List<String> li = new LinkedList<String>();
		li.add("123456");
		li.add("456789");
		li.add("147852");
		li.add("369852");
		li.add("748596");
		li.add("456987");
		File file = new File("C:\\Users\\Kishore\\eclipse-workspace\\MavenProject\\DataDriven\\Login.xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet createSheet = book.createSheet("Facebook");
		for (int i = 0; i < 5; i++) {
			book.getSheet("Facebook").createRow(i).createCell(0).setCellValue(ls.get(i));
			book.getSheet("Facebook").getRow(i).createCell(1).setCellValue(li.get(i));
			}
		
				FileOutputStream f= new FileOutputStream(file);
				book.write(f);
	for (int i = 0; i < 5; i++) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys(ls.get(i));
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(li.get(i));
		WebElement btnClick = driver.findElement(By.id("loginbutton"));
	btnClick.click();
	driver.close();
	driver.quit();

		
	}	
		
	}




}
