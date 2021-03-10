package javasessions;

public class DataTypeAssignments {
	public static void main(String[] args) {
//		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//		Expected Output : Hello and Sarath
		System.out.println("Hello");
		System.out.println("Sarath");
//		2. Write a Java program to print the sum of two numbers. //		Test Data:74 + 36 Expected Output :110 
		int a = 74;
		int b = 36;
		int sum = a + b;
		System.out.println(sum);
//		3. Write a Java program to divide two numbers and print on the screen. //		Test Data : 50/3 Expected Output :16
		int c = 50;
		int d = 3;
		int divide = c / d;
		System.out.println(divide);
//		4. Write a Java program to print the result of the following operations. Change your test data accordingly.
//		Test Data:a. -5 + 8 * 6, b. (55+9) % 9, c. 20 + -3*5 / 8 , d. 5 + 15 / 3 * 2 - 8 % 3
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
//		5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//		Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) Expected Output 2.138888888888889
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//		6. Try to concat "Hello Selenium" with a character 't'.
		System.out.println("Hello Selenium" + "t");
//		7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//			"Your Toal amount is. 3700".
		int p = 100;
		int q = 200;
		int r = 3400;
		int total = p + q + r;
		System.out.println("Your total is " + total);
//		8. What should be the output for :
		byte b3 = 065; // octal no - 8 is base for octal no and for hexa decimal 16 is the base
		System.out.println(b3);
		int b4 = 0x100; // hexa decimal- hexa decimal 16 is the base
		System.out.println(b4);
	}
}
