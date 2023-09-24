package com.example.task1.repo;

import com.example.task1.model.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface ServerRepository extends MongoRepository<Server, String> {
    Optional<Server> findByName(String name);
}
