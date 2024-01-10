package com.xworkz.SpringSinger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.SpringSinger.dto.SongDTO;
import com.xworkz.SpringSinger.repository.SongRepo;

@Service
public class SongServiceImpl implements SongService{

	@Autowired
	private SongRepo songRepo;
	@Override
	public boolean saveAndValidate(SongDTO dto) {
		System.out.println("invoking the saveAndValidate from SongService to SongServiceImpl..");
		boolean saved=this.songRepo.save(dto);
		System.out.println("saving from saved..");
		return true;
	}

}
