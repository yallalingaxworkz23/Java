package com.xworkzassoactionmock.app;

public class Speacker {
	String brand;
	String name;
	double price;
	public Speacker() {
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Speacker [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
