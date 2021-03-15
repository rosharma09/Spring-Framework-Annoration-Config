package com.qa.spring_framework_practice;

import org.springframework.stereotype.Component;

@Component
public class MackBookPro implements Laptops {

	public void musicPlayer() {
		System.out.println("Start the music player");
	}

	public void taskManager() {
		System.out.println("Start the task manager");
	}

	public void camera() {
		System.out.println("Start the camera");
	}

}
