package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
		} catch (Exception e) {
			System.out.println("Eception catch block");
		}

		finally {
			System.out.println("finally block");
		}

		System.out.println(getMarks("Nav"));
	}

	public static int getMarks(String name) {

		if (name.equals("Sonam")) {
			return 90;
		} else if (name.equals("Tom")) {
			try {
				int i = 9 / 0;
			} catch (Exception e) {
				System.out.println("Exception coming");
				return 50;
			} finally {
				System.out.println("inside finally block");
				return 10;
			}
		}

		else if (name.equals("Sujan")) {
			return 95;
		}
		return -1;

	}

}
