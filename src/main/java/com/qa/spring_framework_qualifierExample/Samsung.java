package com.qa.spring_framework_qualifierExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Phones {
	
	@Autowired
	@Qualifier("qualcomm")
	Processor mobileProcessor;
	
	

	public Dailer openDialer() {
		return new Dailer();
		
	}

	public void callNumber(String numberToCall) {
		System.out.println(category);
		this.mobileProcessor.process();
	}

	public void communicate() {
		
	}

}
