package seleniumbascis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitClose {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("The title of the page : " + title);
		String pageUrl=driver.getCurrentUrl();
		System.out.println("The current page url "+ pageUrl);
//		driver.quit();
//		Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()
		driver.close();
//		Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid Session ID. Using WebDriver after calling close()
		title = driver.getTitle();
		System.out.println("The title of the page : " + title);
		

	}

}
