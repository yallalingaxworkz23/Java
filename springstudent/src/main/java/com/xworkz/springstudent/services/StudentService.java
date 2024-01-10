package com.xworkz.springstudent.services;

import com.xworkz.springstudent.dto.StudentDTO;

public interface StudentService {

	boolean saveAndValidate(StudentDTO studentDTO);
}
