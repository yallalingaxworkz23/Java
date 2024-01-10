package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.BusRepo;
import com.xworkz.yella.app.repository.BusRepoImpl;

public class BusServiceImpl implements BusService{
      private BusRepo busRepo;
      public BusServiceImpl(BusRepo busRepo) {
    	  this.busRepo=busRepo;
		
	}
	@Override
	public void viladateAndsave(String name) {
		System.out.println("running validateAndSave in Service..");
		if(name!=null && !name.isEmpty() && name.length()>4 && name.length()<20)
		{
			System.out.println("bus name is valid..");
			this.busRepo.save(name);
		}
		else
		{
			System.out.println("bus name is invalide");
		}
	}
	

}
