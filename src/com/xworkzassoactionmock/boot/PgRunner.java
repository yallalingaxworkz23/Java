package com.xworkzassoactionmock.boot;

import com.xworkzassoactionmock.app.Pg;
import com.xworkzassoactionmock.app.Rooms;

public class PgRunner {
	
	public static void main(String[] args) {
		
		Rooms rm=new Rooms();
		rm.setName("Nisarga");
		rm.setNrooms(20);
		rm.setRfloor(3);
		rm.setRno(112);
		

		Rooms rm1=new Rooms();
		rm1.setName("Sai");
		rm1.setNrooms(24);
		rm1.setRfloor(4);
		rm1.setRno(109);
		
		
		Pg pg=new Pg();
		pg.setRooms(rm);
		System.out.println(rm);
		System.out.println(rm1);
	}

}
