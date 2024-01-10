package com.xworkz.springstudent.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class StudentDTO {
	@NotNull
	@Size(min = 5, max = 15, message = "provide a valide name")
	private String name;
	@NotNull
	@Size(min = 5, max = 15, message = "provide a valide place")
	private String place;
	@Min(1)
	@Max(4)
	private int year;
	@NotNull
	@Size(min = 1, max = 6, message = "provide a valide branch")
	private String branch;
	@NotNull
	@Size(min = 5, max = 15, message = "provide a valide country")
	private String country;
	@NotNull
	@Size(min = 5, max = 15, message = "provide a valide achivement")
	private String achivement;

}
