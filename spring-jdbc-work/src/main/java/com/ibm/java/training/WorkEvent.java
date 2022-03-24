package com.ibm.java.training;

import java.time.Clock;

import org.springframework.context.ApplicationEvent;

public class WorkEvent extends ApplicationEvent {

	public WorkEvent(Object source) {
		super(source);
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "New Learner added...";
	}

}

