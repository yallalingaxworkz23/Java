package com.om.xwork.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Array {
	
	public static void main(String[] args) {
		 Collection<String> collection=new  ArrayList();
		 collection.add("yallalinga");
		 collection.add("kumar");
		 collection.add("roopa");
		 System.out.println("array length is :"+collection.size());
		Iterator<String> ref=collection.iterator();
		while(ref.hasNext()) {
			String names=ref.next();
		     System.out.println("names:"+names);
		}
		 		
	}

}
