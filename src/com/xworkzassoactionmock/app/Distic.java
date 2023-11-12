package com.xworkzassoactionmock.app;

public class Distic {

	private String tname;
	private int tiluk;
	private int viallage;
	private int population;
	 public Distic() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Distic [tname=" + tname + ", tiluk=" + tiluk + ", viallage=" + viallage + ", population=" + population
				+ "]";
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTiluk() {
		return tiluk;
	}
	public void setTiluk(int tiluk) {
		this.tiluk = tiluk;
	}
	public int getViallage() {
		return viallage;
	}
	public void setViallage(int viallage) {
		this.viallage = viallage;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
