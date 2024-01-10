package com.xwork.springCaleOrder.classDTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jboss.logging.Message;

import lombok.Data;

@Data
public class CakeOrderDTO {

	@NotNull
	@Size(min = 3, max = 15, message = "name is incorrect please correct...")
	private String customer;

	@NotNull
	@Size(min = 5, max = 25, message = "ur gmail is incorrect please correct..")
	private String gemail;

	@NotNull
	@Size(min = 3, max = 10, message = "please select the flaver..")
	private String flaver;

	@Min(1)
	@Max(10)
	
	
	private int weight;
	@Min(1)
	@Max(10)
	private int price;

	@NotNull
	@Size(min = 2, max = 5, message = "please select valied reasion..")
	private String taken;

}
