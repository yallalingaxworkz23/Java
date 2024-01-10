package com.xworkz.SpringSinger.repository;

import com.xworkz.SpringSinger.dto.SongDTO;

public interface SongRepo {
	
	boolean save(SongDTO dto);

}
