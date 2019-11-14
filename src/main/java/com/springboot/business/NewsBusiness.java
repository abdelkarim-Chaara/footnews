package com.springboot.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.entities.News;
import com.springboot.repo.NewsRepo;

@Service
//
public class NewsBusiness implements NewsBusinessInterface {
	private  NewsRepo NewsRepos;
	@Autowired
	public NewsBusiness(NewsRepo repos) {
		this.NewsRepos = repos;
	}
	
	
	//@Override
	public List<News> getAll() {
		
	return (List<News>) NewsRepos.GetALL();
	
	}
	public Optional<News> getById(Integer x) {
		// TODO Auto-generated method stub
		
		
		return  NewsRepos.findById(x);
	}
}
