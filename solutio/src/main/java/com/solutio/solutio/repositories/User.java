package com.solutio.solutio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface User extends JpaRepository<User, Long> {
    Optional <User> findByUsername(String username);
}
