package com.om.xwork.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cityes {
	
	public static void main(String[] args) {
		Collection<String> cityes=new ArrayList();
		cityes.add("raichur");
		cityes.add("yadgeri");
		cityes.add("kalburgi");
		cityes.add("kopal");
		cityes.add("ballari");
		cityes.add("bhidar");
		cityes.add("davangari");
		cityes.add("vijaypur");
		cityes.add("bagalkot");
		cityes.add("darward");
		cityes.add("hubbali");
		cityes.add("gadag");
		cityes.add("hassan");
		cityes.add("havari");
		cityes.add("manglour");
		cityes.add("banglour");
		cityes.add("udupi");
		cityes.add("shivamuga");
		cityes.add("karwar");
		cityes.add("tumkur");
		System.out.println(" array lenght is:"+cityes.size());
		Iterator<String> ref=cityes.iterator();
		while(ref.hasNext()) {
			String citys=ref.next();
			System.out.println(" cityes are:"+citys);
		}
	
		
	}

}
