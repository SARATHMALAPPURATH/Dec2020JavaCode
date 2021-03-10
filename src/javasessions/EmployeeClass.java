package javasessions;

public class EmployeeClass {
	// class is a template
	// for eg: Employee class from were we can create different employee object

	String name;
	int empId;
	int age;
	double salary;

	public static void main(String[] args) {

		EmployeeClass emp = new EmployeeClass();

		emp.name = "Tom";
		emp.empId = 401;
		emp.age = 25;
		emp.salary = 1000.20;

		System.out.println(emp.name + " " + emp.empId + " " + emp.age + " " + emp.salary);

		EmployeeClass emp2 = new EmployeeClass();
		emp2.name = "Peter";
		emp2.age = 30;

		System.out.println(emp2.name + " " + emp2.age);

		EmployeeClass emp3 = new EmployeeClass();
		System.out.println(emp3.name + " " + emp3.empId + " " + emp3.age + " " + emp3.salary);

	}

}
