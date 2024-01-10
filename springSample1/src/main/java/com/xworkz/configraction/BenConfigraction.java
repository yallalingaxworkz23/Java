package com.xworkz.configraction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class BenConfigraction {
	
public BenConfigraction() {
	System.out.println("component is created..");
}	

}
