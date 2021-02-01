package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.nt.controller"})
@EnableWebMvc
public class Webconfig implements WebMvcConfigurer{
    @Bean
	public ViewResolver internalResourceViewResolver() {
    	InternalResourceViewResolver viewResolver=new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
    	return viewResolver;
    }
	/*
	 * @Bean public HandlerMapping requestMapHandlerMapping() {
	 * RequestMappingHandlerMapping mapping=new RequestMappingHandlerMapping();
	 * 
	 * return mapping; }
	 */	/*
		 * @Bean(value = "/headlines.htm") public Controller headlinesController() {
		 * ParameterizableViewController controller=new ParameterizableViewController();
		 * controller.setViewName("headlines"); return controller; }
		 */}
