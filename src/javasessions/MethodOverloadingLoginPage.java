package javasessions;

public class MethodOverloadingLoginPage {
	// method overloading
	// Compile time polyMorphism
	// poly + Morphism

	public void login() {
		System.out.println("default login");
	}

	public void login(long phone) {
		System.out.println("login with phone number");
	}

	public void login(int phone) {
		System.out.println("login with int phone number");
	}

//	public void login(long phone, int otp) {
//		System.out.println("login with ph and otp");
//	}

	public void login(int otp, long phone) {
		System.out.println("login with otp and ph");
	}

	public void login(String un, String pwd) {
		System.out.println("login with UN and Pass");
	}

	public void login(String email, String pwd, String role) {
		System.out.println("login with email, pass and role");
	}

	public static void main(String[] args) {

		MethodOverloadingLoginPage m1 = new MethodOverloadingLoginPage();

		m1.login();
		m1.login(99999999);
		m1.login(955121511, 445555555);
		m1.login("Admin", "Admin123");
		m1.login(121255);

	}

}
