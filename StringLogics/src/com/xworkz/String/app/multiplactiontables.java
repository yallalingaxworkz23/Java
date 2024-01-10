package com.xworkz.String.app;

import java.util.Scanner;

public class multiplactiontables {
	
	public static void main(String[] args) {
		
		System.out.println("enter the number.");
		Scanner scan=new Scanner(System.in);
		int num= scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
	
	
}
