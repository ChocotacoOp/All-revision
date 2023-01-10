package com.masai.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
