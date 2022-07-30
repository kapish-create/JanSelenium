package seleniumbascis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCore {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("The title of the page : " + title);
		
		
		if(title.equals("Account Login")) {
			System.out.println("Title of the page is correct---");
		}
		else {
			System.out.println("Title of the page is incorrect---");
		}

	}

}
