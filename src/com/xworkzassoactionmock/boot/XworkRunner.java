package com.xworkzassoactionmock.boot;

import com.xworkzassoactionmock.app.Students;
import com.xworkzassoactionmock.app.Xwork;

public class XworkRunner {
	
	
	public static void main(String[] args) {
		
		Students std=new Students();
		std.setAge(23);
		std.setName("Yallalinga");
		std.setPlace("Raichur");
		
		Students std1=new Students();
		std1.setAge(22);
		std1.setName("Kumar");
		std1.setPlace("Manvi");
		
		Xwork xz=new Xwork();
		xz.setStudents(std);
		System.out.println(std);
		System.out.println(std1);
		
	}
	

}
