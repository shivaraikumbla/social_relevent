package com.niit.configuration;

	import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
	//dispatcher-servlet.xml in project 1
	@Configuration
	@EnableWebMvc   //<mvc:annotation-driven>
	@ComponentScan(basePackages="com.niit")
	public class WebConfig extends WebMvcConfigurerAdapter{
	public WebConfig()
	{
		System.out.println("WEBCONFIG class is instantiated");
	}
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getCommonsMultipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(20971520); // 20MB
		multipartResolver.setMaxInMemorySize(1048576);	// 1MB
		return multipartResolver;
	}

	
	}


