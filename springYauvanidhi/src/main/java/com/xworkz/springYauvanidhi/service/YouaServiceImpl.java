package com.xworkz.springYauvanidhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springYauvanidhi.dto.YouaDTO;
import com.xworkz.springYauvanidhi.repository.YouaRepo;
@Service
public class YouaServiceImpl implements YouaService{
	
	@Autowired
	private YouaRepo youarepo; 

	@Override
	public boolean saveAndValidate(YouaDTO dto) {
		System.out.println("calling the saveAndValidate from YouaService to YouaServiceImpl..");
		boolean saves=this.youarepo.save(dto);
		return true;
	}

}
