package OOP_Abstract;

public class LoginPage extends Page {

	public LoginPage() {
		System.out.println("this is LoginPage class constructor");
	}

	@Override
	public void title() {
		System.out.println("My login tile");
	}

	@Override
	public void header() {
		System.out.println("login page header");
	}

	@Override
	public void url() {
		System.out.println("http://www.whatever.com/Loginpage.jsp");
	}

	@Override
	public void loadingTimeOut() {
		System.out.println("login page loading time is : 10 seconds");
	}

	public void doLogin() {
		System.out.println("Login page -- login");
	}

}
