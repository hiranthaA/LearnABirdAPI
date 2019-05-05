package com.example.LearnABirdAPI.controller;

import com.example.LearnABirdAPI.model.Bird;
import com.example.LearnABirdAPI.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bird")
public class BirdController {

    @Autowired
    private BirdService birdService;

    @RequestMapping(value = "/add", method= RequestMethod.POST)
    public Bird addBird(@RequestBody Bird bird){
        byte[] byteset = "Any String you want".getBytes();
        return  birdService.addBird(bird);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public List<Bird> getBirds(){
        return birdService.getBirds();
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public void initData(){
        birdService.initData();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testapi(){
        return "test ok";
    }
}