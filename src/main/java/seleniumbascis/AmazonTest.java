package seleniumbascis;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtils br = new BrowserUtils();
		br.initDriver("chrome");
		br.launchUrl("https://www.amazon.com");
		String pageTitle = br.getPageTitle();
		String pageUrl = br.getPageUrl();
		System.out.println("Page tile is : " + pageTitle);
		System.out.println("Page url is : " + pageUrl);
		br.closeBrowser();

	}

}
