package com.example.mybaticsspringbootstarters.controller;

import com.example.mybaticsspringbootstarters.document.TestHello;
import com.example.mybaticsspringbootstarters.model.Hello;
import com.example.mybaticsspringbootstarters.mongo.TestRepo;
import com.example.mybaticsspringbootstarters.service.HelloService;
import org.springframework.transaction.annotation.Transactional;
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
