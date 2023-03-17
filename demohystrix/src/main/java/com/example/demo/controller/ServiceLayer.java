package com.example.demo.controller;

import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class ServiceLayer {
    @HystrixCommand(fallbackMethod = "fallbackmethod")
    public String getService() {
        final String uri = "http://localhost:9091/hello";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    private String fallbackmethod() {
        return "Service failed";
    }
}