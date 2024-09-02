package com.demo.Annotation_Spring.Annotation_Spring_maven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Coach {
	private Fortune fortune;
	
@Autowired
@Qualifier("goodFortune")
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return "Batting";
	}

	@Override
	public String getDiaet() {
		// TODO Auto-generated method stub
		return "Milk";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}