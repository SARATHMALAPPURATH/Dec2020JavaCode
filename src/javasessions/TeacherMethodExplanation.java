package javasessions;

import java.util.ArrayList;

public class TeacherMethodExplanation {

	// write a function : it will take college name(String) and return the faculty
	// list (ArrayList<String>)

	public ArrayList<String> getCollegeFacultyName(String collgeName) {
		System.out.println("College name is " + collgeName);
		ArrayList<String> facultyList = new ArrayList<String>();

		switch (collgeName) {
		case "IIMB": {
			facultyList.add("Tom");
			facultyList.add("Steve");
			facultyList.add("Peter");
			break;
		}
		case "IIMC": {
			facultyList.add("Jerry");
			facultyList.add("Sam");
			facultyList.add("Alex");
			break;
		}
		case "IIMD": {
			facultyList.add("Lallu");
			facultyList.add("Manu");
			facultyList.add("jijo");
			break;
		}
		default:
			System.out.println("College name is not found ");
			break;
		}
		return facultyList;

	}

	public String[] getCollegeFacultyNameWithArray(String collgeName) {
		System.out.println("College name is " + collgeName);
		String facultyList[] = new String[3];

		switch (collgeName) {
		case "IIMB": {
			facultyList[0] = "Jim";
			facultyList[1] = "Sim";
			facultyList[2] = "Pop";
			break;
		}
		case "IIMC": {
			facultyList[0] = "Zak";
			facultyList[1] = "Mimo";
			facultyList[2] = "niro";
			break;
		}
		case "IIMD": {
			facultyList[0] = "Sonu";
			facultyList[1] = "ponu";
			facultyList[2] = "monu";
			break;
		}
		default:
			System.out.println("College name is not found ");
			break;
		}
		return facultyList;

	}

	public static void main(String[] args) {

		TeacherMethodExplanation name = new TeacherMethodExplanation();

		ArrayList<String> list = name.getCollegeFacultyName("IIMB");
		System.out.println(list);
		ArrayList<String> noList = name.getCollegeFacultyName("IIMZ");
		System.out.println(noList);

		String list1[] = name.getCollegeFacultyNameWithArray("IIMB");
		for (String e : list1) {
			System.out.println(e);
		}
		String noList1[] = name.getCollegeFacultyNameWithArray("IIMZ");
		System.out.println(noList1[0]);
	}

}
