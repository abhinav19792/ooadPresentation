package com.spring.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	int id;
	String name;
	
	// Dependency Injection
	@Autowired
	Engine eng;
	
	public Car() {
		System.out.println("car created");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void start() {
		eng.startEngine();
		System.out.println("car started");
	}
	
	public void stop() {
		eng.stopEngine();
		System.out.println("car stopped");
	}
	public void takeTurn() {
		System.out.println("turned");
	}
}
