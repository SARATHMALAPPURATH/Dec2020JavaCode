package StringManipulation;

public class StringManipulationConcepts {

	public static void main(String[] args) {

		String str = "This is my java code and I am so happy this is";

		System.out.println(str.length());

		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15));// space is the value
		System.out.println(str.charAt(16));
		// System.out.println(str.charAt(38)); StringIndexOutOfBoundsException
		// System.out.println(str.charAt(-1)); StringIndexOutOfBoundsException

		System.out.println(str.indexOf('T'));

		System.out.println(str.indexOf('i')); // 2 , this is first occurrence of i

		System.out.println(str.indexOf('i', str.indexOf('i') + 1));// 2nd occurrence
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1));// 3rd occurrence
		System.out.println(str.indexOf('i', str.indexOf('i', str.indexOf('i', str.indexOf('i') + 1) + 1) + 1)); // fourth
																												// occurance

		System.out.println(str.indexOf("code"));

		System.out.println(str.indexOf("Sarath"));// -1

		String msg = "Welcome admin";
		if (msg.indexOf("admin") > 0) {
			System.out.println("username is there in message");
		} else {
			System.out.println("user name is missing");
		}

		if (msg.indexOf("admin") == -1) {
			System.out.println("user name is missing");
		} else {
			System.out.println("username is there in message");
		}

		if (msg.indexOf("sarath") == -1) {
			System.out.println("username is missing");
		}

		String s1 = "welcome to testing";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
//trim
		String s2 = " hello world   ";
		System.out.println(s2.trim());

		String browser = "chrome ";

		if (browser.trim().equals("chrome")) {
			System.out.println("launch chrome");
		} else {
			System.out.println("let me know");
		}

		// contains

		String name = "your app name is amazon";

		if (name.contains("amazon")) {
			System.out.println("contains amzazon");
		} else {
			System.out.println("not comming");
		}

		String url = "http://www.xyz.com/loginpage.jsp";
		if (url.contains("loginpage")) {
			System.out.println("login page url is correct");
		}

		// equals
		String s11 = "welcome home";

		String s12 = "welcome home ";

		System.out.println(s11.equals(s12.trim()));

		// subString

		String st = "this is my java code";

		System.out.println(st.substring(5));
		System.out.println(st.substring(5, 10));

		String stt = "this is your transaction id is 12345";

		System.out.println(
				stt.substring(stt.indexOf("is", stt.indexOf("is", stt.indexOf("is") + 3) + 3) + 3, stt.length()));

		// replace

		String dob = "2012/02/23";
		System.out.println(dob.replace('/', '-'));

		// split

		String lang = "JAVA;PYTHON;RUBY;JavaScript";
		String langArr[] = lang.split(";");
		System.out.println(langArr[0]);
		System.out.println(langArr.length);

		for (String e : langArr) {
			System.out.println(e);
		}

		for (int i = 0; i < langArr.length; i++) {
			System.out.println(langArr[i]);
		}

		// data driven
		String testData = "mohit;bisht;mohit@gmail.com;99999;test@123";

		String data[] = testData.split(";");

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}

		String test = "xXIndiaxXXUSXxXUKXxXXRussia";

		String testing[] = test.split("xX");

		System.out.println(testing[0]);
		System.out.println(testing[1]);
		System.out.println(testing[2]);
		System.out.println(testing[3]);
		System.out.println(testing[4]);

	}

}
