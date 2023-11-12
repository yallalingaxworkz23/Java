package com.xworkzassoactionmock.app;

public class Rooms {
	private int rno;
	private int rfloor;
	private int nrooms;
	private String name;
	public Rooms() {
	
	}
	@Override
	public String toString() {
		return "Rooms [rno=" + rno + ", rfloor=" + rfloor + ", nrooms=" + nrooms + ", name=" + name + "]";
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getRfloor() {
		return rfloor;
	}
	public void setRfloor(int rfloor) {
		this.rfloor = rfloor;
	}
	public int getNrooms() {
		return nrooms;
	}
	public void setNrooms(int nrooms) {
		this.nrooms = nrooms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
