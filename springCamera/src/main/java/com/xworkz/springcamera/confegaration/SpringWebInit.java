package com.xworkz.springcamera.confegaration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("invoking in the getRootConfigClasses.. ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("invoking in the getServletConfigClasses.. ");
		return new Class[] {BeanConfigraction.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("invoking in the getServletMappings.. ");
		return new String[] {"/"};
	}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	// TODO Auto-generated method stub
	configurer.enable();
}
}
