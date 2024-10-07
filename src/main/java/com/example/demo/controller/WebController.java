package com.example.demo.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/message")
	public ResponseEntity<String> getWelcomeMessage() {
		
		return ResponseEntity.of(Optional.of("Welcome to Docker SpringBoot Web Project"));
		
	}

}
