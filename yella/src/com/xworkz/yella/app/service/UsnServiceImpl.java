package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.UsnRepositry;

public class UsnServiceImpl implements UsnService{
	
	private UsnRepositry usnRepositry;
	public UsnServiceImpl(UsnRepositry usnRepositry) {
		this.usnRepositry=usnRepositry;
	}
	
	@Override
	public void validateAndSave(String usn) {
	 System.out.println("running validateAndSave in Service..");
		if (usn!=null && !usn.isEmpty() && usn.length()>5 && usn.length()<20)
		{
			System.out.println("given usn is vallid..");
			this.usnRepositry.save(usn);
		}
		else {
			System.out.println("given usn is invalide..");
		}
	}
	

}
