package OOP_Inheritance;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW ----- start");
	}

	public void autoParking() {
		System.out.println("BMW ----- autoParking");
	}

	@Override
	public int test(int i, String p) {
		System.out.println("value " + i);
		return 500;
	}

	private void testing() {
		System.out.println("BMW ----Testing");

	}

	public static void launch() {
		System.out.println("BMW ----- launch");
	}

	@Override
	public void engine() {
		System.out.println("BMW ----- engine");
	}

}
