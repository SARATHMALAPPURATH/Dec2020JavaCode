package javasessions;

import java.util.ArrayList;

public class BrowserAssign {
//	2. Design a browser class template with the following features:
//		 variables:browserName, vendorName,currentVersion,	List of plugins supported by Browser in Array List<String>
//		--Design the constructor of this class with different parameters and all parameters.
//		--Write the get method of each variable with return keyword. 
	String browserName;
	private String vendorName;
	String currentVersion;
	ArrayList<String> plugins = new ArrayList<String>();

	public BrowserAssign(String browserName, String vendorName, String currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = new ArrayList<String>();
	}

	public String getBrowserName() {
		System.out.println("Browser name: " + browserName);
		return browserName;
	}

	public String getVendorName() {
		System.out.println("Vendor name: " + vendorName);
		return vendorName;
	}

	public String getCurrentVersion() {
		System.out.println("Current version: " + currentVersion);
		return currentVersion;
	}

	public ArrayList<String> getPlugins() {
		System.out.println("Plugins are: " + plugins);
		return plugins;
	}

	public void setPlugins(ArrayList<String> plugins) {
		this.plugins = plugins;
		plugins.add("plugin 1");
		plugins.add("plugin 2");
		plugins.add("plugin 3");
	}

	public static void main(String[] args) {
		BrowserAssign browser = new BrowserAssign("chrome", "Google", "87.0.4280.141");
		browser.getBrowserName();
		browser.getVendorName();
		browser.getCurrentVersion();
		browser.setPlugins(browser.plugins);
		browser.getPlugins();
	}

}
