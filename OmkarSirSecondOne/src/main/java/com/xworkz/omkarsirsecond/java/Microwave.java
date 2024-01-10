package com.xworkz.omkarsirsecond.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Microwave {
	private Radio radio;
	private Bulb bulb;
	
	@Autowired
	public Microwave(Radio radio,Bulb bulb) {
	System.out.println("microwave component is created...");
	this.radio=radio;
	this.bulb=bulb;
	System.out.println("calling radio to microwave.."+this.radio);
	System.out.println("calling bulb to microwave.."+this.bulb);
	}

}
