package omkarsirnewoneSpring.configraction;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitilazer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("invoking in the getRootConfigClasses..");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("invokingn in the getServletConfigClasses...");
		// TODO Auto-generated method stub
		return new Class[] {BenConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("invoking in the getServletMappings...");
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

}