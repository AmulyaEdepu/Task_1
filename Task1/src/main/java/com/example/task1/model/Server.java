package com.example.task1.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Objects;

@Document(collection = "serever")
public class Server {

    @Id

    private String id;
    private String name;
    private String description;

    public Server(){

    }

    public Server(String name, String description){
        this.name=name;
        this.description=description;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    // OverRiding to a String
    @Override
    public String toString() {
        return "Server{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


    // Override equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Server server = (Server) o;
        return Objects.equals(id, server.id) &&
                Objects.equals(name, server.name) &&
                Objects.equals(description, server.description);
    }

    // Override hashCode

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }


}
