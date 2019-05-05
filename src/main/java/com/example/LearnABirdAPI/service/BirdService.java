package com.example.LearnABirdAPI.service;

import com.example.LearnABirdAPI.model.Bird;

import java.util.List;

public interface BirdService {
    Bird addBird(Bird bird);

    List<Bird> getBirds();

    void initData();
}
