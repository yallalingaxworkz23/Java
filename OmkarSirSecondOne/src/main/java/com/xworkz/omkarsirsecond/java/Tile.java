package com.xworkz.omkarsirsecond.java;

import org.springframework.stereotype.Component;


public class Tile {
	private Perfume perfume;
	public Tile(Perfume perfume) {
	System.out.println("tile component is created and invoking ..");
	this.perfume=perfume;
	System.out.println("calling perfume to tile.."+perfume);
	}
	
	

}
