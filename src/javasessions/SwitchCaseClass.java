package javasessions;

public class SwitchCaseClass {

	public static void main(String[] args) {

		String browser = "sarath";

		// java wont check each case it will directly jump to the right case

		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "ie":
			System.out.println("Launch ie");
			break;
		case "opera":
			System.out.println("Launch opera");
			break;

		default:
			System.out.println("please pass the right browser name " + browser);
			break;
		}

	}

}
