package javasessions;

public class StudentClassReturnLearning {

	public int getStudentMarks(String studentName) {
		System.out.println("Student name is " + studentName);

		if (studentName.equals("Dhivya")) {
			return 90;

		} else if (studentName.equals("Tom")) {
			return 95;

		} else if (studentName.equals("Tom")) {
			return 10;
		} else {
			System.out.println("Student name not founf 404 error");
			return -1;
		}

	}

	public int getStudentMarks2(String studentName) {
		System.out.println("Student name is " + studentName);
		int marks = -1;

		if (studentName.equals("Dhivya")) {
			marks = 90;

		} else if (studentName.equals("Tom")) {
			marks = 95;

		} else if (studentName.equals("Tom")) {
			marks = 10;
		} else {
			System.out.println("Student name not found 404 error");
		}
		return marks;

	}

	public static void main(String[] args) {

		StudentClassReturnLearning st = new StudentClassReturnLearning();

		int mark = st.getStudentMarks("Dhivya");
		System.out.println(mark);
		st.getStudentMarks("Jerry");

		int marks = st.getStudentMarks2("Tom");
		System.out.println(mark);

		System.out.println(st.getStudentMarks2("Jerry"));

	}

}
