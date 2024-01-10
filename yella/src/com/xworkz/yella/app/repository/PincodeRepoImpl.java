package com.xworkz.yella.app.repository;

public class PincodeRepoImpl  implements PincodeRepo{
	
	private int[] pincodes=new int[TOTAL_ITEMS];
    public int start=0;
	@Override
	public void save(int pincode) {
		System.out.println(" running in the Repo and adding the values...");
		if(start<TOTAL_ITEMS)
		{
			this.pincodes[start]=pincode;
			this.start++;
		}else {
			System.out.println("given name is invalied r storage is full  unable to store..");
		}
		
	}
	
	

}
