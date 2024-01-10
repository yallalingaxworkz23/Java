package com.xworkz.springcamera.confegaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springcamera")
public class BeanConfigraction  {
	
	public BeanConfigraction() {
	System.out.println("configraction id created..");
	}

}
