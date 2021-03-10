package OOP_Encapsulation;

public class LoginPageEncap {

	private String userName;
	private String password;

	public LoginPageEncap() {
		System.out.println("default constructor");
	}

	public LoginPageEncap(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void doLogin(String un, String pass) {

		System.out.println("Entering username " + un);
		System.out.println("Entering password " + pass);
		System.out.println("Click on Login");
		System.out.println("login is done");

	}

	public void logOut() {
		System.out.println("Logout is done......");
	}

}
