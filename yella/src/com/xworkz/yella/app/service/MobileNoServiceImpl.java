package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.MobileNoRepo;

public class MobileNoServiceImpl  implements MobileNoService{
	
	private MobileNoRepo mobileNoRepo;
	public MobileNoServiceImpl(MobileNoRepo mobileNoRepo)
	{
		this.mobileNoRepo=mobileNoRepo;
	}


	@Override
	public void viladateAndsave(String phone) {
	  System.out.println("running in validateandsave method..");
	  if(phone != null && !phone.isEmpty() && phone.length()>4 && phone.length()<20) {
		  System.out.println("given number is valied..");
		  this.mobileNoRepo.save(phone);
	  }
		
	}
}
