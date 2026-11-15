package com.example.BOOK.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BOOK.modal.Book;

public interface 
BookRepository extends JpaRepository<Book,Integer> {

    

    
}
