package com.xworkz.SpringSinger.classes;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.SpringSinger.dto.SongDTO;
import com.xworkz.SpringSinger.services.SongService;

@Controller
@RequestMapping("/")
public class SongController {
	
	@Autowired
	private SongService service; 
	
	public SongController() {
		System.out.println("invoking in the SongController..");
	}
	
	@PostMapping("/music")
	public String yallalinga(@Valid SongDTO dto,BindingResult error,Model model) {
		System.out.println("requesting mapping is occurs.."+dto);
		System.out.println(error.hasErrors());
    	model.addAttribute("dto",dto);
		
		if(error.hasErrors()) {
			List<ObjectError> objecterror=error.getAllErrors();
			objecterror.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("errormessage",objecterror);
			model.addAttribute("texterror","data is not saved..");
			return "song";
		}else {
			boolean save= this.service.saveAndValidate(dto);
			if(save) {
				model.addAttribute("message", "data is saved..");
			}else {
				System.out.println("data is not saved..");
				
			}
		}
		return "songsuccess";
		
	}

}
