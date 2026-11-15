package com.example.BOOK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.BOOK.modal.Book;
import org.springframework.ui.Model;
import com.example.BOOK.service.BookService;
@Controller
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    public BookController(BookService bookService){
        this.bookService=bookService;
    }
    @GetMapping
    public String getBooks(Model model){
        model.addAttribute("books",bookService.getAllBooks());
        return "books";
    }
    @GetMapping("/new")
    public String createBookForm(Model model){
        model.addAttribute("books",new Book());
        return "books-form";
    }
    @PostMapping
    public String saveBook(@ModelAttribute Book book){
        bookService.createBook(book);
        return "redirect:/books";
    }
}
