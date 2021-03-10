package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1. while loop:
		// 1 to 10
		int i = 1;// Initialization
		while (i <= 10) // conditional part
		{
			System.out.println(i);// 1 will be printed infinite time if we do not give increment
			i++;
		}

		// give me the eg of infinite loop
//		while (true) {
//			System.out.println("Welcome to Taj hotel 24/7");
//		}
		// Unreachable code or dead code
//		while (false) {
//			System.out.println("bye");
//		}

		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p % 5 == 0) {
				System.out.println("Hiii");
				// break; if we put break the loop will break there
			}
			p++;
		}

		System.out.println("---------------------------");

		// for loop:
		// 1 to 10
		for (int m = 1; m <= 10; m++) {
			System.out.println(m);
		}

		System.out.println("----------------------------");

		for (int m = 1; m <= 10;) {// if not incremented will give indefinite times
			System.out.println(m);
			m++;// we can also increment here although everyone do inside the brackets
		}

//		for (;;) {// infinite time if not conditionised
//			System.out.println("Hiii....");
//		}

		System.out.println("--------------------------");

		// even numbers to be printed: 0 2 4 6 8 10
		for (int e = 0; e <= 10; e++) {
			if (e % 2 == 0) {
				System.out.println(e + " is a even number");
			}
		}
		// or we can code like this
//		for (int e = 0; e <= 10; e=e+2) {
//			System.out.println(e);
//		}
		System.out.println("---------------");

		for (int m = 0; m <= 100; m++) {// m is local variable and we can use m in another loop as well.
			System.out.println(m);
			if (m == 0) {
				System.out.println("duck---out --score is 0");
				break;
			}
			if (m == 50) {
				System.out.println("half century.. score is 50");
			}
			if (m == 100) {
				System.out.println("century.... score is 100");
			}

		}

		System.out.println("---------------");
// we can apply loop for doubles as well
		for (double d = 1.0; d <= 10.0; d++) {
			System.out.println(d);
		}
		System.out.println("-----------------------");

		// for loop for char- the condition will be compared on the basis of ASCII value
		// of char
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}

		// do-while loop:
		// statement in do will be performed/printed/executed atleast once and then it
		// will go to the while condition

		int n = 1;
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);

	}

}
