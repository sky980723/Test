package com.example.star.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.star.entity.PublicityApp;

public interface IndexDao {

	public List<PublicityApp> listPublicity(@Param("type") Integer type);

}
