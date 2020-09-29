package com.we_smorgasbord.potluck_api.repository;

import com.we_smorgasbord.potluck_api.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String Name);  
}
