package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {
		System.out.println("m1");

	}

	public void m2() {
		System.out.println("m2");
		m3();

	}

	public void m3() throws ArithmeticException {
		System.out.println("m3");
		m4();

	}

	public void m4() {
		System.out.println("m4");
		try {
			booking();
		} catch (Exception e) {
			// TODO: handle exception
		}
		m1();
	}

	public void booking() {
		System.out.println("booking cab...");
		int i = 9 / 0;
	}

	public static void main(String[] args) throws ArithmeticException {
		ThrowsKeyword obj = new ThrowsKeyword();

		obj.m2();

		System.out.println("Hello");
	}

}
