package com.example.star.servicce.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.star.dao.IndexDao;
import com.example.star.servicce.IIndexService;

@Service
public class IndexServiceImpl implements IIndexService{

	@Autowired
	private IndexDao indexDao;
}
