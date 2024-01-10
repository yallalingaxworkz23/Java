package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.CountryReop;
import com.xworkz.yella.app.repository.CountryRepoImpl;
import com.xworkz.yella.app.service.CountryService;
import com.xworkz.yella.app.service.CountryServiceImpl;

public class CountryRunner {

	public static void main(String[] args) {
		CountryReop countryReop=new CountryRepoImpl();
		CountryService countryService=new CountryServiceImpl(countryReop);
        countryService.viladateAndsave("India");
        countryService.viladateAndsave("srilanka");
        countryService.viladateAndsave("pak");

	}

}
