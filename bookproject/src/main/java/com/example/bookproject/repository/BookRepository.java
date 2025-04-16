package com.example.bookproject.repository;

import com.example.bookproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // Buraya özel sorgular ekleyebilirsiniz, örneğin:
    // List<Book> findByAuthor(String author);

    // Custom Query: Başlığa göre kitap arama
    @Query("SELECT b FROM Book b WHERE b.title LIKE CONCAT('%', :title, '%')")
    List<Book> findByTitleContaining(String title);
}