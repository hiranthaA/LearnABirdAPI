package com.example.LearnABirdAPI.repository;

import com.example.LearnABirdAPI.model.Bird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BirdRepository extends JpaRepository<Bird,Integer> {

}
