package javasessions;

public class StaticKeyword {

	String name;
	static int age;

	public void test() {
		System.out.println("test method");
	}

	public static void getMail() {
		System.out.println("get mail");
	}

	public static void main(String[] args) {

		// call static variables and methods

		age = 25;
// not static		name = "Tom";

		StaticKeyword obj = new StaticKeyword();
		obj.name = "Tom";
		obj.test();

		// static variables can be called using class name
		getMail();
	}

}
