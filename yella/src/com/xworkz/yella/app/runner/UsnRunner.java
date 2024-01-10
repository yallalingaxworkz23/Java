package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.UsnRepositoryImpl;
import com.xworkz.yella.app.repository.UsnRepositry;
import com.xworkz.yella.app.service.UsnService;
import com.xworkz.yella.app.service.UsnServiceImpl;

public class UsnRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsnRepositry usnRepositry =new UsnRepositoryImpl();
		UsnService  usnService=new UsnServiceImpl(usnRepositry);
		usnService.validateAndSave("4su19cs114");
		usnService.validateAndSave("4su");
		usnService.validateAndSave("4su19cs113");
		usnService.validateAndSave("4su19cs113");
		usnService.validateAndSave("4su19cs113");
		usnService.validateAndSave("4su19cs113");
		usnService.validateAndSave("4su19cs113");
	}

}
