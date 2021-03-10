package OOP_Encapsulation;

public class BrowserEncap {

	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void launchBrowser() {

		checkBrowserVersion();
		checkRam();
		OSCompatible();
		checkBrowserUpdate();
		System.out.println("Browser is launched.....");
	}

	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");

	}

	private void checkRam() {
		System.out.println("checkRam");
	}

	private void OSCompatible() {
		System.out.println("OSCompatible");
	}

	private void checkBrowserUpdate() {
		System.out.println("checkBrowserUpdate");

	}

}
