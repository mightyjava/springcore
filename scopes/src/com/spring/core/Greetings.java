package com.spring.core;

public class Greetings {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("Init");
	}

	public void destroy() {
		System.out.println("Destroy");
	}

}
