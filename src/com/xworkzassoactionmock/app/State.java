package com.xworkzassoactionmock.app;

public class State {
	private Distic distic;
	private int tdistic;
	private int dpopulation;
	private String dname;
	public int getTdistic() {
		return tdistic;
	}
	public Distic getDistic() {
		return distic;
	}
	public void setDistic(Distic distic) {
		this.distic = distic;
	}
	public int getDpopulation() {
		return dpopulation;
	}
	public void setDpopulation(int dpopulation) {
		this.dpopulation = dpopulation;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setTdistic(int tdistic) {
		this.tdistic = tdistic;
	}
	@Override
	public String toString() {
		return "State [distic=" + distic + ", tdistic=" + tdistic + ", dpopulation=" + dpopulation + ", dname=" + dname
				+ "]";
	}
}