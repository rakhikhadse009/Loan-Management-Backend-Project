package com.cjc.enquiryclient.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class EnquiryclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnquiryclientApplication.class, args);
	}

}
