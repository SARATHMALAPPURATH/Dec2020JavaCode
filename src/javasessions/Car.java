package javasessions;

public class Car {

	String name;
	String model;
	String color;
	int price;
	boolean isAvailable;
	boolean isAutomatic;

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.name = "BMW";
		c1.model = "AAA";
		c1.color = "White";
		c1.price = 1000000;
		c1.isAutomatic = true;
		c1.isAvailable = true;

		System.out.println(c1.name + " " + c1.model + " " + c1.price + " " + c1.color);

		Car c2 = new Car();

	}

}
