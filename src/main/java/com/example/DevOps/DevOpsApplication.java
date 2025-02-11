package com.example.DevOps;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevOpsApplication {

	public static void main(String[] args) {

//		Dotenv dotenv = Dotenv.load();
////		System.out.println("JDBC URL: " + System.getenv("DATASOURCE_URL"));
//
//
//		System.setProperty("spring.datasource.url", dotenv.get("DATASOURCE_URL"));
//		System.setProperty("spring.datasource.username", dotenv.get("DATASOURCE_USERNAME"));
//		System.setProperty("spring.datasource.password", dotenv.get("DATASOURCE_PASSWORD"));
		SpringApplication.run(DevOpsApplication.class, args);
	}


}
