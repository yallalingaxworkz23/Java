package com.xworkz.springpg.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.springpg.dto.PgDTO;

@Repository
public class PgRepoImpl implements PgRepo{

	@Override
	public boolean save(PgDTO dto) {
		System.out.println("calling the save method from PgRepo to PgRepoImpl");
		return true;
	}

}
