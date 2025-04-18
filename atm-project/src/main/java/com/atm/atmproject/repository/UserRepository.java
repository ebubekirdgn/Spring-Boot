package com.atm.atmproject.repository;

import com.atm.atmproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Kullanıcıyı kullanıcı adı ile bulma
    User findByUsername(String username);
}