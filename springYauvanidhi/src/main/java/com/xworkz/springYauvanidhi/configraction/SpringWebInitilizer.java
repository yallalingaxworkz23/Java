package com.xworkz.springYauvanidhi.configraction;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println(" invoking the getRootConfigClasses..");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("invoking the getServletConfigClasses..");
		return new Class[] {BenCofigraction.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println(" invoking the getServletMappings.. ");
		return new String[] {"/"};
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}

}
