package OOP_Encapsulation;

public class LoginTestEncap {

	public static void main(String[] args) {

		LoginPageEncap lp_customer = new LoginPageEncap("Naveen", "password2");

//		login.setUserName("Sarath");
//		login.setPassword("password");
		lp_customer.doLogin(lp_customer.getUserName(), lp_customer.getPassword());
		lp_customer.logOut();

		// Another user
//		login.setUserName("Seller");
//		login.setPassword("password1");
//		login.doLogin(login.getUserName(), login.getPassword());
//		login.logOut();

//		LoginPageEncap lp_seller = new LoginPageEncap("Jim", "seller123");
//		lp_seller.doLogin(lp_seller.getUserName(), lp_seller.getPassword());
//		lp_seller.logOut();

		LoginPageEncap lp = new LoginPageEncap();

		lp.setUserName("Jass");
		lp.setPassword("jass123");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		lp.logOut();

		LoginPageEncap lp_1 = new LoginPageEncap("Sajith", "sajith1213");
		lp_1.doLogin(lp_1.getUserName(), lp_1.getPassword());
	}

}
