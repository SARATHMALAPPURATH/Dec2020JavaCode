package OOP_Abstract;

public class AmazonPageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();

		lp.url();
		lp.title();
		lp.header();
		Page.logo();

		lp.loadingTimeOut();

		Page p = new LoginPage();
		p.header();
		p.title();
		p.url();
		p.loadingTimeOut();

	}

}
