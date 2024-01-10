package com.xworkz.RakeshSpring.classes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Path;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xworkz.RakeshSpring.dto.RakeshDTO;
import com.xworkz.RakeshSpring.service.RakeshService;

@Controller
@RequestMapping("/")
public class RakeshControler {
	
	 private static String UPLOADED_FOLDER = "C:\\Users\\yallalinga\\Desktop\\fileupload\\fileuploadinside\\";
	
	@Autowired
	private RakeshService rakeshService; 
	
	public RakeshControler() {
	System.out.println("invokig in the RakeshControler ");
	}
	@PostMapping("/rakeshv")
	public String rakeshv(@Valid RakeshDTO dto, BindingResult error, Model model) {
		System.out.println("request mapping ic occurs.."+dto);
		model.addAttribute("dto", dto);
		System.out.println( error.hasErrors());
		
		if (error.hasErrors()) {	
			List<ObjectError> objecterrors=error.getAllErrors();
			objecterrors.forEach(y->System.err.println(y.getObjectName()+"message"+y.getDefaultMessage()));
			model.addAttribute("errormessage", objecterrors);
			model.addAttribute("text", "data not valid");
			return "aboutRakesh";
		}else {
			boolean saves= this.rakeshService.saveAndValidate(dto);
			if(saves) {
				model.addAttribute("news ", "data is saved..");
				System.out.println("data is valied..from saves..");
			}
			else {
				model.addAttribute("bad", "data is not saved..");
			}
			return "success";
		}
		
		
	}
	 @GetMapping("/")
	    public String index() {
	        return "upload";
	    }

	    //@RequestMapping(value = "/upload", method = RequestMethod.POST)
	    @PostMapping("/upload") // //new annotation since 4.3
	    public String singleFileUpload(@RequestParam("file") MultipartFile file,
	                                   Model model) {

	        if (file.isEmpty()) {
	        	model.addAttribute("message", "Please select a file to upload");
	            return "success";
	        }

	        try {

	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            java.nio.file.Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);

//	            redirectAttributes.addFlashAttribute("message", 
//	                        "You successfully uploaded '" + file.getOriginalFilename() + "'");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return "successuplode";
	    }


}
