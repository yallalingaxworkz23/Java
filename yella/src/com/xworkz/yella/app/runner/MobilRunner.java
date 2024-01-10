package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.MobileNoRepo;
import com.xworkz.yella.app.repository.MobileNoRepoImpl;
import com.xworkz.yella.app.service.MobileNoService;
import com.xworkz.yella.app.service.MobileNoServiceImpl;

public class MobilRunner {

	public static void main(String[] args) {
		MobileNoRepo mobileNoRepo = new MobileNoRepoImpl();
		MobileNoService mobileNoService = new MobileNoServiceImpl(mobileNoRepo);
		mobileNoService.viladateAndsave("890");
		mobileNoService.viladateAndsave(null);
	}
}
