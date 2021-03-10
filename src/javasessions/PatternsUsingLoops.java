package javasessions;

public class PatternsUsingLoops {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "" + j + " ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || j == 1 || i == 5 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
