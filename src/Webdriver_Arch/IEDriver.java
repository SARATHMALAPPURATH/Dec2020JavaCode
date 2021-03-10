package Webdriver_Arch;

public class IEDriver implements WebDriver {
	public IEDriver() {
		System.out.println("Launch IE");
		System.out.println("IE is launched");

	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the element with: " + locator);
	}

	@Override
	public void get(String url) {
		System.out.println("Enter url " + url);
	}

	@Override
	public String getTitle() {
		System.out.println("getting page title");
		return "Google";
	}

	@Override
	public void click() {
		System.out.println("Click on element");
	}

	@Override
	public void sendKeys() {
		System.out.println("enter the values in a text field");
	}

	@Override
	public void close() {
		System.out.println("Closing the browser");
	}
}
