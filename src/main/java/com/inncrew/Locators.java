package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil browser = new BrowserUtil();

		driver = browser.initDriver("chrome");

		browser.lauchUrl("https://demo.opencart.com/index.php?route=account/login");
//		Name locators
		By emailId=By.name("email");
		By password=By.name("password");
		ElementUtils eleUtil=new ElementUtils(driver);
		eleUtil.passValue(emailId, "Kapish@gmail.com");
		eleUtil.passValue(password, "kap123456");
		
//		className locators
		
		
		
		
		
		

	}

}
