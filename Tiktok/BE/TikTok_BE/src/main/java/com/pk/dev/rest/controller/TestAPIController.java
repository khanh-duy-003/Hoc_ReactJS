package com.pk.dev.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPIController {
	
	@GetMapping("/test")
	public List<String> test(){
		
		return Arrays.asList("test1","test2","test3","test14","test5");
	}

}
