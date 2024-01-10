package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.CountryReop;

public class CountryServiceImpl implements CountryService {

	private CountryReop countryRepo;

	public CountryServiceImpl(CountryReop countryReop) {
		this.countryRepo = countryReop;
	}

	@Override
	public void viladateAndsave(String name) {
		// TODO Auto-generated method stub
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() < 20) {
			System.out.println("given name is valide ");
			//if(!this.countryRepo.isExist(name))												
			this.countryRepo.save(name);
		} else {
			System.out.println("name is invalide r unable to store");
		}
	}

}
