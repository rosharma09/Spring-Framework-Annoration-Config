package com.qa.spring_framework_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qa.spring_framework_qualifierExample.AppConfig;

public class DemoMainRunner {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Laptops m1 = context.getBean(MackBookPro.class);
		m1.musicPlayer();
		
	}

}
