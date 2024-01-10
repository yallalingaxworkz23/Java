package com.xworkz.omkarsirsecond.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.omkarsirsecond")
@Configuration
public class BenConfigraction {

	public BenConfigraction() {
		System.out.println("configraction is created...");
		// TODO Auto-generated constructor stub
	}
	@Bean
	public Bottle bottle1() {
		System.out.println("bottle one is created..");
		return new Bottle();	
	}
//	@Bean
//	public Bulb bulb() {
//		return new Bulb();
//		
//	}
//	
//	@Bean
//	public Perfume perfume() {
//		return new Perfume();
//		
//	}
//	
//	@Bean
//	public Generater generater() {
//		return new Generater();
//		
//	}
//	 
//	@Bean
//	public Elevator elevator() {
//		Perfume perfume=new Perfume();
//		return new Elevator(perfume);
//		
//	}
	
	@Bean
	public Scissor scissor() {
		return new Scissor();
	}
	
	@Bean
	public Scissor blade() {
	 return new Scissor();
	}

}
