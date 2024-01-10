package com.xworkz.scientist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.scientist.dto.ScientistDTO;
import com.xworkz.scientist.repository.ScientistRepo;

@Service
public class ScientistServiceImpl implements ScientistService{
	
	@Autowired
	private ScientistRepo scientistRepo;

	@Override
	public boolean saveandValidate(ScientistDTO dto) {
		System.out.println("invoking in the ScientistServiceImpl");
		System.out.println("invoking in the ScientistService and data is saved..");
	boolean saved=	this.scientistRepo.save(dto);
	System.out.println("saving from saved "+saved);
		return true;
	}

}
