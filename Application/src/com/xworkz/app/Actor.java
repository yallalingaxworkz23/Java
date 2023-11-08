package com.xworkz.app;

import java.util.ArrayList;
import java.util.Collection;

public class Actor {
	
	public static void main(String[] args) {
		Collection<String> actorcollection1=new ArrayList();
		actorcollection1.add("Sudeep");
		actorcollection1.add("Uppi");
		actorcollection1.add("Ganesh");
		actorcollection1.add("Druva");
		actorcollection1.add("punith");
		actorcollection1.add("Tiger");
		actorcollection1.add("chiru");
		actorcollection1.add("Vishnu");
		actorcollection1.add("Ram");
		actorcollection1.add("Allu");
		
		System.out.println("acter are"+actorcollection1);
		
		Collection<String> actactorcollection2=new ArrayList();
		actactorcollection2.add("Darshan");
		actactorcollection2.add("ShivrajKumer");
		actactorcollection2.add("Kumar");
		System.out.println("acter2 are:"+actactorcollection2);
		
		
		
		boolean chuck1=actorcollection1.containsAll(actactorcollection2);
		System.out.println(" befor adding actorcollection1 contains actorcollection2 :"+chuck1);
		
		actorcollection1.addAll(actactorcollection2);
		boolean chuck2=actorcollection1.containsAll(actactorcollection2);
		System.out.println(" after adding actorcollection1 contains actorcollection2:"+chuck2);
		
		
		
		
		
		
		boolean chuck3=actorcollection1.remove("Druva");
		System.out.println("druva removed:"+chuck3);
		
		System.out.println("actors are:"+actorcollection1);
		
		boolean chuck4=actorcollection1.remove("yallu");
		System.out.println("to remove yallu:"+chuck4);
		
		
		boolean chuck5=actorcollection1.removeAll(actactorcollection2);
		System.out.println("removed:"+chuck5);
		System.out.println("actors are:"+actorcollection1);
		
	
		
		
		
		
		
		
	}

}
