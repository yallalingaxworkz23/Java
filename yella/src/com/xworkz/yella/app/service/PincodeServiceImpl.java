package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.PincodeRepo;

public class PincodeServiceImpl  implements PincodeService {
	
	private PincodeRepo pincodeRepo;
	public PincodeServiceImpl( PincodeRepo pincodeRepo)
			{
		              this.pincodeRepo=pincodeRepo;
			}


	@Override
	public void viladateAndsave(int pincode) {
    if(pincode!=0 ) {     
    	
    	System.out.println(" given pin is valide.. and storing");
    	this.pincodeRepo.save(pincode);
    	
    }else
    {
    	System.out.println(" given pin is invalid r it contain longer character");
    }
	}
	
}
