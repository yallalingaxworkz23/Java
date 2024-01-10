package com.xworkz.RakeshSpring.configraction;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitilazer  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {BeanConfigraction.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	// TODO Auto-generated method stub
	configurer.enable();
}
@Override
protected void customizeRegistration(ServletRegistration.Dynamic registration) {

    // upload temp file will put here
    File uploadDirectory = new File("C:\\Users\\yallalinga\\Desktop\\fileupload\\fileuploadinside");

    // register a MultipartConfigElement
    MultipartConfigElement multipartConfigElement =
            new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
                    maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

    registration.setMultipartConfig(multipartConfigElement);

}

}
