package com.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.config.BeanConfig;
import com.spring.core.config.BeanConfig2;
import com.spring.core.pojo.Greetings;
import com.spring.core.pojo.Greetings2;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanConfig.class, BeanConfig2.class);
		context.refresh();

		Greetings greetings = (Greetings) context.getBean(Greetings.class);
		System.out.println(greetings + " : " + greetings.getMessage());

		Greetings2 greetings2 = (Greetings2) context.getBean(Greetings2.class);
		System.out.println(greetings2 + " : " + greetings2.getMessage());
	}
}
