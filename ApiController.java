package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ApiModel;


@RestController
public class ApiController {
	
	@GetMapping("/")
	
	public ApiModel fun()
	{
		return new ApiModel("shakthi Priyanka");
	}

}
