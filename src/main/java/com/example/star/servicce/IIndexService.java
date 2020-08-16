package com.example.star.servicce;

import java.util.List;

import com.example.star.entity.PublicityApp;
import com.example.star.util.Results;

public interface IIndexService {

	public Results<List<PublicityApp>> listPublicity(Integer type);

}
