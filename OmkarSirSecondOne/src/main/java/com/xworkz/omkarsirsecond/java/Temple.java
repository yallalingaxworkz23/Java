package com.xworkz.omkarsirsecond.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Temple {
	private Generater generater;
	private Tile tile;
	private Elevator elevator;
	@Autowired
	public Temple(Generater generater,Tile tile,Elevator elevator) {
	System.out.println("tepmle compnent is created..");
	this.generater=generater;
	this.tile =tile;
	this.elevator=elevator;
	System.out.println("calling the generate to temple.."+this.generater);
	System.out.println("calling the tile to temple.."+this.tile);
	System.out.println("calling the elevator to temple.."+this.elevator);
	
	}

}
