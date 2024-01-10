package com.xworkz.scientist.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.scientist.dto.ScientistDTO;

@Repository
public class ScientistRepoImpl  implements ScientistRepo{

	@Override
	public boolean save(ScientistDTO scientistDTO) {
		// TODO Auto-generated method stub
		System.out.println("invoking save method from ScientistRepo to ScientistRepoImpl..");
		return true;
		
	}

}
