package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;// = is assignment operator
		int b = 20;

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		// Dead code
//		if (false) {// Dead code
//			System.out.println("hi");
//		} else {
//			System.out.println("bye");
//		}
		if (b > a) {
			System.out.println("b is greater then a");
		} else {
			System.out.println("a is greater than b");
		}

		double d1 = 12.33;
		double d2 = 12.33;

		if (d1 == d2) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		// < > <= >= == !=

		int total = 110;
		if (total >= 100) {
			System.out.println("correct total");
		} else {
			System.out.println("less than 100");
		}

		int marks = 80;
		if (marks >= 90) {
			System.out.println("you got grade A");
		}
		if (marks >= 80 && marks < 90) {// && - and operator
			System.out.println("grade B");
		}
		if (marks >= 70 && marks < 80) {
			System.out.println("grade C");
		}

		// WAP to print the highest number(three number will be given as test data)

		int x = 200;
		int y = 400;
		int z = 300;

		if (x > y && x > z) {
			System.out.println("x is the highest no");
		} else if (y > z) {
			System.out.println("y is the highest no");
		} else {
			System.out.println("z is the highest no");
		}

		int p = 500;
		int q = 600;
		int r = 300;
		int s = 900;

		if (p > q && p > r && p > s) {
			System.out.println("p is the largest no");
		} else if (q > r && q > s) {
			System.out.println("q is the largest no");
		} else if (r > s) {
			System.out.println("r is the largest no");
		} else {
			System.out.println("s is the largest no");
		}

		char c1 = 'a';
		char c2 = 'b';
		if (c1 == c2) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// String comparison

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		if (s1.equals(s2)) {
			System.out.println("both are equal");
		}

		// cross browser testing

//		String browser = "opera";
//
//		if (browser.equals("chrome")) {
//			System.out.println("Launch Chrome");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("Launch Firefox");
//		}
//		if (browser.equals("ie")) {
//			System.out.println("Launch ie");
//		}
//		if (browser.equals("opera")) {
//			System.out.println("Launch opera");
//		}

		// if else-if: this is not apt for checking n number of cases so we use switch
		// cases
		String browser = "opera";

		if (browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		} else if (browser.equals("firefox")) {
			System.out.println("Launch Firefox");
		} else if (browser.equals("ie")) {
			System.out.println("Launch ie");
		} else if (browser.equals("opera")) {
			System.out.println("Launch opera");
		} else {
			System.out.println("please pass the right browser name");
		}

	}

}
