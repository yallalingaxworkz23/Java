package com.xworkz.springInstitute.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class InstituteDTO {
	
	@NotNull
	@Size(min = 4,max = 10,message = "provide valide institute name")
	private String instname;
	
	@NotNull
	@Size(min = 4,max = 10,message = "provide valide institute founder")
	private String founder;
	
	@NotNull
	@Size(min = 4,max = 10,message = "provide valide institute place")
	private String place;
	
	
	@Min(5)
	@Max(10)
	private int  years;
	
	
	@Min(100)
	@Max(500)
	private int strength;
	
	
	@Min(5)
	@Max(15)
	private int staff;
	
	@NotNull
	@Size(min = 4,max = 10,message = "provide valide institute course")
	private String course;
	
	@NotNull
	@Size(min = 4,max = 10,message = "provide valide institute duraction")
	private String  duraction;
	

}
