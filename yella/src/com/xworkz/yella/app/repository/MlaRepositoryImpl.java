package com.xworkz.yella.app.repository;

public class MlaRepositoryImpl implements MlaRepository {

	private String[] mlas = new String[TOTAL_ITEMS];
	private int start = 0;

	@Override
	public void save(String mla) {

		System.out.println("running save in MLA Repository...");

		if (start < TOTAL_ITEMS) {
			this.mlas[start] = mla;
			this.start++;
		} else {
			System.err.println("cannot save, store is full...");
		}

	}

}
