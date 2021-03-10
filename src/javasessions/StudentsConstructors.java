package javasessions;

public class StudentsConstructors {

	String name;
	int rollNumber;
	String standard;
	boolean isActive;
	String city;

	// constructor will help me to create the object on the basis of given template
	// variables.
	// constructor can be overloaded with same name and different variables

	public StudentsConstructors() {
		System.out.println("Default constructor");
	}

	public StudentsConstructors(int a) {// 1 parameter constructor
		System.out.println("one param " + a);
	}

	public StudentsConstructors(String a) {// 1 parameter constructor
		System.out.println("one param " + a);
	}

	public static void main(String[] args) {

		StudentsConstructors obj = new StudentsConstructors("testing");
		StudentsConstructors obj1 = new StudentsConstructors();

	}

}
