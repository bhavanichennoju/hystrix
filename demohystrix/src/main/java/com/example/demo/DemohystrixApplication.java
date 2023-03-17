package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
@SpringBootApplication
@EnableCircuitBreaker
/*
 * The @EnableCircuitBreaker annotation will scan 
 * the classpath for any compatible Circuit Breaker implementation.
 */
public class DemohystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohystrixApplication.class, args);
	}

}
