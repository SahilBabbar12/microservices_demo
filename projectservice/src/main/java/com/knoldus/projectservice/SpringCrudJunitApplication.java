package com.knoldus.projectservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringCrudJunitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudJunitApplication.class, args);
	}

}
