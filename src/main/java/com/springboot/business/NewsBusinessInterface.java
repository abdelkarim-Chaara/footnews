package com.springboot.business;

import java.util.List;
import java.util.Optional;

import com.springboot.entities.News;

public interface NewsBusinessInterface {
	
	public List<News> getAll();
	public  Optional<News> getById(Integer x);
		
}
