package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.MlaRepository;

public class MlaServiceImpl implements MlaService {

	private MlaRepository mlaRepository;

	 public MlaServiceImpl(MlaRepository mlaRepository) {
		this.mlaRepository = mlaRepository;
	}

	@Override
	public void validateAndSave(String mla) {

		System.out.println("running validateAndSave in Service..");
		if (mla != null && !mla.isEmpty() && mla.length() > 3 && mla.length() < 20) {
			System.out.println("Mla name is valid, will save");
			this.mlaRepository.save(mla);
		} else {
			System.err.println("Mla name is invalid...will not save");
		}

	}

}
