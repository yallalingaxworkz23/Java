package com.xworkz.yella.app.repository;

public class LocatinRepositryImpl implements LocationRepositry{
	
	private String[] places=new String[TOTAL_ITEMS];
	private int start=0;

	@Override
	public void save(String place) {
		
		System.out.println("running save in location Repositry..");
		
		if(start<TOTAL_ITEMS)
		{
			this.places[start]=place;
			this.start++;
		}
		else {
			System.out.println("cannot save store is full..");
		}
		
	}
	
	

}
