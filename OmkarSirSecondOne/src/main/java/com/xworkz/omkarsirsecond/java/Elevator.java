package com.xworkz.omkarsirsecond.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Elevator {

	private Perfume perfume;
	
	@Autowired
	public Elevator(Perfume perfume) {
	System.out.println(" invoking in the elevter ..@@@");
	this.perfume=perfume;
	System.out.println("calling perfume to elevater.. "+this.perfume);
	
	}
}
