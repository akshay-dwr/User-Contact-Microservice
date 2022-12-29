package com.api.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerUserContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerUserContactApplication.class, args);
	}

}
