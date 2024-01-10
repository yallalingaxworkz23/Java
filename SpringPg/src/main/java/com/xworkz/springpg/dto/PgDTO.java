package com.xworkz.springpg.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class PgDTO {

	@NotNull
	@Size(min = 5,max = 15,message = "provide valide pgname")
	private String pgname;
	
	@NotNull
	@Size(min = 5,max = 15,message = "provide valide location")
	private String location;
	
	@NotNull
	@Size(min = 5,max = 15,message = " provide valide rooms")
	private String rooms;
	
	@NotNull
	@Size(min = 5,max = 15,message = "provide valide rooms")
	private String person;
	
	@NotNull
	@Size(min = 5,max = 15,message = "provide valide booked")
	private String booked;
	
//	@NotNull
//	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String bookingdate;
	
	@NotNull
	@Size(min =10,max =11,message = "provide valide phone number")
	private String phone;
	
}
