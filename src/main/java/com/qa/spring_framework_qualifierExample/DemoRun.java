package com.qa.spring_framework_qualifierExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoRun {

	public static void main(String[] args) {
		
		ApplicationContext appfactory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Phones p1 = appfactory.getBean(Samsung.class);
		p1.openDialer().dailerMenu();
		p1.callNumber(String.valueOf(1234));
		
	}

}
