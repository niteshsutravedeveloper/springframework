package com.nt.webConfig;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class WebConfig {
	@Bean
	public HandlerMapping simpleUrlHandlerMapping() {
		SimpleUrlHandlerMapping handlerMapping=new SimpleUrlHandlerMapping();
		Properties prop=new Properties();
		prop.put("/aboutus.htm", "aboutController");
		handlerMapping.setMappings(prop);
		return handlerMapping;

	}

	@Bean
	public Controller aboutController() {
		ParameterizableViewController controller = new ParameterizableViewController();
		controller.setViewName("about_us");
		return controller;
	}
      @Bean	
	  public ViewResolver beanNameViewResolver() {
		  BeanNameViewResolver viewResolver=new BeanNameViewResolver();
		  return viewResolver;
	  }
      @Bean(name = "about_us")
      public View aboutUsView() {
    	JstlView view=new JstlView("/WEB-INF/jsp/about_us.jsp");
    	return view;
      }

}
