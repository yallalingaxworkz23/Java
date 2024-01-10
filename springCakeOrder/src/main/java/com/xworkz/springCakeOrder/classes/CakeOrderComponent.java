package com.xworkz.springCakeOrder.classes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwork.springCaleOrder.classDTO.CakeOrderDTO;

@Component
@RequestMapping("/")
public class CakeOrderComponent {

	public CakeOrderComponent() {
		System.out.println(" invoking in the CakeOrderComponent..");
	}

	@PostMapping("/yallalinga")
	public String yallu(@Valid CakeOrderDTO cakeorderDTO, BindingResult err,Model model) {
		System.out.println("request maping is occers.."+cakeorderDTO);
		System.out.println(err.hasErrors());
		model.addAttribute("message", "cakeorderDTO is saved..");
		model.addAttribute("cust", cakeorderDTO);
		
		List<ObjectError> objerror=err.getAllErrors();
    	objerror.forEach(y->System.err.println(y.getObjectName()+"messages"+y.getDefaultMessage()));
//    	model.addAttribute("frenterror",objerror);
		return "index";
	}

}
