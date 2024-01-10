package com.xworkz.omkarsirsecond.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Stamp {
	private Bottle bottle;
	@Autowired
	public Stamp(Bottle bottle) {
	System.out.println("stamp companent is created..");
	this.bottle=bottle;
	System.out.println("calling  battol to stamp..."+this.bottle);
	}

}
