package OOP_Encapsulation;

public class BrowserUserEncap {

	public static void main(String[] args) {

		BrowserEncap brow = new BrowserEncap();
		brow.launchBrowser();

		brow.setVersion(14);
		int a = brow.getVersion();
		System.out.println(a);

	}

}
