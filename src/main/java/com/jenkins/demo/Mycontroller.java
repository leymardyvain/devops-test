package com.jenkins.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Mycontroller {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	 public String test(HttpServletRequest request)
	 {
		 return "test";
	 }

}
