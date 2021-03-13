package com.qa.spring_framework_qualifierExample;

import org.springframework.stereotype.Component;

@Component
public class Qualcomm implements Processor{

	public void process() {
		System.out.println("Qualcomm processor");
	}

}
