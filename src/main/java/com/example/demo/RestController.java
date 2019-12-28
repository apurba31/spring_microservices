package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@org.springframework.web.bind.annotation.RestController
public class RestController 
{
	@GetMapping("/testGet")
	public void getMethod()
	{
		System.out.println("My get response is working now!");
	}
	
	@PostMapping("/testPost")
	public void postMethod()
	{
		System.out.println("My post response is working now!");
	}
}
