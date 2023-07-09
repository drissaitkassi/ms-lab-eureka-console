package com.example.eurcon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurConApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurConApplication.class, args);
	}

}
