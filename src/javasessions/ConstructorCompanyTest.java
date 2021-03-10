package javasessions;

public class ConstructorCompanyTest {

	public static void main(String[] args) {

		ConstructorsCompany comp = new ConstructorsCompany("IBM", 1000);
		System.out.println(comp.name + " " + comp.empCount);

		String info = comp.getCompInfo();
		System.out.println(info);

		ConstructorsCompany comp1 = new ConstructorsCompany("Facebook", 10000, "FB", "NY", "Mark Z");

		System.out.println(comp1.name + " " + comp1.ceoName);
	}

}
