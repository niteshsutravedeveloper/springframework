package com.ds.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class WebConfig {

	@Bean(name = "/contactus.htm")
	public Controller contactUsController() {
		ParameterizableViewController controller = new ParameterizableViewController();
		controller.setViewName("contactus");
		return controller;
	}

	@Bean
	public ViewResolver beanNameViewResolver() {
		BeanNameViewResolver viewResolver = new BeanNameViewResolver();
		return viewResolver;
	}

	@Bean( name = "contactus")
	public View contactView() {
		JstlView view = new JstlView("/WEB-INF/jsp/contactus.jsp");
		return view;
	}
}
