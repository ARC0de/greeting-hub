package com.example.demo.service;

import com.example.demo.model.Greeting;
import com.example.demo.repo.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    private final GreetingRepository repo;

    public GreetingService(GreetingRepository repo) {
        this.repo = repo;
    }

    public Greeting createGreeting(String name) {
        Greeting g = new Greeting(name, "Hello, " + name + "!");
        return repo.save(g);
    }

    public List<Greeting> getAllGreetings() {
        return repo.findAll();
    }
}
