package com.anand.retail;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class TestService {

	@RequestMapping("/")
	String home(){
		return "Hello World";
	}
	
	@RequestMapping("/today")
	String today(){
		return new Date().toString();
	}
}
