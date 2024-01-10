package com.xworkz.scientist.confiraction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.scientist")


public class BeanCofigraction {
	
	public BeanCofigraction() {
	System.out.println("bean configraction is created..");
	}
	
	
	@Bean
	 public ViewResolver resolver() {
	System.out.println("running in reserver...");
	ViewResolver resoler=new InternalResourceViewResolver("/",".jsp");
		return resoler;
			
		
	}
	

}
