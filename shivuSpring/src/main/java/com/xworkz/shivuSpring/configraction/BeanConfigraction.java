package com.xworkz.shivuSpring.configraction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.shivuSpring")
public class BeanConfigraction {
	
	public BeanConfigraction() {
	System.out.println("beanconfigraction is creatde....");
	}

	@Bean
	 public ViewResolver resolver() {
	System.out.println("running in reserver...");
	ViewResolver resoler=new InternalResourceViewResolver("/",".jsp");
		return resoler;
			
		
	}
}
