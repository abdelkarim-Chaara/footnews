package com.springboot.news;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
	
	@RequestMapping("/news")
   public String getAll() {
	return "TEST";
	   
	   
	   
   }
}
