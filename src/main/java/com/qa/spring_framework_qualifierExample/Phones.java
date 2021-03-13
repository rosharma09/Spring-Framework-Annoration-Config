package com.qa.spring_framework_qualifierExample;

public interface Phones extends Communication{

	String category = "Mobile Phones";
	
	Dailer openDialer();
	
	void callNumber(String numberToCall);
}
