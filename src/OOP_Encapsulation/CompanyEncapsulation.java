package OOP_Encapsulation;

public class CompanyEncapsulation {

	public String name;
	private int sharePrice;
	private String policy;

	public void getCompAddress() {
		System.out.println("some comp address...");
	}

	public void getShareInfo() {
		getCompShareInfo();

	}

	private void getCompShareInfo() {
		System.out.println("Comp share info....");
	}

}
