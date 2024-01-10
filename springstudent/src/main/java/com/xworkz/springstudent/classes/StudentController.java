package com.xworkz.springstudent.classes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springstudent.dto.StudentDTO;
import com.xworkz.springstudent.services.StudentService;

@Controller
@RequestMapping("/")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	@PostMapping("/kumar")
	public String yallu(@Valid StudentDTO studentDTO,BindingResult error,Model model) {
		System.out.println("mapping is completedd."+studentDTO);
		System.out.println(error.hasErrors());
		if(error.hasErrors()) {
			List<ObjectError> objer=error.getAllErrors();
			objer.forEach(y->System.out.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("erroermessage", objer);
			model.addAttribute("notvalid","data is not valid..");
		}else {
		boolean save=this.studentService.saveAndValidate(studentDTO);
		if(save) {
			model.addAttribute("massage", "data is saved..");
		}else {
			System.out.println("data is not saved..");
			model.addAttribute("error","data is not saved..");
		}
		}
		return "studentinfostore";
	}
	

}
