package com.example.mybaticsspringbootstarters.controller;

import com.example.mybaticsspringbootstarters.model.Hello;
import com.example.mybaticsspringbootstarters.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @PostMapping("/hello")
    public void doPost(@RequestBody Hello hello) {
        service.insertHello(hello);
    }
}
