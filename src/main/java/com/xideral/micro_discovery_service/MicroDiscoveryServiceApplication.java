package com.xideral.micro_discovery_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroDiscoveryServiceApplication.class, args);
	}

}
