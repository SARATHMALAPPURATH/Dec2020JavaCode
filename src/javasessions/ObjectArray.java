package javasessions;

public class ObjectArray {

	public static void main(String[] args) {

		// JAVA ARRAY OF OBJECT, as defined by its name, stores an array of objects.

		// Unlike a traditional array that store values like string, integer, Boolean,
		// etc an array of objects stores OBJECTS.
		// The array elements store the location of the reference variables of the
		// object

		Object emp[] = new Object[5];

		emp[0] = "Anjum";
		emp[1] = "25";
		emp[2] = "70.12";
		emp[3] = 'F';
		emp[4] = true;

		System.out.println(emp.length);
		System.out.println(emp[0]);
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		System.out.println("------------------");
		for (Object o : emp) {
			System.out.println(o);
		}

		int marks[] = new int[10];
		marks[0] = 100;
		marks[1] = 200;

		System.out.println(marks[0]);
		System.out.println(marks[2]);// default value of int is 0. so if not asigned it will give 0
		System.out.println(marks[9]);
	}

}
