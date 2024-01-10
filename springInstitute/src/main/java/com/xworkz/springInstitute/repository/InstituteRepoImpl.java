package com.xworkz.springInstitute.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.springInstitute.dto.InstituteDTO;
@Repository
public class InstituteRepoImpl implements InstituteRepo{

	@Override
	public boolean save(InstituteDTO dto) {
		System.out.println("invoking save from InstituteRepo to InstituteRepoImpl..");
		return true;
	}

}
