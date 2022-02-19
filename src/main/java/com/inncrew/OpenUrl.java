package com.inncrew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenUrl {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		By userName = By.id("user-name");
		By password = By.id("password");
		By button = By.id("login-button");
		By productPrice = By.xpath("//div[@class='inventory_item_price']");

		WebElement userN = driver.findElement(userName);
		WebElement pass = driver.findElement(password);
		userN.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");

		driver.findElement(button).click();
		List<WebElement> prodPric = driver.findElements(productPrice);
		List<Double> priceListItem = new ArrayList<Double>();
		double maxPrice = 0.0;
		for (WebElement items : prodPric) {
			String priceList = items.getText().replace("$", "");
			double values = Double.parseDouble(priceList);
			priceListItem.add(values);

			System.out.println(values);

		}
		maxPrice = Collections.max(priceListItem);
		System.out.println("Max price=" + maxPrice);
		By cartButton = By
				.xpath("//div[normalize-space()='$" + maxPrice + "']/following-sibling::button[text()='Add to cart']");
		driver.findElement(cartButton).click();

	}
}
