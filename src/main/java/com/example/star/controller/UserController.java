package com.example.star.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.star.servicce.IUserServie;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
	
	@Autowired
	private IUserServie userServie;

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String helloWorld() {
		
		return userServie.helloWorld();
	}
}
