package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.pojo.Greetings;

@Configuration
public class BeanConfig {

	@Bean
	public Greetings createGreetings() {
		Greetings greetings = new Greetings();
		greetings.setMessage("Hello Spring");
		return greetings;
	}

}
