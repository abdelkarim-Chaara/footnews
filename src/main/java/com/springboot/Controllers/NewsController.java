package com.springboot.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.business.NewsBusinessInterface;
import com.springboot.entities.News;

@RestController
@CrossOrigin

public class NewsController {
	private NewsBusinessInterface Business;
	
	@Autowired
	public NewsController(NewsBusinessInterface business) {
		this.Business = business;
	}

	
	
	@RequestMapping("/news")
   public List<News> getAll() {

	return (List<News>) Business.getAll();
	 
	   
   }
}
