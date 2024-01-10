package com.xworkz.scientist.classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xworkz.scientist.dto.ScientistDTO;
import com.xworkz.scientist.service.ScientistService;

@Controller
@RequestMapping("/")
public class ScientistContoller {
	
	 private static String UPLOADED_FOLDER = "C:\\Users\\yallalinga\\Desktop\\fileupload\\fileuploadinside\\";
	@Autowired
	private ScientistService scientistService;

	public ScientistContoller() {
		System.out.println("invoking in the  scientistContoller..");
	}

	@PostMapping("/kumar")
	public String yallalinga(@Valid ScientistDTO scientistDTO, BindingResult error, Model model) {
		System.out.println("requisting mapping is occurs.." + scientistDTO);
		model.addAttribute("dto", scientistDTO);
		System.out.println(error.hasErrors());
		if (error.hasErrors()) {
			List<ObjectError> objerr = error.getAllErrors();
			objerr.forEach(y -> System.err.println(y.getObjectName() + "message" + y.getDefaultMessage()));
			model.addAttribute("errmessage", objerr);
			model.addAttribute("notvalid", "data not valied..");
			model.addAttribute("texteror", "data is not saved..");
			return "scientist";

		} else {
			
			boolean save = this.scientistService.saveandValidate(scientistDTO);
			if (save) {
				model.addAttribute("message", "data is saved..");
				
			} else {
				System.out.println("data is not saved...");
				
			}

		return "scientistsuccess";

		}
		}
	 @PostMapping("/upload") // //new annotation since 4.3
	    public String singleFileUpload(@RequestParam("file") MultipartFile file,
	                                   RedirectAttributes redirectAttributes,Model model) {

	        if (file.isEmpty()) {
	            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
	           model.addAttribute("mesage", "please select a file to uplode..");
	            return "scientistsuccess";
	        }

	        try {

	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);

//	            redirectAttributes.addFlashAttribute("message", 
//	                        "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return "successupload";
	    }

	}
