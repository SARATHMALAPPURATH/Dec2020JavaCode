package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardicServices();
		fh.entServices();
		fh.doctors(100);
		String info = fh.getHospInfo();
		System.out.println(info);

		fh.medicalTraining();
		fh.medicalInsurance();
		fh.pathiologyServices();

		System.out.println(USMedical.min_fee);

		fh.coivd19Test();

		USMedical.bloodTest();

		fh.billing();

	}

}
