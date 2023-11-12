package com.xworkzassoactionmock.app;

public class Mobile {
	
	private String brand;
	private String modul;
	private int storage;
	private int battry;
	private String color;
	private String camara;
	
	public Mobile() {
		
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", modul=" + modul + ", storage=" + storage + ", battry=" + battry
				+ ", color=" + color + ", camara=" + camara + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getBattry() {
		return battry;
	}

	public void setBattry(int battry) {
		this.battry = battry;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

}
