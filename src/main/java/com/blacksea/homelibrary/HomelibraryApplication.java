package com.blacksea.homelibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="com.blacksea.homelibrary.domain")
@EnableJpaRepositories(basePackages="com.blacksea.homelibrary.repository")
public class HomelibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomelibraryApplication.class, args);
	}
}
