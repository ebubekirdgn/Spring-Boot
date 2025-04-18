package com.atm.atmproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Kullanıcı ID'si

    private String username;  // Kullanıcı adı
    private String password;  // Şifre

    @ManyToOne
    @JoinColumn(name = "admin_id")  // Admin ile ilişki kurmak için
    private Admin admin;  // Admin ile ilişki

    private double balance;  // Kullanıcının hesabındaki bakiye

    // Diğer alanlar eklenebilir (telefon, email, vs.)
}

