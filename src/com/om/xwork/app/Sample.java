package com.om.xwork.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		Collection<String> collection= new ArrayList();
		collection.add("Plier");
		collection.add("Spanner");
		collection.add("Hammer");
		collection.add("Saw");
		collection.add("Screw Driver");
		collection.add("Jack");
		collection.add("Cutter");
		
		Collection<String> collection1= new ArrayList();
		collection1.add("Flash Light");
		collection1.add("Wrech");
		
		System.out.println(collection.addAll(collection1));// added
		System.out.println("2 elements are add:"+collection1);
		
		System.out.println("%%%%%");
		
		// collection.contains("saw");
		 System.out.println(collection.containsAll(collection1));// boolean to chuck where present are not
		 
		// Collection<String> collection2= new ArrayList();
		 
		 
		 System.out.println(collection.removeAll(collection1));
		System.out.println("removed collection1 items:"+collection);
		 
		 
		Iterator<String> ref= collection.iterator();
		while(ref.hasNext()) {
		  String garage=ref.next();
		  System.out.println(garage.endsWith("r"));
		 
			
		}
		
		
		
		
	}

}
