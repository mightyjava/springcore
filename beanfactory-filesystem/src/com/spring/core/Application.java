package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Application {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Greetings greetings = (Greetings) factory.getBean("greeting");
		System.out.println(greetings.getMessage());
	}
}
