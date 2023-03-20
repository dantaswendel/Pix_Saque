package com.wendel.pixSaque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableJpaRepositories(basePackages = "com.wendel.pixSaque.repository")
@Configuration
public class PixSaqueApplication {

	public static void main(String[] args) {

		SpringApplication.run(PixSaqueApplication.class, args);
	}

}
