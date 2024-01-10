package com.xworkz.scientist.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ScientistDTO {
	
	@NotNull
	@Size(min = 5, max = 15, message = "please write valied name")
	private String name;
	@NotNull
	@Min(5)
	@Max(20)
	private int expr;
	@NotNull
	@Size(min = 5, max = 15, message = "please write valied field")
	private String field;
	@NotNull
	@Size(min = 5, max = 15, message = "please write valied country")
	private String country;
	@NotNull
	@Size(min = 5, max = 15, message = "please write valied achivement")
	private String achivement;
	

}
