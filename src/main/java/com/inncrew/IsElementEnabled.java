package selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsElementEnabled {

		
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			BrowserUtil browser = new BrowserUtil();

			driver = browser.initDriver("chrome");

			browser.lauchUrl("https://classic.freecrm.com/register/");

			By submit = By.id("submitButton");
			By agreeButoon = By.name("agreeTerms");
			
			ElementUtils eleUtils = new ElementUtils(driver);
			
			boolean isDisp = eleUtils.isElemenetDisplayed(submit);
			boolean isEna = eleUtils.isElemenetEnabled(submit);
			boolean isSelect=eleUtils.isElemenetSelected(agreeButoon);
			System.out.println("Is element displayed :" + isDisp);
			System.out.println("Is element enabled :" + isEna);
			System.out.println("Is element selected :" + isSelect);
			eleUtils.doClick(agreeButoon);
//			boolean isSelect=eleUtils.isElemenetSelected(agreeButoon);
			System.out.println("Is element selected :" + isSelect);
			System.out.println("Is element displayed :" + isDisp);
			System.out.println("Is element enabled :" + isEna);


	}

}
