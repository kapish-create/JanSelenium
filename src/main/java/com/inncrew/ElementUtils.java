package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {

	private WebDriver driver;

	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDomElement(By locator) {
		return driver.findElement(locator);
	}

	public void passValue(By locator, String value) {
		getDomElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getDomElement(locator).click();
	}
	public String doGetText(By loctor) {
		 return getDomElement(loctor).getText();
	}
	
	public boolean isElemenetDisplayed(By locator) {
		return getDomElement(locator).isDisplayed();
	}
	
	public boolean isElemenetEnabled(By locator) {
		return getDomElement(locator).isEnabled();
	}

	public boolean isElemenetSelected(By locator) {
		return getDomElement(locator).isSelected();
	}

}
