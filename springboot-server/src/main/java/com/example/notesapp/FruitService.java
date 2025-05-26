package com.example.notesapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FruitService {

    @Autowired
    private FruitRepository fruitRepository;

    public List<String> getAllFruits() {
        return fruitRepository.findAll().stream().map(Fruit::getName).collect(Collectors.toList());
    }
}
