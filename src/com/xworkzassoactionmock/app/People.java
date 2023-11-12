package com.xworkzassoactionmock.app;

public class People {
	
	private String name;
	private String fname;
	private String mname;
	
	public People() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", fname=" + fname + ", mname=" + mname + "]";
	}

}
