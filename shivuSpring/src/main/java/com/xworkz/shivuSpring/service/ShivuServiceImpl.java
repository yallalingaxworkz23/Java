package com.xworkz.shivuSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.shivuSpring.dto.ShivuDTO;
import com.xworkz.shivuSpring.repository.shivuRpo;

@Service
public class ShivuServiceImpl implements ShivuService{
	
	private shivuRpo shivurpo;

	@Override
	public boolean saveAndValidate(ShivuDTO shivudto) {
		System.out.println("calling saveandvalidate metod from shivuservice to shivuserviceImpl..");
		this.shivurpo.save(shivudto);
		return true;
	}

}
