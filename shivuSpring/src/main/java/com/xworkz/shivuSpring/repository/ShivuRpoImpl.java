package com.xworkz.shivuSpring.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.shivuSpring.dto.ShivuDTO;

@Repository
public class ShivuRpoImpl  implements shivuRpo{

	@Override
	public boolean save(ShivuDTO shivudto) {
		System.out.println(" calling save from shivurpo to shivurpoimpl...");
		return true;
	}

}
