package com.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.refresh();
		context.start();
		Greetings greetings = (Greetings) context.getBean("greeting");
		System.out.println(greetings.getMessage());
		context.stop();
		context.close();
	}
}
