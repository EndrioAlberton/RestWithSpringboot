package com.example.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}