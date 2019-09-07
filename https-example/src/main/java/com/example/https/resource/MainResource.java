package com.example.https.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainResource {

	@GetMapping("/getData")
	public String getMessage() {
		return "Accessed By HTTPS Protocol ";
	}

}
