package com.inncrew;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/england-tour-of-west-indies-2021-22-1256716/west-indies-vs-england-5th-t20i-1256724/full-scorecard");

		System.out.println(getBatsManScoreDetailsByName("Brandon King"));
		System.out.println(getBolwerPerformanceDetailsByName("Reece Topley"));

	}

	public static List<String> getBatsManScoreDetailsByName(String batsmanName) {
		List<WebElement> batsManDetails = driver
				.findElements(By.xpath("//a[text()='" + batsmanName + "']/parent::td/following-sibling::td"));
		List<String> scoreValues = new ArrayList<String>();
		for (WebElement e : batsManDetails) {
			String text = e.getText();
			scoreValues.add(text);
		}
		return scoreValues;

	}

	public static List<String> getBolwerPerformanceDetailsByName(String bolwerName) {
		List<WebElement> bolwerDetails = driver
				.findElements(By.xpath("(//a[text()='" + bolwerName + "'])[1]/parent::td/following-sibling::td"));
		List<String> bowlerPerformance = new ArrayList<String>();
		for (WebElement e : bolwerDetails) {
			String text = e.getText();
			bowlerPerformance.add(text);
		}
		return bowlerPerformance;

	}

}
