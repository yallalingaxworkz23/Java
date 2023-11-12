package com.xworkzassoactionmock.app;

public class Students {
	
	private String name;
	private int age;
	private String place;
	
	public Students() {
	
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", place=" + place + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
