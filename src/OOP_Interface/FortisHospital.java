package OOP_Interface;

public class FortisHospital extends CentralHospital implements USMedical, IndianMedical, UKMedical {

	@Override
	public void pediaServices() {
		System.out.println("FH --PediaServices");

	}

	@Override
	public void cardicServices() {
		System.out.println("FH --cardicServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH --physioServices");
	}

	@Override
	public void doctors(int count) {
		System.out.println("FH --doctors " + count);

	}

	@Override
	public String getHospInfo() {
		return "US Hospital -- FH";
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH --oncologyServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH --orthoServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH --neuroServices");

	}

	@Override
	public void entServices() {
		System.out.println("FH --entServices");

	}

	@Override
	public void gynecSerices() {
		System.out.println("FH --gynecSerices");

	}

	@Override
	public void opthoServices() {
		System.out.println("FH --opthoServices");

	}

	// non overridden method
	public void medicalInsurance() {
		System.out.println("FH --medicalInsurance");

	}

	public void medicalTraining() {
		System.out.println("FH --medicalTraining");

	}

	public void pathiologyServices() {
		System.out.println("FH --pathiologyServices");

	}

	@Override
	public void coivd19Test() {
		System.out.println("FH --coivd19Test");

	}

	@Override
	public void billing() {
		System.out.println("USMedical -- billing");
	}

}
