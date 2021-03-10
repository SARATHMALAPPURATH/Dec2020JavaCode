package javasessions;

public class TwoDArray {

	public static void main(String[] args) {

		int myNum[][] = { // eg 3 rows and 6 columns
				{ 1, 2, 3, 4 }, { 10, 20, 30, 40, 50, }, { 100, 200, 300, 400, 500, 600 } };

		for (int i = 0; i < myNum.length; i++) {// row iteration
			for (int j = 0; j < myNum[i].length; j++) {// column itteration
				System.out.print(myNum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------");
//for each loop for 2D array
		for (int i[] : myNum) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		int data[][] = new int[4][5];
		data[0][0] = 1;
		data[0][1] = 2;
		data[0][2] = 3;
		data[0][3] = 4;

		System.out.println(data[0][0]);
		// System.out.println(data[0][5]);// out of bound exception

	}

}
