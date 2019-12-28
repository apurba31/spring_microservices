package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private String name;
	private int id;
	
	@Autowired
	private Laptop laptop;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display()
	{
		System.out.println("My spring app is up now!");
		laptop.show();
	}
}
