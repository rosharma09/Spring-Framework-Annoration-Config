package com.qa.spring_framework_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//When working with annotation based configuration, 
//we need to create an annotation config class, which has the mapping for the beans
@Configuration
public class AnnotationConfig {

	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public Processors getProcessor() {
		return new Snapdragon();
	}
	
}
