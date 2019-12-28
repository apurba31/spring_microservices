package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop 
{
	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void show()
	{
		System.out.println("Laptop is up and running!");
	}
}
