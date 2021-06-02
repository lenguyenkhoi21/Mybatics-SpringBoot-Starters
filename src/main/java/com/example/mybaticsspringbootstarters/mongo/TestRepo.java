package com.example.mybaticsspringbootstarters.mongo;

import com.example.mybaticsspringbootstarters.document.TestHello;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepo extends MongoRepository<TestHello, String> {

}
