package com.springboot.projet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication 

@ComponentScan
@EnableAutoConfiguration
@Configuration
@EnableTransactionManagement
@EntityScan("com.springboot.entities")
@EnableJpaRepositories("com.springboot.repo")
@ComponentScan("com.springboot.Controllers")

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainApplication.class, args);

	}

}
