package com.xworkz.yella.app.repository;

public class MobileNoRepoImpl implements MobileNoRepo{
	
	private String[] phones=new String[TOTAL_ITEMS];
    public int start=0;
	@Override
	public void save(String phone) {
		System.out.println("running in the repoimplement");
		if(start<TOTAL_ITEMS)
		{
			this.phones[start]=phone;
			this.start++;
		}
		else
		{
			System.out.println("unable to store");
		}
		
	}

}
