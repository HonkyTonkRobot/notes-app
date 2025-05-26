package com.example.notesapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FruitController {

    @Autowired
    private FruitService fruitService;

    @GetMapping("/")
    public List<String> getAllFruits() {
        return fruitService.getAllFruits();
    }
}
