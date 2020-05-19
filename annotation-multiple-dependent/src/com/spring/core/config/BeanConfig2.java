package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.pojo.Greetings2;

@Configuration
public class BeanConfig2 {

	@Bean
	public Greetings2 createGreetings2() {
		Greetings2 greetings2 = new Greetings2();
		greetings2.setMessage("Hello Spring 2");
		return greetings2;
	}

}
