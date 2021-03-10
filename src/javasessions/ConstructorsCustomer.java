package javasessions;

public class ConstructorsCustomer {

	String name;
	String city;
	int custID;
	String orderID;
	boolean isActive;

	public ConstructorsCustomer(String name, String city, int custID, boolean isActive) {

		this.name = name;
		this.city = city;
		this.custID = custID;
		this.isActive = isActive;
	}

	public ConstructorsCustomer(String name, String city) {

		this.name = name;
		this.city = city;
	}

	public ConstructorsCustomer(String name, int custID) {
		this.name = name;
		this.custID = custID;

	}

	public ConstructorsCustomer(String name, String city, int custID, String orderID, boolean isActive) {
		this.name = name;
		this.city = city;
		this.custID = custID;
		this.orderID = orderID;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		ConstructorsCustomer c1 = new ConstructorsCustomer("Tom", 100);
		System.out.println(c1.name + " " + c1.custID + " " + c1.city + " " + c1.orderID + " " + c1.isActive);

		ConstructorsCustomer c2 = new ConstructorsCustomer("Jerry", "Thrissur", 101, "10521", true);
		System.out.println(c2.name + " " + c1.city + " " + c1.custID + " " + c1.orderID + " " + c1.isActive);

	}

}
