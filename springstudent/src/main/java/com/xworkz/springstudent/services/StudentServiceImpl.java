package com.xworkz.springstudent.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springstudent.dto.StudentDTO;
import com.xworkz.springstudent.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentRepo; 

	@Override
	public boolean saveAndValidate(StudentDTO studentDTO) {
		System.out.println("invoking in the StudentServiceImpl..in saveandvalidate method..");
		System.out.println("invoking in the StudentService in StudentServiceImpl");
		 boolean  savd=this.studentRepo.save(studentDTO);
		 System.out.println(" data is saved from repo.."+savd);
		 
		return true;
	}

}
