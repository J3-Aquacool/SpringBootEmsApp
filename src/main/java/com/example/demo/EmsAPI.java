package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmsAPI 

{

	
	@GetMapping("/hello")
	public String getData()
	{
		
		return "hello";
	}
}
