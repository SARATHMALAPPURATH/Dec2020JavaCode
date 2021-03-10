package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// Concatenation is the process of appending one string to the end of another
		// string.
		// You concatenate strings by using the + operator.

		String x = "Hello";
		String y = "World";

		int a = 100;
		int b = 200;

		double d1 = 12.33;
		double d2 = 22.33;

		System.out.println(a + b);// Arithmetic operation
		System.out.println(d1 + d2);// Arithmetic operation

		System.out.println(x + y);// concatenation
		System.out.println(x + a);

		System.out.println(a + b + x + y);// 300HelloWorld
		System.out.println(x + y + a + b);// HelloWorld100200
		System.out.println(x + y + (a + b));

		System.out.println(a + b + x + y + d1 + d2);

		System.out.println(x + y + d1 + d2 + a + b);

		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
		System.out.println("the sum of a and b is " + a + b);// wrong
		System.out.println("the sum of a and b is " + (a + b));

		byte b1 = 10;
		System.out.println(b1 + "Hello");

		int t1 = 10;
		int t2 = 3;
		System.out.println(t1 / t2);// ans will be integer not floating

		System.out.println(10.0 / 3);// ans will be floating 3.3333333333333335
		System.out.println(10.0 / 3.0);// ans will be floating 3.3333333333333335

		// System.out.println(9 / 0);// ArithmeticException- Infinity
		System.out.println(0 / 9);

		System.out.println(10 % 2);// modulus- reminder is 0
		System.out.println(11 % 2);// reminder 1
		System.out.println(11 % 11);// reminder 0
		// System.out.println(10 % 0);// java.lang.ArithmeticException: / by zero

		System.out.println(0 % 9);

		System.out.println(10 % 2.1);// reminder will be in floating

	}

}
