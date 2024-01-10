package com.xworkz.RakeshSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.RakeshSpring.dto.RakeshDTO;
import com.xworkz.RakeshSpring.reposetry.RakeshRepository;

@Service
public class RakeshServiceImpl  implements RakeshService{
	
	@Autowired
	private RakeshRepository rakeshpRepo;  

	@Override
	public boolean saveAndValidate(RakeshDTO dto) {
		System.out.println("calling the saveAndValidate from Rakeshservice to  RakeshServiceImpl..");
		return true;
	}

}
