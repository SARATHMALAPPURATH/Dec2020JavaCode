package javasessions;

import java.util.ArrayList;

public class ArrayListWithStreams {

	public static void main(String[] args) {

		ArrayList<String> lang = new ArrayList<String>();

		lang.add("Java");
		lang.add("Python");
		lang.add("C#");
		lang.add("Ruby");

		// Stream
		// Sequential stream
		// functional programming
		lang.stream().forEach(ele -> System.out.println(ele));// ->Lambda arrow
		System.out.println("----------------");
		// parallel stream
		lang.parallelStream().forEach(ele -> System.out.println(ele));

	}

}
