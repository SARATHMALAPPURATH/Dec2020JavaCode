package javasessions;

import java.util.ArrayList;

public class ArrayListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(100);
		markList.add(200);
		markList.add(300);
		markList.add(400);

		System.out.println(markList.get(0));
		System.out.println(markList.get(3));
		// markList.add(6, 1000);
		// System.out.println(markList.get(6)); //out of bound exception
		markList.add(4, 500);
		System.out.println(markList.get(4));

		// to print all the values in the ArrayList
		System.out.println(markList);

		for (int i = 0; i < markList.size(); i++) {
			System.out.println(markList.get(i));
		}
		System.out.println("--------------------------");

		for (Integer a : markList) {
			System.out.println(a);
		}

	}

}
