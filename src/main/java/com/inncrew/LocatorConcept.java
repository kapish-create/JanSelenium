package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

//		First Approach
//		driver.findElement(By.id("input-email")).sendKeys("Kapish@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("1234567");

//		Second Approach
//		WebElement userName=driver.findElement(By.id("input-email"));
//		WebElement pwd=driver.findElement(By.id("input-password"));
//		userName.sendKeys("Kapish.pandey");
//		pwd.sendKeys("1234567");

//		Third Approach
//		By userName=By.id("input-email");
//		By pwd=By.id("input-password");
//		driver.findElement(userName).sendKeys("Kapish@gmail.com");
//		driver.findElement(pwd).sendKeys("1234567");

//		Fourth Approach
//		By userName=By.id("input-email");
//		By pwd=By.id("input-password");
//		WebElement eId=driver.findElement(userName);
//		WebElement pd=driver.findElement(pwd);
//		eId.sendKeys("Kapish@gmail.com");
//		pd.sendKeys("1234567");

//		Fifth Approach Generic method
//		By userName = By.id("input-email");
//		By pwd = By.id("input-password");
//		getDomElement(userName).sendKeys("Kapish@gmail.com");
//		getDomElement(pwd).sendKeys("1234567");
		
		
//		Sixth Approach
//		By userName = By.id("input-email");
//		By pwd = By.id("input-password");
//		passValue(userName, "Kapish@gmail.com");
//		passValue(pwd, "1234567");
		
		
		
//		Seven Approach
		By userName = By.id("input-email");
		By pwd = By.id("input-password");
		ElementUtils eleUtils= new ElementUtils(driver);
		eleUtils.passValue(userName, "Kapish@gmail.com");
		eleUtils.passValue(pwd, "1234567");
		
		
		
	}
    


}
