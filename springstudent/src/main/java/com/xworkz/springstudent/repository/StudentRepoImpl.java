package com.xworkz.springstudent.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.springstudent.dto.StudentDTO;

@Repository
public class StudentRepoImpl implements StudentRepo{

	@Override
	public boolean save(StudentDTO dto) {
		System.out.println("invoking the save method from studentRepo to StudentRepoImpl...");
		return true;
	}

}
