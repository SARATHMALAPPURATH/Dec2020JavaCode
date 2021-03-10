package javasessions;

public class LoopConceptsAssignments {

	public static void main(String[] args) {
//		1. WAP to print following output:
//			I am Batman 5 times
		int j = 1;
		while (j <= 5) {
			System.out.println("I am Batman");
			j++;
		}
		System.out.println("-----------------");
//			2. WAP to print following output:
//			I am Batman 1, up to 9 times
		for (int p = 1; p < 10; p++) {
			System.out.println("I am Batman " + p);
		}
		System.out.println("-----------------");
//			3. WAP to print 10 to 1 using for, while and do-while loop
		int i = 10;// Initialization
		while (i >= 1) // conditional part
		{
			System.out.println(i);// 1 will be printed infinite time if we do not give increment
			i--;
		}

		System.out.println("-----------------");
		// 10 to 1 using do while
		int z = 10;
		do {
			System.out.println(z);
			z--;
		} while (z >= 1);

		System.out.println("-------------------------");
		// 10 to 1 using for loop
		for (int a = 10; a >= 1; a--) {
			System.out.println(a);
		}

		System.out.println("-----------------");
//
//			4. Write a program in Java to print "Hello World" ten times using while loop
		int r = 1;
		while (r <= 10) {
			System.out.println(r + ". Hello World");
			r++;
		}
		System.out.println("-----------------");

//
//			5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		int f = 1;
		while (f <= 10) {
			System.out.println(f);
			if (f / 7 == 1) {
				System.out.println("multiple of 7");
				break;
			}
			f++;
		}
		System.out.println("-------------------------");
//
//			6. Try to print the following pattern on the console:
//			n = 4
//			n = 3
//			n = 2
//			n = 1
//			n = 0
		for (int g = 4; g >= 0; g--) {
			System.out.println("n = " + g);
		}
		System.out.println("-------------------------");

		// printing odd numbers using while loop

		int b = 0;
		while (b <= 10) {
			if (b % 2 == 1) {
				System.out.println(b + " is a odd number");
			}
			b++;
		}

		System.out.println("--------------------");
		// printing odd numbers using for loop
		for (int c = 0; c <= 10; c++) {
			if (c % 2 == 1) {
				System.out.println(c + " is a odd number");
			}
		}

		System.out.println("-------------------------");
		int counter = 0;
		for (int s = 0; s < 4; s++) {
			for (int t = 0; t < 10; t++) {
				System.out.print(counter);
				System.out.print(" "); // I think it is best to have spaces between the numbers
				counter++;
			}
			// after printing 10 numbers, go to a new line
			System.out.println();
		}

		// 00 01 02 03 04
		// 05 06 07 08 09

		System.out.println("----------------");

		for (int row = 0; row <= 3; row++) {
			for (int colomn = 0; colomn <= 9; colomn++) {
				System.out.print(row + "" + colomn + " ");
			}
			System.out.println();
		}

		// Fibonacci series

		int k, h = 1, m = 1;
		k = 0;
		System.out.println("1 1 ");
		while (k <= 20) {
			k = h + m;
			if (k >= 20) {
				break;
			}
			System.out.println(k + " ");
			h = m;
			m = k;
		}

		// Palindrome number

		int n = 123;
		int rem;
		int s = 0;

		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			s = (s * 10) + rem;
		}
		System.out.println(s);

	}

}
