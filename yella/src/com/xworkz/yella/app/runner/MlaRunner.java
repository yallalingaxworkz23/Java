package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.MlaRepository;
import com.xworkz.yella.app.repository.MlaRepositoryImpl;
import com.xworkz.yella.app.service.MlaService;
import com.xworkz.yella.app.service.MlaServiceImpl;

public class MlaRunner {

	public static void main(String[] args) {

		
		MlaRepository mlaRepository=new MlaRepositoryImpl();
		
		MlaService mlaService=new MlaServiceImpl(mlaRepository);//abstraction
		
		mlaService.validateAndSave("Zameer Khan");
		
		mlaService.validateAndSave("Za");
		
		
		
		
	}

}
