package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.nt.controller"})
public class WebConfig implements WebMvcConfigurer{
	//public HandlerMapping 
	
	
	
	/*
	 * @Bean(name = "/registrationform.htm") public Controller
	 * RegisterFormController() { ParameterizableViewController controller=new
	 * ParameterizableViewController();
	 * controller.setViewName("corona-patient-registration-form"); return
	 * controller; }
	 */
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/registerform.htm").setViewName("corona-patient-registration-form");
		registry.addViewController("/getpatientbyid.htm").setViewName("get_patient_by_id");
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		registry.jsp("/WEB-INF/jsp/",".jsp" );
	}

	

	
    
	
}
