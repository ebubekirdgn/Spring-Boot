package com.example.bookproject.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;


@Getter
@Setter
public class BookDTO {

    @NotNull(message = "Başlık boş olamaz.")
    @Size(min = 2, max = 100, message = "Başlık en az 2 karakter olmalı ve en fazla 100 karakter olmalı.")
    private String title;

    @NotNull(message = "Yazar adı boş olamaz.")
    @Size(min = 2, max = 50, message = "Yazar adı en az 2 karakter olmalı ve en fazla 50 karakter olmalı.")
    private String author;
}