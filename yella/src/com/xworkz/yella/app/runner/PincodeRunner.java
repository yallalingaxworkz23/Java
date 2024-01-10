package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.PincodeRepo;
import com.xworkz.yella.app.repository.PincodeRepoImpl;
import com.xworkz.yella.app.service.PincodeService;
import com.xworkz.yella.app.service.PincodeServiceImpl;

public class PincodeRunner {

	public static void main(String[] args) {
		PincodeRepo pincodeRepo=new PincodeRepoImpl();
		PincodeService pincodeService=new PincodeServiceImpl(pincodeRepo);
		pincodeService.viladateAndsave(0);
		pincodeService.viladateAndsave(1234538759);	
		pincodeService.viladateAndsave(625376348);
		pincodeService.viladateAndsave(625376348);
		pincodeService.viladateAndsave(625376348);
		pincodeService.viladateAndsave(625376348);
		pincodeService.viladateAndsave(625376348);
		pincodeService.viladateAndsave(625376348);



	}

}
