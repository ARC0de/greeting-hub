package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.repo.GreetingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/greetings")
@CrossOrigin(origins = "http://localhost:3000") // Allow React app to call
public class GreetingController {

    private final GreetingRepository greetingRepository;

    public GreetingController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    // ✅ GET: fetch all greetings
    @GetMapping
    public List<Greeting> getAllGreetings() {
        return greetingRepository.findAll();
    }

    // ✅ POST: create a new greeting
    @PostMapping
    public Greeting createGreeting(@RequestBody Greeting greeting) {
        return greetingRepository.save(greeting);
    }
}
