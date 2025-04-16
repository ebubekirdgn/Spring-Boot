package com.example.bookproject.repository;

import com.example.bookproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Buraya özel sorgular ekleyebilirsiniz, örneğin:
    // List<Book> findByAuthor(String author);
}