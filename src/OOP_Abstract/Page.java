package OOP_Abstract;

public abstract class Page {

	public Page() {
		System.out.println("page class constructor.....");
	}

	public abstract void title();

	public abstract void header();

	public abstract void url();

	public final static void logo() {
		System.out.println("App -- logo");
	}

	public void loadingTimeOut() {
		System.out.println("loading time 20 seconds....");
	}

}