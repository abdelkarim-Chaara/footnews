package com.springboot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.entities.Match;

import com.springboot.business.MatchBusinessInterface;

@RestController

@RequestMapping("/match")
public class MatchController {

	private MatchBusinessInterface business; 
	@Autowired
	public MatchController (MatchBusinessInterface businessinterface ) {
		
		this.business=businessinterface;
		
	}
	
	public MatchController ( ) {

	}

	
	public List<Match> GetAll() {
		
		return business.getall();
		
	}
	
	

}
