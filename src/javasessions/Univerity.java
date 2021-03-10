package javasessions;

import java.util.ArrayList;

public class Univerity {
//	Constructor Assignments:
//		1. Design a University class template with the following features:
//		 variables:name,country,stablishedDate	List of course provided in Array List<String>
//		--Design the constructor of this class with different parameters and all parameters.
//		--Write the get method of each variable with return keyword. 
	private String name;
	private String country;
	private String stablishedDate;
	private ArrayList<String> listOfCourses;

	public Univerity(String name, String country, String stablishedDate) {
		this.name = name;
		this.country = country;
		this.stablishedDate = stablishedDate;
		this.listOfCourses = new ArrayList<String>();
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public String getCountry() {
		System.out.println(country);
		return country;
	}

	public String getStablishedDate() {
		System.out.println(stablishedDate);
		return stablishedDate;
	}

	public ArrayList<String> getListOfCourses() {
		System.out.println(listOfCourses);
		return listOfCourses;
	}

	public void setListOfCourses(ArrayList<String> listOfCourses) {
		this.listOfCourses = listOfCourses;
		listOfCourses.add("EE");
		listOfCourses.add("EC");
	}

	public static void main(String[] args) {
		Univerity university = new Univerity("IIM", "India", "2000-10-12");
		university.getName();
		university.getCountry();
		university.getStablishedDate();
		university.setListOfCourses(university.listOfCourses);
		university.getListOfCourses();
	}

}
