package com.xworkz.springpg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springpg.dto.PgDTO;
import com.xworkz.springpg.repository.PgRepo;

@Service
public class PgServiceImpl implements PgService{
	
	@Autowired
	private PgRepo pgRepo;

	@Override
	public boolean saveAndValidate(PgDTO dto) {
		System.out.println("invoking the saveAndValidate method from PgService to PgServiceImpl");
		 boolean saverepo= this.pgRepo.save(dto);
		return true;
	}

}
