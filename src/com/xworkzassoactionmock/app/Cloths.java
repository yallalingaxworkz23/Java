package com.xworkzassoactionmock.app;

public class Cloths {
	
	public Cloths() {
		// TODO Auto-generated constructor stub
	}
	String shartbrand;
	@Override
	public String toString() {
		return "Cloths [shartbrand=" + shartbrand + ", pantbrand=" + pantbrand + ", shartcolor=" + shartcolor
				+ ", pantcolor=" + pantcolor + "]";
	}
	public String getShartbrand() {
		return shartbrand;
	}
	public void setShartbrand(String shartbrand) {
		this.shartbrand = shartbrand;
	}
	public String getPantbrand() {
		return pantbrand;
	}
	public void setPantbrand(String pantbrand) {
		this.pantbrand = pantbrand;
	}
	public String getShartcolor() {
		return shartcolor;
	}
	public void setShartcolor(String shartcolor) {
		this.shartcolor = shartcolor;
	}
	public String getPantcolor() {
		return pantcolor;
	}
	public void setPantcolor(String pantcolor) {
		this.pantcolor = pantcolor;
	}
	String pantbrand;
	String shartcolor;
	String pantcolor;

}
