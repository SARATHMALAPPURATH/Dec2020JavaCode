package javasessions;

public class Browser {

	// write a fi=function where you need to pass the browser name
	// and on the basis of browser name, launch the browser
	public void launchBrowser(String browserName) {
		System.out.println("Browser Name is " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.out.println("launch firefox");
		} else if (browserName.equalsIgnoreCase("interner explorer")) {
			System.out.println("interner explorer");
		} else {
			System.out.println("Please ask the user the check the browser name");
		}
	}

	public void launchBrowserWithSwitchCase(String browserName) {
		System.out.println("Browser Name is " + browserName);

		// browserName = browserName.toLowerCase();

		switch (browserName.toLowerCase()) {
		case "chrome": {
			System.out.println("launch chrome");
			break;
		}
		case "firefox": {
			System.out.println("launch firefox");
			break;
		}
		case "internet explorer": {
			System.out.println("internet explorer");
			break;
		}
		default:
			System.out.println("ask the user to check the browser: " + browserName);
			break;
		}

	}

	public static void main(String[] args) {

		Browser br = new Browser();
		br.launchBrowser("chrome");

		br.launchBrowserWithSwitchCase("Chrome");

	}

}
