package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// dynamic arrays

		// ArrayList is class already in java. We have to create object of ArrayList

		ArrayList ar = new ArrayList();

		System.out.println(ar.size());// physical capacity

		ar.add(100);
		ar.add(200);
		ar.add("s");
		ar.add(100);
		ar.add(200);
		ar.add("s");
		ar.add(100);
		ar.add(200);
		ar.add("s");
		ar.add(100);
		ar.add(true);
		ar.add(12.33);
		ar.add('a');

		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		System.out.println(ar.get(9));

		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(100);
		System.out.println(i.get(0));
		ArrayList<Double> a = new ArrayList<Double>();// only double

		ArrayList<String> b = new ArrayList<String>();// only string

		ArrayList<Object> c = new ArrayList<Object>();// all primitive type
		c.add('a');
		c.add("String");
		c.add(12.33);
		c.add(true);
		System.out.println(c.size());

	}

}
