package com.medicalStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medicalStore.repository.AdminRepository;
import com.medicalStore.exception.AdminNotFoundException;
import com.medicalStore.entity.Admin;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Get all admins
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // Get admin by ID
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id)
                              .orElseThrow(() -> new AdminNotFoundException("Admin not found"));
    }

    // Save a new admin
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Delete admin by ID
    public void deleteAdminById(Long id) {
        adminRepository.deleteById(id);
    }

    // Additional method for getting admin by username
    // Uncomment this method if you have it implemented in your repository
//    public Admin getAdminByUsername(String username) {
//        return adminRepository.findByUsername(username);
//    }
}
