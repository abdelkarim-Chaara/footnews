package com.springboot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springboot.entities.News;

@Repository
public interface NewsRepository  extends CrudRepository< News, Integer> {

	@Query(value = "select news.* from news", nativeQuery = true)
	List<News> GetALL();

	
}
