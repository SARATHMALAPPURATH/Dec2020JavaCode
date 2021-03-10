package OOP_Abstract;

public class Home extends Page {
	@Override
	public void title() {
		System.out.println("My home tile");
	}

	@Override
	public void header() {
		System.out.println("home page header");
	}

	@Override
	public void url() {
		System.out.println("http://whatever.com/homepage.jsp");
	}
}
