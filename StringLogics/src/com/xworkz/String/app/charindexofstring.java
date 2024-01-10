package com.xworkz.String.app;

public class charindexofstring {
	
	public static void main(String[] args) {
		
		String str="java is an easy";
		String stat="yallalinga";
		System.out.println("orginal statement is"+str);
		
		int Index1=str.charAt(0);
		int Index2=str.length();
		int Index3=str.lastIndexOf(stat);
		System.out.println("characer at intex 6 is:"+(char)Index1);
		System.out.println("characer at intex 6 is:"+Index2);
		System.out.println("characer at intex 6 is:"+Index3);
		
	}

}
