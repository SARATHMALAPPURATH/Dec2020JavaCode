package javasessions;

import java.util.ArrayList;

public class EmployeeDataClass {

	public String getComName() {
		return "IBM";

	}

	public int getEmpCount() {
		return 1000;
	}

	public Object[] getCompInfo() {
		Object comp[] = new Object[2];
		comp[0] = "IBM";
		comp[1] = 1000;
		return comp;

	}

	public ArrayList<String> getEmployeeList() {
		System.out.println("get employee list......");
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Vivek");
		empList.add("Namitha");
		empList.add("Sarath");
		return empList;
	}

	public static void main(String[] args) {
		EmployeeDataClass obj = new EmployeeDataClass();

		Object companyData[] = obj.getCompInfo();
		for (Object e : companyData) {
			System.out.println(e);
		}

		ArrayList<String> s1 = obj.getEmployeeList();
		System.out.println(s1);
		System.out.println(s1.size());

	}

}
