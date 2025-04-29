package com.atm.atmproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Admin ID'si

    private String username;  // Admin adı
    private String password;  // Admin şifresi

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)  // Admin'e bağlı kullanıcılar
    private List<User> users;  // Admin'e bağlı kullanıcılar

    // Diğer admin özellikleri eklenebilir
}
