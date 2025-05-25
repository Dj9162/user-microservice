package com.firstmicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(
		scanBasePackages = "com.firstmicroservices"
)
@EntityScan("com.firstmicroservices.model")
@EnableJpaRepositories("com.firstmicroservices.repo")
@ComponentScan("com.firstmicroservices")
public class FirstmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstmicroserviceApplication.class, args);
		System.out.println("Application started successfully");
	}

}
