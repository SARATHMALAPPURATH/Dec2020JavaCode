package javasessions;

public class DataConversionStringToInt {

	public static void main(String[] args) {

		String c = "100";
		int i = Integer.parseInt(c);
		System.out.println(i + 20);

		String y = "100test";
		y = y.replaceAll("\\D+", "");
		int s = Integer.parseInt(y);
		System.out.println(s + 20);

	}

}
