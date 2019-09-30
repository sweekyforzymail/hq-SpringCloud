package com.hq.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_1 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer_1.class, args);
	}
}
