package com.xworkz.SpringSinger.dto;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SongDTO {
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide name")
	private String name;
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide singer name")
	private String singer; 
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide composer name")
	private String composer;
	
	@NotNull
	@Size(min = 1,max = 6,message = "please provide valide duration")
	private String duration;
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide album name")
	private String album;
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide language name")
	private String language;
	
//	@NotNull
//	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private String releasedate;
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide lyericist name")
	private String lyericist;
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide producer name")
	private String producer;
	
	@NotNull
	@Size(min = 4,max = 15,message = "please provide valide  directer name")
	private String directer;
	

}
