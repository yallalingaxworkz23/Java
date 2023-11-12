package com.xworkzassoactionmock.app;

public class CityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new People();
		people.setName("Yellaling");
		people.setMname("Roopa");
		people.setFname("Hanumanth");
		
		People people2=new  People();
		people2.setName("kumar");
		people2.setMname("anusha");
		people2.setFname("manoj");

		City city = new City();
		city.setPeople(people);
		System.out.println(people);
		city.setPeople(people2);
		System.out.println(people2);

	}

}
