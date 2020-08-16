package com.example.star.servicce.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.star.dao.IndexDao;
import com.example.star.entity.PublicityApp;
import com.example.star.servicce.IIndexService;
import com.example.star.util.Results;

@Service
public class IndexServiceImpl implements IIndexService{

	@Autowired
	private IndexDao indexDao;

	@Override
	public Results<List<PublicityApp>> listPublicity(Integer type) {
		Results<List<PublicityApp>> results = new Results<>();
		//根据type查询数据，不分页
		List<PublicityApp> list = indexDao.listPublicity(type);
		results.setStatus("0");
		results.setData(list);
		
		return results;
	}
}
