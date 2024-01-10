package com.xworkz.yella.app.repository;

public class StudentRepoImpl  implements StudentRepo{
	
	private String[] names=new String[TOTLA_ITEMS];
   public int start =0;
	@Override
	public void save(String name) {
		if(start<TOTLA_ITEMS)
		{
			System.out.println("running in the studentrepo..");
			this.names[start]=name;
			this.start++;
		}else {
			System.out.println("invalid r storage is full unable to store..");
		}
		
	}
	

}
