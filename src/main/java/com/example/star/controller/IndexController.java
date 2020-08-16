package com.example.star.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.star.servicce.IIndexService;

@RestController
@RequestMapping("/api/index")
public class IndexController {
	
	@Autowired
	private IIndexService indexService;

	
}
