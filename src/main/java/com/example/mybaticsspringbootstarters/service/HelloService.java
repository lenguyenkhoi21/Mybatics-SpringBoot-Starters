package com.example.mybaticsspringbootstarters.service;

import com.example.mybaticsspringbootstarters.mapper.HelloMapper;
import com.example.mybaticsspringbootstarters.model.Hello;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class HelloService {
    private final HelloMapper helloMapper;

    public HelloService(HelloMapper helloMapper) {
        this.helloMapper = helloMapper;
    }

    @Transactional
    public void insertHello(Hello hello) {
        helloMapper.insertHello(hello);
        helloMapper.insertHello(hello);
    }

}
