package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start(); // overriden
		b.stop();
		b.autoParking();
		b.refuel();
		b.engine();
		System.out.println("=====================");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		System.out.println("=====================");
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		System.out.println("=====================");
		Vehicle v = new BMW();
		v.engine();
		v.start();
//down casting not possible- error classcastexception
//		BMW b1 = (BMW) new Car();
		System.out.println("=====================");
		Audi a = new Audi();
		a.start();
		a.stop();
		a.theftSafety();

	}
}
