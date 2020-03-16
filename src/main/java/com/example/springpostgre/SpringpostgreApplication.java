package com.example.springpostgre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringpostgreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpostgreApplication.class, args);
	}

}
