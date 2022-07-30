package com.Suresh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping
	public String getMessage() {
		return "hello good morning";
	}
}
