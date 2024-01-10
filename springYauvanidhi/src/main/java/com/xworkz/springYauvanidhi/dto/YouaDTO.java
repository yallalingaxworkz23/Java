package com.xworkz.springYauvanidhi.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class YouaDTO {
	
	@NotNull
	@Size(min = 5, max = 15,message = "please provide valide name")
	private String name;
	@NotNull
	@Size(min = 5,max = 15,message = "please provide valide  father name")
	private String fname;
	@NotNull
	private int  pass;
	

}
