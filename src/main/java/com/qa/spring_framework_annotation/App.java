package com.qa.spring_framework_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		// We can use the object of class AnnotationConfigApplicationContext, in case if
		// we are using the ammotation based configuration in Spring

		// In case of the XML based configuration, we specify the XML file as the
		// parameter to the ClassPathXmlApplicationContext constructor

		// Where as in case of the Annotation based configuration, we need to pass the
		// configuraiton class
		ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);

		// getBean(ClassName.class) --> will return the object of the specified class
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}
}
