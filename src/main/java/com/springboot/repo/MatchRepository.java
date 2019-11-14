package com.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Match;
@Repository
public interface MatchRepository extends CrudRepository< Match, Integer>{

}
