package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil browser = new BrowserUtil();

		WebDriver driver = browser.initDriver("chrome");

		browser.lauchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(browser.getPageTitle());

		By userName = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtils eleUtils = new ElementUtils(driver);

		eleUtils.passValue(userName, "Kapish@gmail.com");
		eleUtils.passValue(pwd, "1234567");

	}

}
