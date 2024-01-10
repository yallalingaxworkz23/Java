package com.xworkz.yella.app.repository;

public class UsnRepositoryImpl implements UsnRepositry {
	
	private String[] ussn=new String[TOTAL_ITEMS];
    public int start=0;
	@Override
	public void save(String usn) {
		
		System.out.println("running save in location Repositry..");
		if(start<TOTAL_ITEMS)
		{
			this.ussn[start]=usn;
			this.start++;
		}
		else {
			System.out.println("canot store ..");
		}
		
	} 
	

}
