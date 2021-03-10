package javasessions;

public class MethodsInJava {
	// method or functions
	// methods are independent or parallel to each other

	// 1. no input no output method
	// void: cannot return any value
	public void test() {
		System.out.println("test method");
	}

	public void addMarks() {
		System.out.println("add marks");
		int a = 10;
		int b = 20;
		int c = 40;
		int d = a + b + c;
		System.out.println(d);

	}

	// 2. no input some output method
	public int getScore() {
		System.out.println("Get score card");
		int score = 100;
		int bal = 20;
		int finalScore = score + bal;
		return finalScore;
	}
	// 2. some input some output method

	public int add(int a, int b) {
		System.out.println("add method");
		int sum = a + b;
		return sum;
	}

	public double salary(double preCTC) {
		System.out.println("get salary........");
		double basePack = 10.12;
		double bonus = 1.3;
		double totalCTC = preCTC + basePack + bonus;
		return totalCTC;
	}

	public static void main(String[] args) {

		MethodsInJava obj = new MethodsInJava();

		obj.test();
		obj.addMarks();
		int score = obj.getScore();
		System.out.println(score);

		int s1 = obj.add(10, 20);
		System.out.println(s1);

		double newCTC = obj.salary(40.44);
		System.out.println(newCTC);

	}

}
