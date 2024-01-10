package com.xworkz.SpringSinger.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.SpringSinger.dto.SongDTO;

@Repository
public class SongRepoImpl implements SongRepo{

	@Override
	public boolean save(SongDTO dto) {
		System.out.println("invoking the save method form SongRepo to SongRepoImpl..");
		return false;
	}

}
