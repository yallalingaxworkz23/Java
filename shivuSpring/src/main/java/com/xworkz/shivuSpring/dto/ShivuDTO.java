package com.xworkz.shivuSpring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ShivuDTO {
	
	@NotNull
	@Size(min = 3,max = 10,message = "please provide valide name..")
	private String name;
	
	@NotNull
	@Size(min = 3,max = 10,message = "please provide valide fname..")
	private String fname;
	
	@Max(100)
	@Min(10)
	private String age;
	
	@NotNull
	@Size(min = 3,max = 10,message = "please provide valide place..")
	private String place;
	

}
