package org.datadriven;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebElement;
public class AdactinAutomationTask extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		AdactinAutomationTask adactin = new AdactinAutomationTask();

		adactin.getdriver();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		adactin.launchUrl("https://adactinhotelapp.com/");

		String readxclSingleValue = adactin.readxclSingleValue("Adactin", 1, 0);
		WebElement locators2 = adactin.Locators("id", "username");
		locators2.sendKeys(readxclSingleValue);

		String readxclSingleValue2 = adactin.readxclSingleValue("Adactin", 1, 1);
		WebElement locators = adactin.Locators("id", "password");
		adactin.sendvalue(locators, readxclSingleValue2);

		adactin.Locators("id", "login").click();
		WebElement location = adactin.Locators("id", "location");
		adactin.ddSelectByIndex(location, 2);
		
		WebElement hotel = adactin.Locators("id", "hotels");
		String hotels = adactin.readxclSingleValue("Adactin", 1, 3);
		adactin.ddSelectByVisibleText(hotel, hotels);
		
		WebElement roomType = adactin.Locators("id", "room_type");
		String room = adactin.readxclSingleValue("Adactin", 1, 4);
		adactin.ddSelectByValue(roomType, room);
		WebElement roomNo = adactin.Locators("id", "room_nos");
		adactin.ddSelectByIndex(roomNo, 2);

		WebElement checkInDate = adactin.Locators("id", "datepick_in");
		checkInDate.clear();
		String checkin = adactin.readxclSingleValue("Adactin", 1, 6);
		adactin.sendvalue(checkInDate, checkin);

		WebElement checkOutDate = adactin.Locators("id", "datepick_out");
		checkOutDate.clear();
		String checkout = adactin.readxclSingleValue("Adactin", 1, 7);
		adactin.sendvalue(checkOutDate, checkout);

		WebElement adultRoom = adactin.Locators("id", "adult_room");
		adactin.ddSelectByIndex(adultRoom, 2);

		WebElement childRoom = adactin.Locators("id", "child_room");
		adactin.sendvalue(childRoom, "2 - Two");

		adactin.Locators("id", "Submit").click();
		adactin.Locators("id", "radiobutton_0").click();
		adactin.Locators("id", "continue").click();
		WebElement firstName = adactin.Locators("id", "first_name");
		String name = adactin.readxclSingleValue("Adactin", 1, 10);
		adactin.sendvalue(firstName, name);
		WebElement lastName = adactin.Locators("id", "last_name");
		String name2 = adactin.readxclSingleValue("Adactin", 1, 11);
		adactin.sendvalue(lastName, name2);
		WebElement address = adactin.Locators("id", "address");
		String adres = adactin.readxclSingleValue("Adactin", 1, 12);
		adactin.sendvalue(address, adres);
		WebElement card = adactin.Locators("id", "cc_num");
		String cardNo = adactin.readxclSingleValue(
				"Adactin", 1, 13);
		adactin.sendvalue(card, cardNo);
		WebElement cardtype = adactin.Locators("id", "cc_type");
		adactin.ddSelectByIndex(cardtype, 2);
		WebElement month = adactin.Locators("id", "cc_exp_month");
		adactin.ddSelectByIndex(month, 2);
		WebElement year = adactin.Locators("id", "cc_exp_year");
		adactin.ddSelectByIndex(year, 12);
		WebElement cvv = adactin.Locators("id", "cc_cvv");
		adactin.sendvalue(cvv, "123");
		adactin.Locators("id", "book_now").click();
		adactin.staticWait(8000);
		WebElement orderId = adactin.Locators("id", "order_no");
		adactin.staticWait(8000);
		String attribute = orderId.getAttribute("value");
		adactin.writexcl("C:\\Users\\nagav\\eclipse-workspace\\OrderId.xlsx", "OrderId", 2,
				0, attribute);
		System.out.println(attribute);

	}

	
}
