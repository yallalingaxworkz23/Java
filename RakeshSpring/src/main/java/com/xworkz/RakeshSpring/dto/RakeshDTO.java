package com.xworkz.RakeshSpring.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class RakeshDTO {
	
	@NotNull
	@Size(min = 3,max = 10,message = "pease pravide bvalide name")
	private String name;
	@NotNull
	@Size(min = 3,max = 10,message = "pease pravide bvalide fname")
	private String fname;
	@NotNull
	@Size(min = 3,max = 10,message = "pease pravide bvalide mname")
	private String mname;
	@NotNull
	@Size(min = 3,max = 10,message = "pease pravide bvalide place")
	private String place;
	
	
}
