package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil browser = new BrowserUtil();

		WebDriver driver = browser.initDriver("chrome");

		browser.lauchUrl("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(browser.getPageTitle());
		
		By register=By.linkText("Register");
		
		ElementUtils eleUtils = new ElementUtils(driver);
		eleUtils.doClick(register);
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.name("email");
		By telephone=By.id("input-telephone");
		By password=By.id("input-password");
		By confirmPwd=By.id("input-confirm");
		eleUtils.passValue(firstName, "Kapish");
		eleUtils.passValue(lastName, "Pandey");
		eleUtils.passValue(email, "kapish@gmail.com");
		eleUtils.passValue(telephone, "1234567890");
		eleUtils.passValue(password, "Kapish123");
		eleUtils.passValue(confirmPwd, "Kapish123");

		

	}

}
