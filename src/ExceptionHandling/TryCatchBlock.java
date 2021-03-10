package ExceptionHandling;

public class TryCatchBlock {

	String name;

	public static void main(String[] args) {
		System.out.println("Hi...");
		System.out.println("Hi...");
		System.out.println("Hi...");

		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "Tom";
			System.out.println(obj.name);
			int i = 9 / 3;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception is coming....");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception is coming....");
			e.printStackTrace();
		}

		System.out.println("Hello..");
		System.out.println("Hello..");
		System.out.println("Hello..");

	}

}
