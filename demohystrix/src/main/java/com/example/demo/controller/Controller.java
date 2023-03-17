package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @Autowired
    ServiceLayer service;

    @GetMapping(value = "/test")
    public ResponseEntity<String> listAllUsers() {
        return new ResponseEntity<String>(service.getService(), HttpStatus.OK);
    }
}