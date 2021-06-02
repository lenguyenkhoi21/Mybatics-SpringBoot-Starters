package com.example.mybaticsspringbootstarters.service;

import com.example.mybaticsspringbootstarters.document.TestHello;
import com.example.mybaticsspringbootstarters.mapper.HelloMapper;
import com.example.mybaticsspringbootstarters.model.Hello;
import com.example.mybaticsspringbootstarters.mongo.TestRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class HelloService {
    private final HelloMapper helloMapper;
    private final TestRepo testRepo;

    public HelloService(HelloMapper helloMapper, TestRepo testRepo) {
        this.helloMapper = helloMapper;
        this.testRepo = testRepo;
    }

    @Transactional
    public void insertHello(Hello hello) {
        helloMapper.insertHello(hello);
        TestHello testHello = TestHello.builder()
                                       .helloId(hello.getName())
                                       .build();

        testRepo.save(testHello);
    }

}
