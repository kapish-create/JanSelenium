package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementDisplayed {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil browser = new BrowserUtil();

		driver = browser.initDriver("chrome");

		browser.lauchUrl("https://demo.opencart.com/index.php?route=account/login");

		By emialId = By.id("input-email");
		ElementUtils eleUtils = new ElementUtils(driver);
		boolean flag = eleUtils.isElemenetDisplayed(emialId);
		System.out.println("Is element displayed in the dom :" + flag);

	}

}
