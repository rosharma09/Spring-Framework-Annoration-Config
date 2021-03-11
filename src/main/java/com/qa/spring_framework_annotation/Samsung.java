package com.qa.spring_framework_annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {

	@Autowired
	Processors cpuProcessor;
	
	void config() {
		System.out.println("1. RAM - 16 GB , 2. Memory - 64GB , 3.Camera - 14 MP");
		;
		
		cpuProcessor.process();
	}

}
