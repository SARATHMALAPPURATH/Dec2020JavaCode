package JavaPractice;

public class StringReversing {

	public static void main(String[] args) {
		String s = "Selenium";
		// String is immutable

		String rev = "";

		int len = s.length();
		System.out.println(len);

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		StringBuffer sf = new StringBuffer(s);

		System.out.println(sf.reverse());
	}

}
