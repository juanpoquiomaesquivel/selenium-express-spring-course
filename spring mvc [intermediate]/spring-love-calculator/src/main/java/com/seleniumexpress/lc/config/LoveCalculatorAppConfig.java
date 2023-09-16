package com.seleniumexpress.lc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.seleniumexpress.lc.controllers")
public class LoveCalculatorAppConfig {

	// set up my view resolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}
}

/* SPRING MVC[ Intermediate]
 * https://www.youtube.com/watch?v=3x4RoGGpETM&list=PL3NrzZBjk6m_2jw8sC0BkEwSPFHxgQDWr&index=6&pp=iAQB - Data Binding - Full Stack tech walk through
 * 
 */
