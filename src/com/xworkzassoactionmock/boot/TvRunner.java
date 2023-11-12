package com.xworkzassoactionmock.boot;

import com.xworkzassoactionmock.app.Speacker;
import com.xworkzassoactionmock.app.Tv;

public class TvRunner {
	
	public static void main(String[] args) {
		
		System.out.println("in main ..");
		
		Speacker sp=new Speacker();
		sp.setBrand("JBL");
		sp.setName("Jbllorge");
		sp.setPrice(9000.99);
		
		Speacker sp1=new Speacker();
		sp1.setBrand("Mi");
		sp1.setName("Jbllorge");
		sp1.setPrice(9000.99);
		
		Tv tv=new Tv();
		tv.setSpeaker(sp);
		System.out.println(tv);
		Tv tv1=new Tv();
		tv1.setSpeaker(sp1);
		System.out.println(tv1);
	}

}

//in assoaction we ned to creat no parameter constracter
// and getter and seeter method 
//toString 
//it pecome property to another class and by using this proerty we extand all methods 
//in main mthod we call amd do set method are assiging tha value by useing set method 
