package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld hw=context.getBean(HelloWorld.class);
		
		hw.setMessage("Hello World!");
		hw.getMessage();
				

	}

}
