package com.xworkz.springYauvanidhi.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.springYauvanidhi.dto.YouaDTO;

@Repository
public class YouaRepoImpl implements YouaRepo{

	@Override
	public boolean save(YouaDTO dto) {
		System.out.println("calling the save method from YouaRepo to YouaRepoImpl..");
		return true;
	}

}
