package javasessions;

public class MethodsInJavaAssignments {
	// 1.Write a program to print the sum of two numbers entered by defining your
	public void sum(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	// 2. Define a method that returns the product of two numbers entered by user.
	public int product(int a, int b) {
		int sum = a + b;
		return sum;
	}

	// 3. Write a program to print the circumference and area of a circle of //
	// radius// entered by defining your own method.
	public void circumferenceArea(int r) {
		double area = 3.14 * r * r;
		double circum = 2 * 3.14 * r;
		System.out.println(area);
		System.out.println(circum);
	}

	// 4. Define two methods to print the maximum and the minimum number// //
	// respectively among three numbers entered.
	public int maxNumber(int first, int second, int third) {
		int max = first;
		if (second > max) {
			max = second;
		}
		if (third > max) {
			max = third;
		}
		return max;
	}

	public int minNumber(int first, int second, int third) {
		int min = first;
		if (second < min) {
			min = second;
		}
		if (third < min) {
			min = third;
		}
		return min;
	}

	// 5. Define a program to find out whether a given number is even or odd.
	public int isEvenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("The number is even " + number);
		} else {
			System.out.println("the number is odd " + number);
		}
		return number;
	}

	// 6. A person is elligible to vote if his/her age is greater than or equal to
	public boolean isEligibleVoter(int age) {
		if (age >= 18) {
			System.out.println("Is an eligible voter");
			return true;
		} else {
			System.out.println("Not an eligible voter because age less than 18");
			return false;
		}
	}

	// 7. Write a program which will ask the user to enter his/her marks (out of
	// 100).
	// Define a method that will display grades according to the marks entered
	// as below:
	// Marks Grade
	// 91-100 AA
	// 81-90 AB
	// 71-80 BB
	// 61-70 BC
	// 51-60 CD
	// 41-50 DD
	// <=40 Fail
	public void marksAndGrades(int marks) {
		if (marks >= 91 && marks < 100) {
			System.out.println("Marks " + marks + " Grade AA");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Marks " + marks + " Grade AB");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Marks " + marks + " Grade BB");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Marks " + marks + " Grade BC");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Marks " + marks + " Grade CD");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Marks " + marks + " Grade DD");
		} else {
			System.out.println("Marks " + marks + " Grade Fail");
		}
	}

	public static void main(String[] args) {

		MethodsInJavaAssignments m1 = new MethodsInJavaAssignments();
		m1.sum(10, 20);

		System.out.println(m1.product(50, 30));

		m1.circumferenceArea(3);

		System.out.println(m1.maxNumber(10, 20, 30));
		System.out.println(m1.minNumber(10, 20, 30));

		m1.isEvenOrOdd(0);

		boolean voter = m1.isEligibleVoter(17);
		System.out.println(voter);

		m1.marksAndGrades(90);

	}
}
