package javasessions;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>();

		lang.add("Java");
		lang.add("Python");
		lang.add("C#");
		lang.add("Ruby");

		System.out.println(lang);

		lang.set(2, "Java Script");

		System.out.println(lang);

		lang.add(null);
		lang.add("Ruby");

		System.out.println(lang);
		System.out.println(lang.size());

		lang.remove(3);
		System.out.println(lang);
		System.out.println(lang.get(3));

	}

}
