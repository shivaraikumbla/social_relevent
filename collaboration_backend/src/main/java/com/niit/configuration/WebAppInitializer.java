package com.niit.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//web.xml file in project 1
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
 public  WebAppInitializer() {
    System.out.println("WEBAPPINITIALIZER is Instantiated");
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{DBConfiguration.class};//WE LOAD DATABASE OBJECT
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}

