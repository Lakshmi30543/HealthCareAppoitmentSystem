package com.project.fsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.fsd.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {
    Admin findByUsernameAndPassword(String username, String password);
}
