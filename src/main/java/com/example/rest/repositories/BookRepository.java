package com.example.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}