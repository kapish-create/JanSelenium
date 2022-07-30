package seleniumbascis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());

	}

}
