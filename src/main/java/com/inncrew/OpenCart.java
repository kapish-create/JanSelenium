package com.inncrew;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By logginButton = By.xpath("//input[@value='Login']");
		By productPrice = By.xpath("//p[@class='price']/span");
		By search = By.name("search");
		By seatchButton = By.xpath("//span[@class='input-group-btn']");
		WebElement userN = driver.findElement(emailId);
		WebElement pass = driver.findElement(password);
		userN.sendKeys("pkapish95@gmail.com");
		pass.sendKeys("Kp@12345");

		driver.findElement(logginButton).click();
		
		driver.findElement(search).sendKeys("macbook");
		driver.findElement(seatchButton).click();
		
//		double highestPrice = 0.0;
		List<WebElement> priceList = driver.findElements(productPrice);
		System.out.println("price list");
		List<Double> priceListValue = new ArrayList<Double>();
		for (WebElement items : priceList) {
			String priceValue = items.getText().replace("Ex Tax: $", "");
			System.out.println(priceValue);
			double values = Double.parseDouble(priceValue);
			priceListValue.add(values);

//			System.out.println(values);

		}
		System.out.println(priceListValue);
//		highestPrice = Collections.max(priceListValue);
//		System.out.println("Max price=" + highestPrice);
//
//		By addToCart = By.xpath("//p[@class='price']/span[contains(text(), 'Ex Tax: $" + highestPrice
//				+ "')]/parent::p/parent::div/following-sibling::div[@class='button-group']/button/span");
//		driver.findElement(addToCart).click();

	}
}
