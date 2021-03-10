package javasessions;

public class MethodsUsageChaining {
	// method chaining- one object of the class can call the other object without
	// using class name

	public static void t1() {
		System.out.println("Hi ....t1");
		t2();
	}

	public static void t2() {
		System.out.println("Hello.... t2");
		t3();
	}

	public static void t3() {
		System.out.println("Bye....t3");

	}

	public void launch() {
		System.out.println("launch");
		header();
		t1();
	}

	public void header() {
		System.out.println("header");
		title();
	}

	public void title() {
		System.out.println("title");
		close();
	}

	public void close() {
		System.out.println("close");
	}

	public static void main(String[] args) {

		MethodsUsageChaining p1 = new MethodsUsageChaining();
		p1.launch();

		t1();

	}

}
