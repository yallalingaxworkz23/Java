package com.xworkz.springpg.classes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springpg.dto.PgDTO;
import com.xworkz.springpg.services.PgService;

@Controller
@RequestMapping("/")
public class PgController {
	@Autowired
	private PgService pgService;
	
	public PgController() {
	System.out.println("invoking in the PgController..");
	}
	
	@PostMapping("/pg")
	public String yallu(@Valid PgDTO dto,BindingResult error,Model model) {
		System.out.println("mapping is occurs.."+dto);
		System.out.println(error.hasErrors());
		model.addAttribute("dto", dto);
		
		if(error.hasErrors()) {
			List<ObjectError> objecterror=error.getAllErrors();
			objecterror.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("messageerror", objecterror);
			model.addAttribute("texterroe","data is not valid");
			return "aboutpg";
		}else {
			boolean saved= this.pgService.saveAndValidate(dto);
			if(saved) {
				model.addAttribute("saved","data is saved..");
			}else {
				System.out.println("data is not saved..");
			}
			
		}
		return "pgsucces";
	}

}
