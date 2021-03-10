package javasessions;

public class StaticMethodOverloading {

	// static method overloading is possible
	public static void test() {

	}

	public static void test(int a) {

	}

	public static void test(int a, long b) {

	}

	public static void test(String a, int b) {

	}

	public static void main(String[] args) {

		test("testing", 100);
	}

}
