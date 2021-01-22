package com.nt.dsinitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootConfig;
import com.nt.webConfig.WebConfig;

public class DispatcherServletInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext rootIoc=new AnnotationConfigWebApplicationContext();
		rootIoc.register(RootConfig.class);
		ContextLoaderListener listener=new ContextLoaderListener(rootIoc);
		servletContext.addListener(listener);
		AnnotationConfigWebApplicationContext webIoc=new AnnotationConfigWebApplicationContext();
		webIoc.register(WebConfig.class);
		DispatcherServlet servlet=new DispatcherServlet(webIoc);
		Dynamic dynamic = servletContext.addServlet("ds", servlet);
		dynamic.addMapping("*.htm");
		dynamic.setLoadOnStartup(1);
		
	}
	
	

}
