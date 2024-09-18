package com.iiht.springsecurity.securitycontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	@GetMapping("/")
	public String greet() {
		return "working";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "working Admin";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "working User";
	}

}
