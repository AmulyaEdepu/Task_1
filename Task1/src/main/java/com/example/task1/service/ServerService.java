package com.example.task1.service;

import com.example.task1.model.Server;
import com.example.task1.repo.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServerService {

    @Autowired
    private ServerRepository repository;

    public List<Server> getAllServers() {
        return repository.findAll();
    }

    public Optional<Server> getServerById(String id) {
        return repository.findById(id);
    }

    public Optional<Server> getServerByName(String name) {
        return repository.findByName(name);
    }

    public Server saveServer(Server server) {
        return repository.save(server);
    }

    public void deleteServer(String id) {
        repository.deleteById(id);
    }
}
