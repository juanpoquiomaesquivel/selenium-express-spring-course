package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer /*implements WebApplicationInitializer*/ {

	/*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(LoveCalculatorAppConfig.class);
		
		// create a dispatcher servlet object
		DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

		// register dispatcher servlet with the servlet context object
		ServletRegistration.Dynamic myCustomServletDispatcher = servletContext.addServlet("myDispatcherServlet",
				dispatcherServlet);
		
		myCustomServletDispatcher.setLoadOnStartup(1);
		myCustomServletDispatcher.addMapping("/mywebsite.com/*");
	} */
}

/* SPRING MVC[ Intermediate]
 * https://www.youtube.com/watch?v=lJxUwcmdHro&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=5&pp=iAQB - Configure Dispatcher Servlet in just two lines of code. How does this magic happen?
 * 
 */