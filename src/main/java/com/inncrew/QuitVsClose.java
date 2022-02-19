package selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("Page url :" + driver.getCurrentUrl());
		System.out.println("Page Title :" + driver.getTitle());
		driver.quit();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("Page url :" + driver.getCurrentUrl());
		System.out.println("Page Title :" + driver.getTitle());
//		No such session exception, Are using driver after quit

	}

}
