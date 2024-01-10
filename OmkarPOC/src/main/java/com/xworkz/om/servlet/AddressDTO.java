package com.xworkz.om.servlet;


public class AddressDTO {
	
	String number;
	String street;
	String city;
	String state;
	String country;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "AddressDTO [number=" + number + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	public AddressDTO(String number, String street, String city, String state, String country) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	

}
