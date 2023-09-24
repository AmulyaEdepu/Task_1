package com.example.task1.controller;

import com.example.task1.model.Server;
import com.example.task1.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class ServerController {

    @Autowired
    private ServerService service;

    @GetMapping("/servers")
    public List<Server> getServers(@RequestParam(required = false) String name) {
        if (name != null) {
            Optional<Server> server = service.getServerByName(name);
            return server.map(List::of).orElse(List.of());
        }
        return service.getAllServers();
    }

    @PutMapping("/server")
    public Server addServer(@RequestBody Server server) {
        return service.saveServer(server);
    }

    @DeleteMapping("/server/{id}")
    public void deleteServer(@PathVariable String id) {
        service.deleteServer(id);
    }

    @PostMapping("/server/{id}")
    public Server updateServer(@PathVariable String id, @RequestBody Server serverUpdates) {
        Optional<Server> serverOptional = service.getServerById(id);
        if(serverOptional.isPresent()) {
            Server server = serverOptional.get();
            server.setName(serverUpdates.getName());
            server.setDescription(serverUpdates.getDescription());
            return service.saveServer(server);
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Server Not Found");
    }

}
