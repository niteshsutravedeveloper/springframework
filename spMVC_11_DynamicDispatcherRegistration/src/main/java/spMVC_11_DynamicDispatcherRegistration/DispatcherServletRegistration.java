package spMVC_11_DynamicDispatcherRegistration;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;



public class DispatcherServletRegistration extends AbstractDispatcherServletInitializer{
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		// TODO Auto-generated method st
		XmlWebApplicationContext rootIoc=new XmlWebApplicationContext();
		rootIoc.setConfigLocation("\\WEB-INF\\application_beans.xml");
		return rootIoc;
	}
	@Override
	protected WebApplicationContext createServletApplicationContext() {
		// TODO Auto-generated method stub
		XmlWebApplicationContext webIoc=new XmlWebApplicationContext();
		webIoc.setConfigLocation("\\WEB-INF\\dispatcher_servlet.xml");
		return webIoc;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"*.htm"};
	}

	
	

	}
