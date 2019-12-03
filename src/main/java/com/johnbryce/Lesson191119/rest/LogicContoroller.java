package com.johnbryce.Lesson191119.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/welcome")
public class LogicContoroller {
	
	@GetMapping("/login")
	public ResponseEntity<?> checkLogin(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password, @RequestParam(name = "state") String state) {
		if (email.equalsIgnoreCase("1@gmail.com") & password.equals("12345") & state.equalsIgnoreCase("admin")) {
			return new ResponseEntity<>("Welcome Admin", HttpStatus.OK);
		} else if (email.equalsIgnoreCase("2@gmail.com") & password.equals("12345") & state.equalsIgnoreCase("company")) {
			return new ResponseEntity<>("Welcome Company", HttpStatus.OK);
		} else if (email.equalsIgnoreCase("3@gmail.com") & password.equals("12345") & state.equalsIgnoreCase("customer")) {
			return new ResponseEntity<>("Welcome Customer", HttpStatus.OK);
		}

		return new ResponseEntity<>("Hit the road!", HttpStatus.FORBIDDEN);

	}

}
