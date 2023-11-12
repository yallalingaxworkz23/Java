package com.om.xwork.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumb {
	public static void main(String[] args) {
		Collection<Long> numb=new ArrayList();
		numb.add(8431224817L);
		numb.add(8431224811L);
		numb.add(8431224812L);
		numb.add(8431224813L);
		numb.add(8431224814L);
		numb.add(8431224814L);
		numb.add(8431224815L);
		numb.add(8431224815L);
		numb.add(8431224816L);
		numb.add(8431224815L);
		numb.add(8431224817L);
		numb.add(8431224818L);
		numb.add(8431224818L);
		numb.add(8431224811L);
		numb.add(8431224819L);
		numb.add(8431224810L);
		numb.add(8431224818L);
		numb.add(8431224815L);
		numb.add(8431224812L);
		numb.add(8431224821L);
		numb.add(8431224831L);
		numb.add(8431224831L);
		numb.add(8431224841L);
		numb.add(8431224851L);
		numb.add(8431224851L);
		numb.add(8434224851L);
		numb.add(8431224811L);
		numb.add(8431224811L);
		numb.add(8431234811L);
		numb.add(8431244811L);
		numb.add(8431254811L);
		System.out.println("array lenthg is:"+numb.size());
		Iterator<Long> ref=numb.iterator();
		while(ref.hasNext()) {
			Long phone=ref.next();
			System.out.println("phone minber is:"+phone);
		}
		
	}

}
