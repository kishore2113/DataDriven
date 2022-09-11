package org.datadriven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FlipkartTask extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		FlipkartTask f = new FlipkartTask();
		f.getdriver();
		f.launchUrl("https://www.flipkart.com/");
		f.getCurrentUrl();
		f.Locators("xpath", "//button[@class='_2KpZ6l _2doB4z']").click();
		f.Locators("xpath", "//input[@class='_3704LK']").sendKeys("iphone 13 pro", Keys.ENTER);
		f.staticWait(7000);
		List<WebElement> name = f.locatorss("//div[contains(text(),'APPLE')]/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1']");
		for (int i = 1; i < name.size(); i++) {
			WebElement webElement = name.get(i);
			String text = webElement.getText();
			f.writexcl("D:\\kishore.xlsx", "kishore", i, 0, text);
		}
		System.out.println("DEVELOPER");
	}
}
