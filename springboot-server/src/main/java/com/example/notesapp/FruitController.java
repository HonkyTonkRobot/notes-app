package com.example.notesapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitController {

    @GetMapping("/")
    public List<String> getAllFruits() {
        // TODO: Implement service to retrieve fruit data from the database
        return List.of("apple", "banana", "orange"); // Placeholder
    }
}
