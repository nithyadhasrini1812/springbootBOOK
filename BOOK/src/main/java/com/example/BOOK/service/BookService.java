package com.example.BOOK.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.BOOK.Repository.BookRepository;
import com.example.BOOK.modal.Book;
@Service
public class BookService{
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public List<Book>getAllBooks(){
        return bookRepository.findAll();
    }
    public Book createBook(Book book){
        return bookRepository.save(book);
    }
}