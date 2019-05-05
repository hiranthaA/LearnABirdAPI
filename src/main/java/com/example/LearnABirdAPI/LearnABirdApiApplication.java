package com.example.LearnABirdAPI;

import com.example.LearnABirdAPI.model.Bird;
import com.example.LearnABirdAPI.repository.BirdRepository;
import com.example.LearnABirdAPI.service.BirdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

@SpringBootApplication
public class LearnABirdApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnABirdApiApplication.class, args);
	}
}
