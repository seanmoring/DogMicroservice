package com.udacity.microservice.DogMicroservice.repository;

import com.udacity.microservice.DogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;


public interface DogRepository extends CrudRepository<Dog, Long> {
}
