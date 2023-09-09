package com.seleniumexpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class LoveCalculatorApplicationInitializer implements WebApplicationInitializer {

	@Override
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
	}
}

/* SPRING MVC[ Intermediate]
 * https://www.youtube.com/watch?v=40YaLHbrwrY&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=1&pp=iAQB - Spring MVC Course Preview || Road map
 * https://www.youtube.com/watch?v=LxjxWE1StBk&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=2&pp=iAQB - Spring MVC Java Based Configuration || Game plan
 * https://www.youtube.com/watch?v=bA9wqGUTduw&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=3&pp=iAQB - NO WEB.XML ? || Spring MVC Java based configuration || WebApplicationInitializer
 * https://www.youtube.com/watch?v=Hk7fRv-GHpM&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=4&pp=iAQB - NO XML - Spring MVC Java-based configuration in 9 steps || Spring Annotation
 */