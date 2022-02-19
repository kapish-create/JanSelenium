package selenium.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationInBrowser {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("Page url :" + driver.getCurrentUrl());
		System.out.println("Page Title :" + driver.getTitle());
		driver.navigate().to("https://www.programiz.com/java-programming/examples");
		System.out.println("Page url :" + driver.getCurrentUrl());
		System.out.println("Page Title :" + driver.getTitle());
		driver.navigate().back();
		System.out.println("Page url :" + driver.getCurrentUrl());
		System.out.println("Page Title :" + driver.getTitle());
		driver.navigate().forward();
		System.out.println("Page url :" + driver.getCurrentUrl());
		System.out.println("Page Title :" + driver.getTitle());
		driver.navigate().refresh();
		
		

	}

}
