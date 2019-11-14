package com.springboot.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.business.NewsBusinessInterface;
import com.springboot.entities.News;

@RestController
@CrossOrigin

public class NewsController {
	@Autowired
	private NewsBusinessInterface Business;
	
	public NewsController(NewsBusinessInterface business) {
		this.Business = business;
	}

	//@RequestMapping("/news")
	@RequestMapping(method = RequestMethod.GET , value="/" )
   public List<News> getAll() {

	return (List<News>) Business.getAll();
	 
	   
   }
}
