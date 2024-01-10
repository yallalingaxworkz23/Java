package com.xworkz.yella.app.runner;

import com.xworkz.yella.app.repository.StudentRepo;
import com.xworkz.yella.app.repository.StudentRepoImpl;
import com.xworkz.yella.app.service.StudentService;
import com.xworkz.yella.app.service.StudentServiceImpl;

public class StudentRunner {

	public static void main(String[] args) {
		StudentRepo studentRepo=new StudentRepoImpl();
		StudentService studentService=new StudentServiceImpl(studentRepo);
		studentService.viladateAndsave("yallalinga");
		studentService.viladateAndsave("");
		studentService.viladateAndsave("yallalinga");
		studentService.viladateAndsave("yallalinga");
		studentService.viladateAndsave("yallalinga");
		studentService.viladateAndsave("yallalinga");
		studentService.viladateAndsave("yallalinga");
		studentService.viladateAndsave("yallalinga");
	}

}
