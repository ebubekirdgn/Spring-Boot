package com.atm.atmproject.service;

import com.atm.atmproject.entity.Admin;
import com.atm.atmproject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin getAdminByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }
}
