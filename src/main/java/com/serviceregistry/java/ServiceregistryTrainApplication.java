package com.serviceregistry.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregistryTrainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregistryTrainApplication.class, args);
	}

}
