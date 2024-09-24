package com.btg.pactual.fondos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class FondosApplication {

	public static void main(String[] args) {
		SpringApplication.run(FondosApplication.class, args);
	}

}
