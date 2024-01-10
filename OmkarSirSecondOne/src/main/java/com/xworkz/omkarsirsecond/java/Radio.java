package com.xworkz.omkarsirsecond.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Radio {
	private Generater generater;

	@Autowired
	public Radio(Generater generater) {
		System.out.println("raido component is created..##");
		this.generater = generater;
		System.out.println(" calling generater to rdio.." + this.generater);
	}

}
