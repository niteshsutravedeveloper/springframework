package com.nt.handlers;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletHandler implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// TODO Auto-generated method stub
		XmlWebApplicationContext appIoc=new XmlWebApplicationContext();
		appIoc.setConfigLocation("/WEB-INF/application_beans.xml");
		ContextLoaderListener listener=new ContextLoaderListener(appIoc);
		servletContext.addListener(listener);
		
		XmlWebApplicationContext webIoc=new XmlWebApplicationContext();
		webIoc.setConfigLocation("/WEB-INF/dispatcher_servlet.xml");
 		DispatcherServlet ds=new DispatcherServlet(webIoc);
 		Dynamic dynamic = servletContext.addServlet("dispatcherServlet", ds);
 		dynamic.addMapping("*.htm");
 		dynamic.setLoadOnStartup(1);
		
	}
	

}
