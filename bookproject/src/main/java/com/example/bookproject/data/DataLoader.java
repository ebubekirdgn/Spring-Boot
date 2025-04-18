package com.example.bookproject.data;

import com.example.bookproject.model.Book;
import com.example.bookproject.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        if (bookRepository.count() == 0) {
            List<Book> books = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                Book book = new Book();
                book.setTitle("Kitap " + i);
                book.setAuthor("Yazar " + (i % 50)); // 50 farklı yazar
                books.add(book);
            }
            bookRepository.saveAll(books);
            System.out.println("📚 1000 kitap başarıyla eklendi.");
        }
    }
}