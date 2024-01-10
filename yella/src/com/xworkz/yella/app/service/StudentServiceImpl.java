package com.xworkz.yella.app.service;

import com.xworkz.yella.app.repository.StudentRepo;

public class StudentServiceImpl  implements StudentService{
	
	private StudentRepo studentRepo;
	public StudentServiceImpl(StudentRepo studentRepo)
	{
		this.studentRepo=studentRepo;
	}
	@Override
	public void viladateAndsave(String name) {
	 if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20)
	 {
		 System.out.println("student name is valid ..");
		 this.studentRepo.save(name);
	 }else {
		 System.out.println("name is invalid r unable to store..");
	 }
		
	}

}
