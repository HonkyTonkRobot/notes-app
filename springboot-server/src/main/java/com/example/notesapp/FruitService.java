package com.example.notesapp;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    public List<String> getAllFruits() {
        // TODO: Implement database interaction to retrieve fruit data
        return List.of("apple", "banana", "orange"); // Placeholder
    }
}
