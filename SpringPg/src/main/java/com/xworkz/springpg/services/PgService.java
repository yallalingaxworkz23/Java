package com.xworkz.springpg.services;

import com.xworkz.springpg.dto.PgDTO;

public interface PgService {
	
	boolean saveAndValidate(PgDTO dto);

}
