package com.xworkz.springYauvanidhi.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springYauvanidhi.dto.YouaDTO;
import com.xworkz.springYauvanidhi.service.YouaService;

@Controller
@RequestMapping("/")
public class YouaController {
	
	@Autowired
	private YouaService youaservice;
	
	public YouaController() {
	System.out.println("invokig in the YouaController..");
	}
	
	@PostMapping("/youa")
	public String yallu(YouaDTO dto ,BindingResult error,Model model) {
		System.out.println("mapping occurs.."+dto);
		System.out.println(error.hasErrors());
		model.addAttribute("dto",dto);
		if(error.hasErrors()) {
			List<ObjectError> objecterrors=error.getAllErrors();
			objecterrors.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("errormessage",objecterrors);
			model.addAttribute("messageforerror","data is not valid");
			return "aboutyoua";
		}else {
			boolean save= this.youaservice.saveAndValidate(dto);
			if(save) {
				model.addAttribute("positive","data is saved..");
			}else {
				System.out.println("data is not saved..");
			}
			return "success";
		}
		
		
	}

}
