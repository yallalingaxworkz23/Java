package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.BusRepo;
import com.xworkz.yella.app.repository.BusRepoImpl;
import com.xworkz.yella.app.service.BusService;
import com.xworkz.yella.app.service.BusServiceImpl;

public class BusRunner {

	public static void main(String[] args) {
	BusRepo busRepo= new BusRepoImpl();
	BusService busService=new BusServiceImpl(busRepo);
	busService.viladateAndsave("karna");
	busService.viladateAndsave(null);

	}

}
