package com.xworkz.springsample.classes;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Sample {
	public Sample() {
	System.out.println("invoking in the sample component..");
	}
	@RequestMapping("/Submit")
	public  String onsubmit() {
		System.out.println("running in the on submit method..");
		return "index.jsp";
	}

}
