package com.om.xwork.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class States {
	public static void main(String[] args) {
		Collection<String> states=new ArrayList();
		states.add("karnataka");
		states.add("goa");
		states.add("tamilnadu");
		states.add("kerala");
		states.add("telangana");
		states.add("AP");
		states.add("bihar");
		states.add("odesa");
		states.add("nagaland");
		states.add("kolkatha");
		states.add("mp");
		states.add("up");
		states.add("gujarath");
		states.add("rajasthan");
		states.add("pungab");
		states.add("hareyana");
		states.add("madyaparadash");
		states.add("uk");
		states.add("jk");
		states.add("maharastra");
		states.add("chhattigargh");
		states.add("goa");
		states.add("uttrakanda");
		states.add("delhi");
		states.add("mrghalay");
		states.add("manipur");
		states.add("tripura");
		states.add("west bengal");
		states.add("mizorm");
		System.out.println(" length of array is:"+states.size());
	Iterator<String> ref=states.iterator();
	while(ref.hasNext()) {
		String india=ref.next();
		System.out.println("state of india is:"+india);
	}
	}

}
