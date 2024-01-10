package com.xworkz.shivuSpring.classes;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.cfg.defs.DecimalMaxDef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.shivuSpring.dto.ShivuDTO;
import com.xworkz.shivuSpring.service.ShivuService;

@Controller
@RequestMapping("/")
public class ShivuControllar {
	
	@Autowired
	private ShivuService shivuservice;
 
	public ShivuControllar() {
	System.out.println("under the controller..");
	}
	
	@PostMapping("/shivu")
	public String name(@Valid ShivuDTO shivudto ,BindingResult error,Model model) {
		System.out.println("mapping is occurs.."+shivudto);
		model.addAttribute("dto", shivudto);
		
		System.out.println(error.hasErrors());
		if(error.hasErrors()) {
			List<ObjectError> objectErrors=error.getAllErrors();
			objectErrors.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("erroemessage", objectErrors);
			model.addAttribute("text", "data is not valid...");
			return "about";
		}else {
			boolean saved= this.shivuservice.saveAndValidate(shivudto);
			
			if(saved) {
				model.addAttribute("good", "data is saved...");
		}else{
			model.addAttribute("bad", "data is naot saved..");
			System.out.println("data is nod saved..");
		}
			return "success";
		}
		
		
	}
}
