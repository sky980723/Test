package com.example.star.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.star.entity.PublicityApp;
import com.example.star.servicce.IIndexService;
import com.example.star.util.Results;

@RestController
@RequestMapping("/api/index")
public class IndexController {

	@Autowired
	private IIndexService indexService;

	@RequestMapping(value = "/publicity", method = RequestMethod.GET)
	public Results<List<PublicityApp>> listPublicity(@RequestParam(name = "type", required = true) Integer type) {

		return indexService.listPublicity(type);
	}

}
