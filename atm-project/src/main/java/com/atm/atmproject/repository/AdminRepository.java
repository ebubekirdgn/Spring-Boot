package com.atm.atmproject.repository;

import com.atm.atmproject.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    // Admin'i kullanıcı adı ile bulma
    Admin findByUsername(String username);
}