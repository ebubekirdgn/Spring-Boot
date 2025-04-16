package com.example.bookproject.controller;

import com.example.bookproject.dto.BookDTO;
import com.example.bookproject.model.Book;
import com.example.bookproject.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

//    @PostMapping("/save-book")
//    public String saveBook(@RequestBody Book book) {
//        bookService.saveBook(book);
//        return "Kitap başarıyla kaydedildi!";
//    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return bookService.updateBook(id, updatedBook);
    }
    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @PostMapping("/save-book")
    public String saveBook(@RequestBody @Valid BookDTO bookDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "Validation Error: " + bindingResult.getAllErrors().toString();
        }
        bookService.saveBookFromDTO(bookDTO);
        return "Kitap başarıyla kaydedildi!";
    }

}
