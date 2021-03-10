package javasessions;

public class CarDesignStaticKeyword {

	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void main(String[] args) {
		CarDesignStaticKeyword c1 = new CarDesignStaticKeyword();

		c1.name = "BMW";
		c1.price = 10;
		c1.color = "RED";

		CarDesignStaticKeyword c2 = new CarDesignStaticKeyword();

		c2.name = "OODI";
		c2.price = 20;
		c2.color = "BLUE";

		CarDesignStaticKeyword c3 = new CarDesignStaticKeyword();

		c3.name = "BENCE";
		c3.price = 30;
		c3.color = "BLACK";

		System.out.println("");

		System.out.println(c1.name + " " + c2.price + " " + c1.color + " " + CarDesignStaticKeyword.wheels);

	}
}
