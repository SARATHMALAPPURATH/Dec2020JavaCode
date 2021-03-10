package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayAndArrayListAssignments {

	public static void main(String[] args) {
//		Static Array:
//			Question 1: Write a program to create a static Array, having following cricket data:
//			--name, age, team name, DOB, gender, Strike Rate
//			--Try to create multiple Object Arrays for different players 
//			--Try to print all the values of each player on the console
		Object player1[] = new Object[6];

		player1[0] = "Sachin";
		player1[1] = 25;
		player1[2] = "India";
		player1[3] = "21/05/2000";
		player1[4] = "Male";
		player1[5] = 44.64;

		Object player2[] = { "Ponting", 26, "Australia", "30/12/1999", "Male", 42.51 };

		for (Object i : player1) {
			System.out.println(i);
		}
		System.out.println("-----------------------");
		for (Object i : player2) {
			System.out.println(i);
		}

		System.out.println("-----------------------");

		// ArrayList
//		1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("White");
		colors.add("Black");
		colors.add("Red");
		colors.add("Blue");
		colors.add("Pink");
		System.out.println(colors);

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		for (String i : colors) {
			System.out.println(i);
		}

//		2. Write a Java program to insert an element into the array list at the first and last positions.
		System.out.println("-----------------------");
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Orange");
		c1.add("White");
		c1.add("Black");
		// Print the list
		System.out.println(c1);
		// Now insert a color at the first and last position of the list
		c1.add(0, "Pink");
		c1.add(5, "Yellow");
		// Print the list
		System.out.println(c1);
		System.out.println("-----------------------");
//		3. Write a Java program to retrieve an element (at a specified index) from a given array list.

		String retrieve = c1.get(0);
		System.out.println("Element retrived is " + retrieve);

		System.out.println("--------------------------");

//	    4. Write a Java program to update specific array element by given element.
		System.out.println(c1.get(0));
		c1.set(0, "Blue");
		System.out.println(c1.get(0));

		System.out.println("--------------------------");
//		5. Write a Java program to remove the third element from a array list. 
		System.out.println(c1);
		c1.remove(2);
		System.out.println(c1);

		System.out.println("--------------------------");

//		6. Write a Java program to search an element in a array list.

		if (c1.contains("Red")) {
			System.out.println("Element is present");
		} else {
			System.out.println("There is no such elememnt present");
		}

		System.out.println("--------------------------");
//		7. Write a Java program to reverse elements in a array list
		System.out.println(c1);
		Collections.reverse(c1);
		System.out.println(c1);
		System.out.println(c1.size());
		int lastIndex = c1.size() - 1;
		for (int r = lastIndex; r >= 0; r--) {
			System.out.println(c1.get(r));
		}
		System.out.println("--------------------------");
//		8. Write a Java program to extract a portion of a array list.		
//		List<String> sublist = c1.subList(0, 3);
//		subList = (ArrayList<String>) c1.subList(0, 3);
		System.out.println(c1.subList(0, 3));

		System.out.println("--------------------------");
//		9. Write a Java program of swap two elements in an array list.
		System.out.println(c1);
		Collections.swap(c1, 0, 1);
		System.out.println(c1);

//		10. Write a Java program to empty an array list.
		c1.clear();
//		c1.removeAll(c1);
		System.out.println(c1);

		System.out.println("----------------------------");
//		11. Write a Java program to trim the virtual capacity of an array list the current list size.
		// trimToSize() method is used for memory optimization.
		// It trims the capacity of ArrayList to the current list size. //

		ArrayList<String> c2 = new ArrayList<String>();
		System.out.println(c2.size());
		c2.add("Red");
		c2.add("Green");
		c2.add("Orange");
		c2.add("White");
		c2.add("Black");
		System.out.println(c2);
		colors.trimToSize();

		System.out.println("----------------------------");
//		12. Write a Java program to print all the elements of a ArrayList using the position of the elements

		for (int i = 0; i < c2.size(); i++) {
			System.out.println(c2.get(i));
		}
	}

//

}
