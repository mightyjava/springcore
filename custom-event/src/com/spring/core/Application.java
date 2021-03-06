package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.event.publisher.UserDefinedEventPublisher;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Greetings greetings = (Greetings) context.getBean("greeting");
		System.out.println(greetings.getMessage());

		UserDefinedEventPublisher publisher = (UserDefinedEventPublisher) context.getBean("eventPublisher");
		publisher.publish();
	}
}
