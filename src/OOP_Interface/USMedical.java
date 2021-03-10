package OOP_Interface;

public interface USMedical extends WHO {

	int min_fee = 10;// interface variables are static and final in nature by default

	// no method body is allowed
	// only method declaration
	// only method prototype
	// Abstract methods - method which does not have any body
	// cannot create of object of interface

	public void pediaServices();

	public void cardicServices();

	public void physioServices();

	public void doctors(int count);

	public String getHospInfo();

	public static void bloodTest() {
		System.out.println("USMedical -- bloodTest");
	}

	default void billing() {
		System.out.println("USMedical -- billing");
	}
}
