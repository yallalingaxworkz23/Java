package com.xworkz.springstudent.configraction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration

@ComponentScan("com.xworkz.springstudent")
@EnableWebMvc
public class BenConfigraction {
	
	 public BenConfigraction() {
	System.out.println("beanConfigractin is created..");
	}
	 
	 @Bean
	 public ViewResolver resolver() {
	System.out.println("running in reserver...");
	ViewResolver resoler=new InternalResourceViewResolver("/",".jsp");
		return resoler;
	 }

}
