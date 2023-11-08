package com.xworkz.app.dto;

import java.time.LocalDate;

public class ApplicationDTO {
	private String name;
	private String version;
	private String companyname;
    private LocalDate createDate;
    private double rateing;
    
    public ApplicationDTO() {
    	
    }

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public double getRateing() {
		return rateing;
	}

	public void setRateing(double rateing) {
		this.rateing = rateing;
	}

	public ApplicationDTO(String name, String version, String companyname, LocalDate createDate, double rateing) {
		super();
		this.name = name;
		this.version = version;
		this.companyname = companyname;
		this.createDate = createDate;
		this.rateing = rateing;
	}
    
	

}
