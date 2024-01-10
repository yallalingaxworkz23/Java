package com.xworkz.yella.app.runner;

import java.util.spi.LocaleServiceProvider;

import com.xworkz.yella.app.repository.LocatinRepositryImpl;
import com.xworkz.yella.app.repository.LocationRepositry;
import com.xworkz.yella.app.service.LocationService;
import com.xworkz.yella.app.service.LocationServiceImpl;

public class LocationRunner {

	public static void main(String[] args) {
	 
		LocationRepositry locationRepositry=new LocatinRepositryImpl();
		LocationService locationServer=new LocationServiceImpl(locationRepositry);
		locationServer.validateAndSave("Raichur");
		locationServer.validateAndSave("goa");

	}

}
