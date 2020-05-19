package com.spring.core.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.spring.core.event.UserDefinedEvent;

public class UserDefinedEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		System.out.println("UserDefinedEventPublisher : setApplicationEventPublisher");
		this.publisher = publisher;
	}

	public void publish() {
		System.out.println("UserDefinedEventPublisher : publish");
		UserDefinedEvent userDefinedEvent = new UserDefinedEvent(publisher);
		publisher.publishEvent(userDefinedEvent);
	}

}
