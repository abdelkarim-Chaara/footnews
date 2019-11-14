package com.springboot.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entities.News;
import com.springboot.repo.NewsRepository;

@Service
@Transactional
public class NewsBusiness implements NewsBusinessInterface {
	@Autowired
	private  NewsRepository NewsRepos;
	public NewsBusiness(NewsRepository repos) {
		this.NewsRepos = repos;
	}
	
	
	public List<News> getAll() {
		
	return (List<News>) NewsRepos.GetALL();
	
	}



	
}

