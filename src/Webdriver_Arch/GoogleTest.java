package Webdriver_Arch;

public class GoogleTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "IE";
		// WebDriver driver = null;

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// IEDriver driver = new IEDriver();

		switch (browser.toLowerCase()) {
		case "chrome": {
			driver = new ChromeDriver();
			break;
		}
		case "firefox": {
			driver = new FirefoxDriver();
			break;
		}
		case "ie": {
			driver = new IEDriver();
			break;
		}
		default:
			System.out.println("Please enter the correct browser name");
		}

		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is " + title);

		if (title.equalsIgnoreCase("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

		driver.findElement("test_id");
		driver.sendKeys();
		driver.click();
		driver.close();
	}

}
