package com.xworkz.springInstitute.classes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springInstitute.dto.InstituteDTO;
import com.xworkz.springInstitute.service.InstituteService;

@Controller
@RequestMapping("/")
public class InstitutController {
	
	@Autowired
	private InstituteService instituteService;
	
	public InstitutController() {
		System.out.println("invoking the InstitutController..");
	}
	
	@PostMapping("/yallu")
	public String yallu(@Valid InstituteDTO dto,BindingResult error,Model model ) {
		System.out.println(" InstitutController mapping is occurs.."+dto);
		System.out.println(error.hasErrors());
		model.addAttribute("dto",dto);
		
		if(error.hasErrors()) {
			List<ObjectError> objecterror=error.getAllErrors();
			objecterror.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("errormessage",objecterror);
			model.addAttribute("textprint","data is not valid..");
			return "aboutinst";
		}else {
			boolean saved=this.instituteService.saveAndValidate(dto);
			if(saved) {
				model.addAttribute("valied","data is saved..");	
			}else {
				System.out.println("data is not saved..");
			}
			return "sucess";
		}
		
	}

}
