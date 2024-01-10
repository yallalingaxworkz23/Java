package com.xworkz.yella.app.repository;

public class CountryRepoImpl implements CountryReop{
	
	private String[] names=new String[TOTAL_ITEMS];
   public int start=0;
	@Override
	public void save(String name) {
		System.out.println("running in the contaryrepo..");
		if(start<TOTAL_ITEMS)
		{
			this.names[start]=name;
			this.start++;
		}
		else {
			System.out.println("invalid are unable to store..");
		}
		
	}
	
	
	
	

}
