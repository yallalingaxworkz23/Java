package com.xworkz.SpringSinger.services;

import com.xworkz.SpringSinger.dto.SongDTO;

public interface SongService {
	
	boolean saveAndValidate(SongDTO dto );

}
