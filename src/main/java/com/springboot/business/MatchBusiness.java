package com.springboot.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Match;
import com.springboot.repo.MatchRepository;

@Service
public class MatchBusiness implements MatchBusinessInterface {

	private MatchRepository matchrepo ; 
	
	@Autowired
	
	public MatchBusiness (MatchRepository rep ) {
		this.matchrepo=rep;
		}
	public MatchBusiness ( ) {
		
		}
	@Override
	public List<Match> getall() {
		// TODO Auto-generated method stub
		return (List<Match>) matchrepo.findAll();
	}
	
	
}
