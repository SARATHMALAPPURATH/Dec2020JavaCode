package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {

		// Arrays are used to store multiple values in a single variable, instead of
		// declaring separate variables for each value.
		// similar type of data can be stored. If int interger only, if double double
		// only
		// array size is fixed --- static array
		// can be created for total no of months in a year, 24 hrs in a day, School
		// student attendance
		// lowest index of array is always 0
		// 1. int arrays

		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[-1]); //ArrayIndexOutOfBoundsException

		System.out.println(i[0] + i[1]);

		System.out.println("--------------------------");
// to print all the values of an array
		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}
		System.out.println("--------------------------");

		// for each loop
		for (int a : i) {
			System.out.println(a);
		}
		System.out.println("--------------------------");

		// 2. double array
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 23.33;
		int l = d.length;
		System.out.println(d[0]);
		System.out.println("Length " + l);
		System.out.println("Highest Index " + (l - 1));
		System.out.println("Lowest Index " + 0);

		// 3. char array:

		char c[] = new char[4];
		c[0] = 'a';
		c[1] = '8';
		c[2] = '$';
		System.out.println(c.length);
		System.out.println("default value: " + c[3]);// char default value is space

		// 4. String Array
		String names[] = new String[10];
		names[0] = "Divya";
		names[1] = "Namitha";
		names[2] = "Durjan";

		System.out.println(names[0]);
		System.out.println(names[3]);
		for (int s = 0; s < names.length; s++) {
			System.out.println(names[s]);
		}
		System.out.println("--------------------------");

		// for each
		for (String j : names) {
			System.out.println(j);
		}
		System.out.println("--------------------------");
		// Array literal: when we aware of the number of elements in the array. eg:
		// total number of days in a week.
		// static array
		int arr[] = { 1, 5, 4, 8, 2, 2, 8, 7, 5, 3 };
		System.out.println(arr.length);
		System.out.println("Highest index " + (arr.length - 1));
		System.out.println(arr[0]);

		for (int z : arr) {
			System.out.println(z);
		}
		System.out.println("--------------------------");
		for (int ar = 0; ar < arr.length; ar++) {
			System.out.println(arr[ar]);
		}
	}

}
