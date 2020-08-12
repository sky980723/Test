package com.example.star.servicce.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.star.dao.UserDao;
import com.example.star.servicce.IUserServie;

@Service
public class UserServiceImpl implements IUserServie{

	@Autowired
	private UserDao userDao;

	@Override
	public String helloWorld() {
		
		return "hello,world";
	}
}
