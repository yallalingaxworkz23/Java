package com.xworkz.springcamera.classes;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ClickComponent {
	
	public ClickComponent() {
	System.out.println("running in the onclick..");
	}
	@RequestMapping("/click")
	public  String onclick() {
		System.out.println("in string onclick...");
		return "index.jsp";
		
	}
	

}
