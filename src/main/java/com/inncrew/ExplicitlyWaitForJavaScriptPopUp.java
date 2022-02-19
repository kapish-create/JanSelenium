package com.inncrew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitForJavaScriptPopUp {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi/");

		By login = By.name("proceed");
		driver.findElement(login).click();
		
		waitForJsAlert(5);

	}

	public static Alert waitForJsAlert(long timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void acceptAlert(long timeOut) {
		waitForJsAlert(timeOut).accept();
	}
	
	public static void dismissAlert(long timeOut) {
		waitForJsAlert(timeOut).dismiss();
	}
	
	public static void alertSenKeysAlert(long timeOut,String values) {
		waitForJsAlert(timeOut).sendKeys(values);
	}

}
