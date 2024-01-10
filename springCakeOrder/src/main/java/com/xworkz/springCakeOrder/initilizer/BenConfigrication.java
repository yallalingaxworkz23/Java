package com.xworkz.springCakeOrder.initilizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.springCakeOrder")
public class BenConfigrication {
	
	public BenConfigrication() {
	System.out.println("Bean configraction is created..");
	}
	
	@Bean
	 public ViewResolver resolver() {
	System.out.println("running in reserver...");
	ViewResolver resoler=new InternalResourceViewResolver("/",".jsp");
		return resoler;
			

}
}