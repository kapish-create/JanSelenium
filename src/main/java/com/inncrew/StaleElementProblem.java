package com.inncrew;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementProblem {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		List<WebElement> footerLinks = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));

		for (int i = 0; i < footerLinks.size(); i++) {
			footerLinks.get(i).click();
			String pageTitle = driver.getTitle();

			System.out.println("Page Title = " + pageTitle);
			driver.navigate().back();

			footerLinks = driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
//			System.out.println("Page Title = "pageTitle);
		}

	}

}
