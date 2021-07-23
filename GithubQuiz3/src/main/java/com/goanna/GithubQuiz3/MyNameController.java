package com.goanna.GithubQuiz3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
	
	private static final String template = "Hello, %s!";
	
	@GetMapping("/myName")
	public MyName myName(@RequestParam(value = "name", defaultValue = "Jesse McC") String name) {
		return new MyName(String.format(template, name));
    }
}
