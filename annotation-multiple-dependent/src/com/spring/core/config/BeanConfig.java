package com.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.core.pojo.Greetings;
import com.spring.core.pojo.Greetings3;

@Configuration
public class BeanConfig {

	@Bean
	@Scope(scopeName = "singleton")
	public Greetings createGreetings() {
		Greetings greetings = new Greetings();
		greetings.setMessage("Hello Spring");
		return greetings;
	}

	@Bean
	public Greetings3 createGreetings3() {
		Greetings3 greetings3 = new Greetings3();
		greetings3.setGreetings(createGreetings());
		return greetings3;
	}

}
