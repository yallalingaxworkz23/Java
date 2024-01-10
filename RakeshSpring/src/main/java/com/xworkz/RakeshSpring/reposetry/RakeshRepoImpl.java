package com.xworkz.RakeshSpring.reposetry;

import org.springframework.stereotype.Repository;

import com.xworkz.RakeshSpring.dto.RakeshDTO;

@Repository
public class RakeshRepoImpl  implements RakeshRepository{

	@Override
	public boolean validate(RakeshDTO dto) {
		System.out.println("calling the validate from rakeshRepo to rakeshRepoImpl..");
		return true;
	}

}
