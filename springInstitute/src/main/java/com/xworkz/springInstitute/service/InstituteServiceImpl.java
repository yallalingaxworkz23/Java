package com.xworkz.springInstitute.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springInstitute.dto.InstituteDTO;
import com.xworkz.springInstitute.repository.InstituteRepo;

@Service
public class InstituteServiceImpl implements InstituteService{
	
	@Autowired
	private InstituteRepo InstituteRepo;   

	@Override
	public boolean saveAndValidate(InstituteDTO dto) {
		System.out.println("invoking the saveAndValidate from InstituteService to InstituteServiceImpl..");
		this.InstituteRepo.save(dto);
		
		return true;
	}
	
	

}
