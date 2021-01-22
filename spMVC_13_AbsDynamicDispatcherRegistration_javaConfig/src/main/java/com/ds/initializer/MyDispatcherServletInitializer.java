package com.ds.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import com.ds.config.RootConfig;
import com.ds.config.WebConfig;

public class MyDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"*.htm"};
	}
	

	/*
	 * @Override protected WebApplicationContext createServletApplicationContext() {
	 * // TODO Auto-generated method stub AnnotationConfigWebApplicationContext
	 * webIoc=new AnnotationConfigWebApplicationContext();
	 * webIoc.register(WebConfig.class); return webIoc; }
	 * 
	 * @Override protected String[] getServletMappings() { // TODO Auto-generated
	 * method stub return new String[] {"*.htm"}; }
	 * 
	 * @Override protected WebApplicationContext createRootApplicationContext() { //
	 * TODO Auto-generated method stub AnnotationConfigWebApplicationContext
	 * rootIoc=new AnnotationConfigWebApplicationContext();
	 * rootIoc.register(RootConfig.class); return rootIoc; }
	 * 
	 */
}
